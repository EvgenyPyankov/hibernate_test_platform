package db.DAOImpl;

import db.DAO.UserDAO;
import db.HibernateUtil;
import db.entity.User;
import org.hibernate.Query;
import org.hibernate.Session;

import java.sql.SQLException;

import java.text.Format;
import java.util.List;

public class UserDAOImpl implements UserDAO {
    public void addUser(User user) throws SQLException {
        Session session = null;

            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();

            if (session != null && session.isOpen()) {
                session.close();
            }

    }

    public User getUserByEmail(String email) throws SQLException {
        Session session = null;
        List<User> results= null;

            session = HibernateUtil.getSessionFactory().openSession();
            String hql = String.format("FROM User E WHERE E.email = '%s'",email);
            Query query = session.createQuery(hql);
            results = query.list();
            if (results!=null) return results.get(0);

            if (session != null && session.isOpen()) {
                session.close();
            }

        return null;
    }

    public User getUserByLogin(String login) throws SQLException {
        Session session = null;
        List<User> results= null;

            session = HibernateUtil.getSessionFactory().openSession();
            String hql = String.format("FROM User E WHERE E.login = '%s'",login);
            Query query = session.createQuery(hql);
            results = query.list();
            if (results!=null) return results.get(0);

            if (session != null && session.isOpen()) {
                session.close();
            }
        return null;
    }
}
