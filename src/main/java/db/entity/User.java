package db.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    private int idUser;
    private String login;
    private Set<Test> tests = new HashSet<Test>();

    public User(){}

    public User(String login, Set<Test> tests){
        this.login = login;
        this.tests=tests;
    }

    public void addTest(Test test){
        tests.add(test);
    }

    @Id
    @Column(name = "id_user")
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Column(name = "login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @ManyToMany(mappedBy = "users")
    public Set<Test> getTests() {
        return tests;
    }

    public void setTests(Set tests) {
        this.tests = tests;
    }
}
