package db.DAOImpl;

import db.DAO.TestDAO;
import db.HibernateUtil;
import db.entity.Test;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.*;

public class TestDAOImpl implements TestDAO {
    public void addTest(Test test) throws SQLException {
        Session session = null;
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(test);
        session.getTransaction().commit();
        if (session != null && session.isOpen()) {
            session.close();

        }
    }

    public Test getTestById(Test test) throws SQLException {
        return null;
    }

    public List<Test> getTests() throws SQLException {

        Session session = null;
        List<Test> tests = null;
        session = HibernateUtil.getSessionFactory().openSession();
        tests = session.createCriteria(Test.class).list();
        return tests;
    }
}
