package io.github.aasaru.drools.domain;

import java.util.Objects;

public class InvalidDay {
    private Day day;

    public InvalidDay(Day day) {
        this.day = day;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "InvalidDay{" +
                "invalidDay=" + day +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvalidDay that = (InvalidDay) o;
        return Objects.equals(day, that.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day);
    }
}
