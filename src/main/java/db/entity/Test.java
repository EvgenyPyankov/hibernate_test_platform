package db.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tests")
public class Test {
    private int idTest;
    private String title;
    private Set<User> users = new HashSet<User>();

    public Test(){}

    public Test(String title, Set users){
        this.title = title;
        this.users=users;
    }

    public void addUser(User user){
        users.add(user);
    }

    @Id
    @Column(name = "id_test")
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int getIdTest() {
        return idTest;
    }

    public void setIdTest(int idTest) {
        this.idTest = idTest;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="user_pass", joinColumns = { @JoinColumn(name = "id_test") }, inverseJoinColumns = { @JoinColumn(name = "id_user") })
    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set users) {
        this.users = users;
    }


}
