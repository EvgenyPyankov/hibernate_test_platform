package db.entity;

public class Answer {
    private int idAnswer;
    private String title;
    private int number;
    private int idQueestion;

    public Answer(){}

    public Answer(String title, int number, int idQueestion) {
        this.title = title;
        this.number = number;
        this.idQueestion = idQueestion;
    }
}
