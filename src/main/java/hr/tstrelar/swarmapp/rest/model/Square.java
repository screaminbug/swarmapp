package hr.tstrelar.swarmapp.rest.model;

public class Square {
    private String operation = "Square of ";
    private double answer;


    public Square(double problem) {
        this.answer = problem * problem;
        this.operation += problem;
    }

    public double getAnswer() {
        return answer;
    }

    public String getOperation() {
        return operation;
    }
}
