package io.github.aasaru.drools.domain;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Day {
    private ArrayList<Drive> dailyDrive = new ArrayList<>();


    public ArrayList<Drive> getDailyDrive() {
        return dailyDrive;
    }
    private ArrayList<Break> breakList = new ArrayList<>();
    private ArrayList<WeeklyRest> weeklyRestList = new ArrayList<>();
    private ArrayList<DailyRest> dailyRestList = new ArrayList<>();

    public void setDailyDrive(ArrayList<Drive> dailyDrive) {
        this.dailyDrive = dailyDrive;
    }

    @Override
    public String toString() {
        return "Day{" +
                "dailyDrive=" + dailyDrive +
                '}' + totalDailyDrivingTime();
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
            System.out.println("Delta time: " + tmpDrive.deltaTime());
            totalTime+=tmpDrive.deltaTime();

        }

        return totalTime;
    }



    public ArrayList<Break> getBreakList() {
        return breakList;
    }

    public void setBreakList(ArrayList<Break> breakList) {
        this.breakList = breakList;
    }

    public ArrayList<WeeklyRest> getWeeklyRestList() {
        return weeklyRestList;
    }

    public void setWeeklyRestList(ArrayList<WeeklyRest> weeklyRestList) {
        this.weeklyRestList = weeklyRestList;
    }

    public ArrayList<DailyRest> getDailyRestList() {
        return dailyRestList;
    }

    public void setDailyRestList(ArrayList<DailyRest> dailyRestList) {
        this.dailyRestList = dailyRestList;
    }
}

