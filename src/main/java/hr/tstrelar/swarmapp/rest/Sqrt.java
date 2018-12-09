package hr.tstrelar.swarmapp.rest;

public class Sqrt {
    double answer;

    public Sqrt(double problem) {
        this.answer = Math.sqrt(problem);
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }
}
