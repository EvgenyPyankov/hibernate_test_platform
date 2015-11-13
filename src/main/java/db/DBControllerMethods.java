package db;

import db.entity.*;

import java.sql.SQLException;
import java.util.List;

public interface DBControllerMethods {
    //put methods you need here

    //tests
    Test getTestById(int id) throws SQLException;
    List<Test> getTests() throws SQLException;
    void addTest(Test test) throws SQLException;
    void addPassedTest(Test test, User user) throws SQLException;
    Test getPassedTest(Test test,User user) throws SQLException;


    //users
    void addUser(User user) throws SQLException;
    User getUserByLogin(String login) throws SQLException;
    User getUserByEmail(String email) throws SQLException;
    User getUserById(int id) throws SQLException;
}
