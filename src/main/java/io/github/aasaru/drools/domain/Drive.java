package io.github.aasaru.drools.domain;
import java.time.LocalDateTime;
import java.util.Objects;

public class Drive {
    private LocalDateTime start, end;
    public int drivingTime;

    public Drive(LocalDateTime start, LocalDateTime end) {
        this.end=end;
        this.start=start;
        drivingTime=deltaTime();
    }

    @Override
    public String toString() {
        return "Drive{" +
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drive drive = (Drive) o;
        return Objects.equals(start, drive.start) && Objects.equals(end, drive.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }


}
