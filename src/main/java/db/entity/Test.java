package db.entity;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.QEncoderStream;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tests")
public class Test {
    private int idTest;
    private String title;
    private TestCategory testCategory;
    private Set<Question>questions = new HashSet<Question>();
   // private Set<User> users = new HashSet<User>();



    public Test(){}

    public Test(String title, TestCategory testCategory,Set<Question> questions){
        this.title = title;
        this.testCategory=testCategory;
        this.questions=questions;
       // this.users=users;
    }

//    public void addUser(User user){
//        users.add(user);
//    }

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

    @Column(name = "test_category")
    @Enumerated(EnumType.STRING)
    public TestCategory getTestCategory() {
        return testCategory;
    }

    public void setTestCategory(TestCategory testCategory) {
        this.testCategory = testCategory;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "test")
    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

//    @ManyToMany(cascade=CascadeType.ALL)
//    @JoinTable(name="user_pass", joinColumns = { @JoinColumn(name = "id_test") }, inverseJoinColumns = { @JoinColumn(name = "id_user") })
//    public Set<User> getUsers() {
//        return users;
//    }
//
//    public void setUsers(Set users) {
//        this.users = users;
//    }


    @Override
    public String toString() {
        return "Test{" +
                "idTest=" + idTest +
                ", title='" + title + '\'' +
                ", testCategory=" + testCategory +
                ", questions=" + questions +
                '}';
    }


}
