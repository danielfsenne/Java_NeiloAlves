package com.webservice.course.service;

import com.webservice.course.entities.User;
import com.webservice.course.repositories.UserRepository;
import com.webservice.course.service.exceptions.DataBaseException;
import com.webservice.course.service.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User obj){
        return repository.save(obj);
    }

    public User delete(Long id){
        try{
            repository.deleteById(id);
        }
        catch (EmptyResultDataAccessException e){
            throw new ResourceNotFoundException(id);
        }
        catch (DataIntegrityViolationException e){
            throw new DataBaseException(e.getMessage());
        }
        return null;
    }

    public User update(Long id, User obj){
        try{
            User entity = repository.getReferenceById(id);
            updateData(entity, obj);
        }
        catch (EntityNotFoundException e){
            e.printStackTrace();
            throw new ResourceNotFoundException(id);
        }
        return obj;
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
