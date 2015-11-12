package db.DAO;

import db.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {
    public void addUser(User user) throws SQLException;

    public User getUserByEmail(String email) throws SQLException;

    public User getUserByLogin(String login) throws SQLException;

}
