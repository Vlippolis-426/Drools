package io.github.aasaru.drools.domain;

import java.util.Objects;

public class InvalidWeek {
    private Week week;

    public InvalidWeek(Week week)
    {
        this.week=week;
    }

    public Week getWeek() {
        return week;
    }

    public void setWeek(Week w) {
        this.week = week;
    }

    @Override
    public String toString() {
        return "InvalidWeek{" +
                "week=" + week +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvalidWeek that = (InvalidWeek) o;
        return Objects.equals(week, that.week);
    }

    @Override
    public int hashCode() {
        return Objects.hash(week);
    }
}
