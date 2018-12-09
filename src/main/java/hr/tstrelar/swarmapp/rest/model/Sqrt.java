package hr.tstrelar.swarmapp.rest.model;

public class Sqrt {
    private String operation = "Square root of ";
    private double answer;


    public Sqrt(double problem) {
        this.answer = Math.sqrt(problem);
        this.operation += problem;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    public String getOperation() {
        return operation;
    }
}
