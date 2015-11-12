package db.DAO;

import java.sql.*;
import db.entity.*;
import java.util.*;

public interface TestDAO {
    public void addTest(Test test) throws SQLException;

    public Test getTestById(Test test) throws SQLException;

    public List<Test> getTests() throws SQLException;
}

