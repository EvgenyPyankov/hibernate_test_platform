package db.DAO;

import java.sql.*;
import db.entity.Test;
import db.entity.User;

import java.util.*;

public interface TestDAO {
    void addTest(Test test) throws SQLException;

    Test getTestById(int id) throws SQLException;

    List<Test> getTests() throws SQLException;

    void addPassedTest(Test test, User user) throws SQLException;

    Test getPassedTest(Test test, User user) throws SQLException;
}

