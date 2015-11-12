package db.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "questions")
public class Question {
    private int idQuestion;
    private String title;
    private int number;
    private Test test;
    private Set<Answer> answers = new HashSet<Answer>();

    public Question(){}

    public Question(int number,String title, Set<Answer> answers,Test test) {
        this.title = title;
        this.number = number;
        this.test=test;
        this.answers = answers;
    }

    public Question(int number, String title, Set<Answer>answers){
        this.title = title;
        this.number = number;
        this.answers = answers;
    }

    @Id
    @Column(name = "id_question")
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    @Column(name="title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name="number")
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_test", nullable = false)
    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "question")
    public Set<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<Answer> answers) {
        this.answers = answers;
    }
}
