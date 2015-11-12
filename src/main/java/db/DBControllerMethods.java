package db;

import db.entity.*;

import java.sql.SQLException;
import java.util.List;
import java.util.*;

public interface DBControllerMethods {
    //put methods you need here

    //tests
    Test getTestById(int id);
    List<Test> getTests();
    void addTest(Test test);


    //users
    void addUser(User user);
    User getUserByLogin(String login);
    User getUserByEmail(String email);
}
