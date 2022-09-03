package io.github.aasaru.drools.domain;

import java.time.LocalDateTime;
import java.util.Objects;

public class Break {
    private LocalDateTime start;
    private LocalDateTime end;
    private int totalTime;
    private Break aBreak;


    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Break aBreak = (Break) o;
        return Objects.equals(start, aBreak.start) && Objects.equals(end, aBreak.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    @Override
    public String toString() {
        return "Break{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    public int deltaTime()
    {
        int minutesStart = start.getHour()*60 + start.getMinute();
        int minutesEnd = end.getHour()*60 + end.getMinute();

        return minutesEnd-minutesStart;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public Break getBreak() {
        return aBreak;
    }

    public void setBreak(Break aBreak) {
        this.aBreak = aBreak;
    }
}

