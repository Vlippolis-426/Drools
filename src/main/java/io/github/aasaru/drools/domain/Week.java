package io.github.aasaru.drools.domain;

import java.time.*;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class Week {
    public int countDrivingTimeExceeded=0;

    public ArrayList<Day> dayList = new ArrayList<>();

    public int getDrivingTimeExceeded() {
        return countDrivingTimeExceeded;
    }

    public void setDrivingTimeExceeded(int countDrivingTimeExceeded) {
        this.countDrivingTimeExceeded = countDrivingTimeExceeded;
    }

    @Override
    public String toString() {
        return "Week{" +
                "countDrivingTimeExceeded=" + countDrivingTimeExceeded +
                //", First Drive=" + driveList.get(0) +
                //"Last Drive= " + driveList.get(driveList.size()-1)+
                '}';
    }

    /*public boolean isBefore(Week week)
    {
        if(!week.driveList.get(0).getStart().isAfter(this.driveList.get(driveList.size()).getStart()))
    }*/

    public int weeklyDrivingTime(){
        Iterator <Day> iterator = dayList.iterator();
        int sum=0;

        while(iterator.hasNext())
        {
           Day dayTmp = iterator.next();
           System.out.println("total day time: " + dayTmp.totalDailyDrivingTime());
           sum+=dayTmp.totalDailyDrivingTime();

        }

        return sum;

    }

    public int getCountDrivingTimeExceeded() {
        return countDrivingTimeExceeded;
    }

    public void setCountDrivingTimeExceeded(int countDrivingTimeExceeded) {
        this.countDrivingTimeExceeded = countDrivingTimeExceeded;
    }

    public List<Day> getDayList() {
        return dayList;
    }

    public void setDayList(ArrayList<Day> dayList) {
        this.dayList = dayList;
    }

    public boolean isConsecutive(Week week) {//Supporta solamente settimane dello stesso anno

        int yearWeek1, yearWeek2;
        int weekNumber1=52, weekNumber2=52;

        LocalDateTime dateWeek1 = this.getDayList().get(0).getDailyDrive().get(0).getStart();
        LocalDateTime dateWeek2 = week.getDayList().get(0).getDailyDrive().get(0).getStart();

        yearWeek1=dateWeek1.getYear();
        yearWeek2=dateWeek2.getYear();

        TemporalField temporalFieldWeek1 = WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear();
        int valueWeek1 = dateWeek1.get(temporalFieldWeek1);
        int valueWeek2 = dateWeek2.get(temporalFieldWeek1);


        boolean is53Weeks1 = LocalDate.of(yearWeek1, 1, 1).getDayOfWeek() == DayOfWeek.THURSDAY || LocalDate.of(yearWeek1,12, 31).getDayOfWeek()== DayOfWeek.THURSDAY;
        boolean is53Weeks2 = LocalDate.of(yearWeek2, 1, 1).getDayOfWeek() == DayOfWeek.THURSDAY || LocalDate.of(yearWeek2,12, 31).getDayOfWeek()== DayOfWeek.THURSDAY;


        if(is53Weeks1)weekNumber1=53;
        if(is53Weeks2)weekNumber2=53;

        //Controllo su settimane di anni differenti

        if(Math.abs(yearWeek1-yearWeek2)<=1){//La condizione del <=1 serve per contemplare anche il caso di settimane presenti nello stesso: infatti essendoci il modulo il risultato minore ottenibile è, per l'appunto,  0

            if((valueWeek1==1&&valueWeek2==weekNumber2)||(valueWeek2==1&&valueWeek1==weekNumber1))return true;

            if(Math.abs(valueWeek1-valueWeek2)==1)return true;
        }

        return false;

    }
}
