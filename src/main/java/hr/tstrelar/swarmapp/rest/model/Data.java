package hr.tstrelar.swarmapp.rest.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Data {
    private final int id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ssX")
    private final Date currentDate;
    private final String someText;
    private final double someDouble;

    private Data(int id, Date currentDate, String someText, double someDouble) {
        this.id = id;
        this.currentDate = currentDate;
        this.someText = someText;
        this.someDouble = someDouble;
    }

    public int getId() {
        return id;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public String getSomeText() {
        return someText;
    }

    public double getSomeDouble() {
        return someDouble;
    }

    public static class Builder {
        private int id;
        private Date currentDate;
        private String someText;
        private double someDouble;

        public static Builder create() {
            return new Builder();
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder date(Date date) {
            this.currentDate = date;
            return this;
        }

        public Builder text(String text) {
            this.someText = text;
            return this;
        }

        public Builder aDouble(double someDouble) {
            this.someDouble = someDouble;
            return this;
        }

        public Data build() {
            return new Data(id, currentDate, someText, someDouble);
        }


    }
}
