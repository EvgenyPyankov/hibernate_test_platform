package db;

import db.DAO.*;
import db.DAOImpl.*;

public class Factory {
    private static TestDAO testDAO = null;

    private static Factory instance = null;

    public static synchronized Factory getInstance(){
        if (instance == null){
            instance = new Factory();
        }
        return instance;
    }

    public TestDAO getTestDAO(){
        if (testDAO == null){
            testDAO = new TestDAOImpl();
        }
        return testDAO;
    }
}
