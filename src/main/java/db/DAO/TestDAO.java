package db.DAO;

import java.sql.*;
import db.entity.Test;
import java.util.*;

public interface TestDAO {
    public void addTest(Test test) throws SQLException;

    public Test getTestById(int id) throws SQLException;

    public List<Test> getTests() throws SQLException;
}

