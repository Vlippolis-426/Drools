package io.github.aasaru.drools.domain;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Rest {
    private LocalDateTime start;
    private LocalDateTime end;

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
        Rest rest = (Rest) o;
        return Objects.equals(start, rest.start) && Objects.equals(end, rest.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    @Override
    public String toString() {
        return "Rest{" +
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
}
