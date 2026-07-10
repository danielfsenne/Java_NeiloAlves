package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static Object createSellerDao(){
        return new SellerDaoJDBC();
    }
}
