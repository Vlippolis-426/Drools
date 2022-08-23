package io.github.aasaru.drools.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Week {
    public int countDrivingTimeExceeded=0;

    public List<Drive> driveList;

    private ArrayList<Day> dayList;

    public int getDrivingTimeExceeded() {
        return countDrivingTimeExceeded;
    }

    public void setDrivingTimeExceeded(int countDrivingTimeExceeded) {
        this.countDrivingTimeExceeded = countDrivingTimeExceeded;
    }

    public Week(List<Drive> driveList, ArrayList<Day> dayList) {
        this.driveList = driveList;
        this.dayList = dayList;
    }

    @Override
    public String toString() {
        return "Week{" +
                "countDrivingTimeExceeded=" + countDrivingTimeExceeded +
                ", First Drive=" + driveList.get(0) +
                "Last Drive= " + driveList.get(driveList.size()-1)+
                '}';
    }

    /*public boolean isBefore(Week week)
    {
        if(!week.driveList.get(0).getStart().isAfter(this.driveList.get(driveList.size()).getStart()))
    }*/

    public int weeklyDrivingTime(){
        Iterator <Drive> iterator = driveList.iterator();
        int sum=0;

        while(iterator.hasNext())
        {
           Drive driveTmp = iterator.next();
           sum+=driveTmp.deltaTime();

        }

        return sum;

    }

    public int getCountDrivingTimeExceeded() {
        return countDrivingTimeExceeded;
    }

    public void setCountDrivingTimeExceeded(int countDrivingTimeExceeded) {
        this.countDrivingTimeExceeded = countDrivingTimeExceeded;
    }

    public ArrayList<Day> getDayList() {
        return dayList;
    }

    public void setDayList(ArrayList<Day> dayList) {
        this.dayList = dayList;
    }
}
