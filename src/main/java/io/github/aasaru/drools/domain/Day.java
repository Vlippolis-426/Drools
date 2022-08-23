package io.github.aasaru.drools.domain;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Day {
    ArrayList<Drive> dailyDrive = new ArrayList<>();

    public Day(ArrayList<Drive> dailyDrive) {
        this.dailyDrive = dailyDrive;
    }

    public ArrayList<Drive> getDailyDrive() {
        return dailyDrive;
    }

    public void setDailyDrive(ArrayList<Drive> dailyDrive) {
        this.dailyDrive = dailyDrive;
    }

    @Override
    public String toString() {
        return "Day{" +
                "dailyDrive=" + dailyDrive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Day day = (Day) o;
        return Objects.equals(dailyDrive, day.dailyDrive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dailyDrive);
    }

    public int totalDailyDrivingTime()
    {
        Iterator<Drive> iterator = dailyDrive.iterator();
        int totalTime=0;

        while (iterator.hasNext())
        {
            Drive tmpDrive = iterator.next();
            totalTime+=tmpDrive.deltaTime();

        }

        return totalTime;
    }
}

