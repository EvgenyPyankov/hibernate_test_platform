package db.entity;

import javax.persistence.*;

@Entity
@Table(name = "answers")
public class Answer {

    private int idAnswer;

    private String title;

    private int number;

    private Question question;

    public Answer(){}

    public Answer(String title, int number, Question question) {
        this.title = title;
        this.number = number;
        this.question = question;
    }

    @Id
    @Column(name = "id_answer")
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int getIdAnswer() {
        return idAnswer;
    }

    public void setIdAnswer(int idAnswer) {
        this.idAnswer = idAnswer;
    }

    @Column(name="number")
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Column(name="title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_question", nullable = false)
    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
