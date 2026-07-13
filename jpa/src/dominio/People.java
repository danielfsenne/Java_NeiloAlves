package dominio;

import java.io.Serializable;

public class People implements Serializable {

    private Integer id;
    private String name;
    private String email;

    public People(){
    }

    public People(Integer id, String name, String email){
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
