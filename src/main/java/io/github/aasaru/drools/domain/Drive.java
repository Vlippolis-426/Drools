package io.github.aasaru.drools.domain;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

public class Drive {
    private LocalDateTime start, end;
    public int drivingTime;

    private Break aBreak;
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

    public boolean isConsecutive(Drive drive, ArrayList<Drive> drives) {//Vede se due drive, all'interno del'array "dailyDrive" della classe Day, siano consecutive o meno
        int i1, i2;
        i1=drives.indexOf(drive);
        i2=drives.indexOf(this);

        if(Math.abs(i1-i2)==1)return true;

        return false;

    }

    public int getDrivingTime() {
        return drivingTime;
    }

    public void setDrivingTime(int drivingTime) {
        this.drivingTime = drivingTime;
    }

    public Break getBreak() {
        return aBreak;
    }

    public void setBreak(Break aBreak) {
        this.aBreak = aBreak;
    }
}
