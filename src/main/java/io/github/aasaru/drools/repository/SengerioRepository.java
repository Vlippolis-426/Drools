package io.github.aasaru.drools.repository;

import io.github.aasaru.drools.domain.Day;
import io.github.aasaru.drools.domain.Drive;

import java.lang.reflect.Array;
import java.time.Month;
import java.util.Iterator;
import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;





public class SengerioRepository {

    public static List<Drive>  drives;
    public static ArrayList<Day> days;
//WEEK 1:

    //DAY 1
    public static final LocalDateTime dutyStart1 = LocalDateTime.of(2022, Month.MAY, 25, 8, 00);
    public static final LocalDateTime dutyEnd1 = LocalDateTime.of(2022, Month.MAY, 25, 12, 30);
    public static final LocalDateTime dutyStart2 = LocalDateTime.of(2022, Month.MAY, 25, 13, 15);
    public static final LocalDateTime dutyEnd2 = LocalDateTime.of(2022, Month.MAY, 25, 17, 45);

    //DAY 2
    public static final LocalDateTime dutyStart3 = LocalDateTime.of(2022, Month.MAY, 26, 8, 00);
    public static final LocalDateTime dutyEnd3 = LocalDateTime.of(2022, Month.MAY, 26, 12, 30);
    public static final LocalDateTime dutyStart4 = LocalDateTime.of(2022, Month.MAY, 26, 13, 15);
    public static final LocalDateTime dutyEnd4 = LocalDateTime.of(2022, Month.MAY, 26, 17, 45);

    //DAY 3
    public static final LocalDateTime dutyStart5 = LocalDateTime.of(2022, Month.MAY, 27, 8, 00);
    public static final LocalDateTime dutyEnd5 = LocalDateTime.of(2022, Month.MAY, 27, 12, 30);

    public static final LocalDateTime dutyStart6 = LocalDateTime.of(2022, Month.MAY, 27, 13, 15);
    public static final LocalDateTime dutyEnd6 = LocalDateTime.of(2022, Month.MAY, 27, 18, 45);


    //DAY 4
    public static final LocalDateTime dutyStart7 = LocalDateTime.of(2022, Month.MAY, 28, 8, 00);
    public static final LocalDateTime dutyEnd7 = LocalDateTime.of(2022, Month.MAY, 28, 12, 30);

    public static final LocalDateTime dutyStart8 = LocalDateTime.of(2022, Month.MAY, 28, 13, 15);
    public static final LocalDateTime dutyEnd8 = LocalDateTime.of(2022, Month.MAY, 28, 18, 45);

    //DAY 5
    public static final LocalDateTime dutyStart9 = LocalDateTime.of(2022, Month.MAY, 30, 8, 00);
    public static final LocalDateTime dutyEnd9 = LocalDateTime.of(2022, Month.MAY, 30, 12, 30);

    public static final LocalDateTime dutyStart10 = LocalDateTime.of(2022, Month.MAY, 30, 13, 15);
    public static final LocalDateTime dutyEnd10 = LocalDateTime.of(2022, Month.MAY, 30, 18, 45);

    //DAY 6
    public static final LocalDateTime dutyStart11= LocalDateTime.of(2022, Month.MAY, 31, 8, 00);
    public static final LocalDateTime dutyEnd11 = LocalDateTime.of(2022, Month.MAY, 31, 12, 30);

    public static final LocalDateTime dutyStart12 = LocalDateTime.of(2022, Month.MAY, 31, 13, 15);
    public static final LocalDateTime dutyEnd12 = LocalDateTime.of(2022, Month.MAY, 31, 18, 45);

    //DAY 7
    public static final LocalDateTime dutyStart13 = LocalDateTime.of(2022, Month.JULY, 1, 8, 00);
    public static final LocalDateTime dutyEnd13 = LocalDateTime.of(2022, Month.JULY, 27, 12, 30);

    public static final LocalDateTime dutyStart14 = LocalDateTime.of(2022, Month.JULY, 1, 13, 15);
    public static final LocalDateTime dutyEnd14 = LocalDateTime.of(2022, Month.JULY, 1, 18, 45);
    //------------Start another week--------------------

//WEEK 2:
public static final LocalDateTime dutyStart15 = LocalDateTime.of(2022, Month.JULY, 25, 8, 00);
    public static final LocalDateTime dutyEnd15 = LocalDateTime.of(2022, Month.JULY, 25, 12, 30);
    public static final LocalDateTime dutyStart16 = LocalDateTime.of(2022, Month.JULY, 25, 13, 15);
    public static final LocalDateTime dutyEnd16 = LocalDateTime.of(2022, Month.JULY, 25, 17, 45);

    //DAY 2
    public static final LocalDateTime dutyStart17 = LocalDateTime.of(2022, Month.JULY, 26, 8, 00);
    public static final LocalDateTime dutyEnd17 = LocalDateTime.of(2022, Month.JULY, 26, 12, 30);
    public static final LocalDateTime dutyStart18 = LocalDateTime.of(2022,Month.JULY, 26, 13, 15);
    public static final LocalDateTime dutyEnd18 = LocalDateTime.of(2022, Month.JULY, 26, 17, 45);

    //DAY 3
    public static final LocalDateTime dutyStart19 = LocalDateTime.of(2022, Month.JULY, 27, 8, 00);
    public static final LocalDateTime dutyEnd19 = LocalDateTime.of(2022, Month.JULY, 27, 12, 30);

    public static final LocalDateTime dutyStart20 = LocalDateTime.of(2022, Month.JULY, 27, 13, 15);
    public static final LocalDateTime dutyEnd20 = LocalDateTime.of(2022, Month.JULY, 27, 18, 45);


    //DAY 4
    public static final LocalDateTime dutyStart21 = LocalDateTime.of(2022, Month.JULY, 28, 8, 00);
    public static final LocalDateTime dutyEnd21 = LocalDateTime.of(2022, Month.JULY, 28, 12, 30);

    public static final LocalDateTime dutyStart22 = LocalDateTime.of(2022, Month.JULY, 28, 13, 15);
    public static final LocalDateTime dutyEnd22 = LocalDateTime.of(2022, Month.JULY, 28, 18, 45);

    //DAY 5
    public static final LocalDateTime dutyStart23 = LocalDateTime.of(2022, Month.JULY, 30, 8, 00);
    public static final LocalDateTime dutyEnd23 = LocalDateTime.of(2022, Month.JULY, 30, 12, 30);

    public static final LocalDateTime dutyStart24 = LocalDateTime.of(2022, Month.JULY, 30, 13, 15);
    public static final LocalDateTime dutyEnd24 = LocalDateTime.of(2022, Month.JULY, 30, 18, 45);

    //DAY 6
    public static final LocalDateTime dutyStart25= LocalDateTime.of(2022, Month.JULY, 31, 8, 00);
    public static final LocalDateTime dutyEnd25 = LocalDateTime.of(2022, Month.JULY, 31, 12, 30);

    public static final LocalDateTime dutyStart26 = LocalDateTime.of(2022, Month.JULY, 31, 13, 15);
    public static final LocalDateTime dutyEnd26 = LocalDateTime.of(2022, Month.JULY, 31, 18, 45);

    //DAY 7
    public static final LocalDateTime dutyStart27 = LocalDateTime.of(2022, Month.JULY, 1, 8, 00);
    public static final LocalDateTime dutyEnd27 = LocalDateTime.of(2022, Month.JULY, 27, 12, 30);

    public static final LocalDateTime dutyStart28 = LocalDateTime.of(2022, Month.JULY, 1, 13, 15);
    public static final LocalDateTime dutyEnd28 = LocalDateTime.of(2022, Month.JULY, 1, 18, 45);

    public static List<Drive> getDrive(){
        drives = new ArrayList<>();


        System.out.println(dutyEnd1.getDayOfWeek());


        int day=25;
        Month month=Month.MAY;
        LocalDateTime start;
        LocalDateTime end;
        for(int i=0; i<14; i++)
        {
            day++;
            if(day>31){day=1; month=Month.JUNE;}

            start = LocalDateTime.of(2022, month, day, 8, 00);
            end = LocalDateTime.of(2022, month, day, 12, 30);
            drives.add(new Drive(start, end));


            start = LocalDateTime.of(2022, month, day, 12, 45);
            end = LocalDateTime.of(2022, month, day, 17, 45);
            drives.add(new Drive(start, end));
        }



       /* drives.add(new Drive(dutyStart1, dutyEnd1));
        drives.add(new Drive(dutyStart2, dutyEnd2));
        drives.add(new Drive(dutyStart3, dutyEnd3));
        drives.add(new Drive(dutyStart4, dutyEnd4));
        drives.add(new Drive(dutyStart5, dutyEnd5));
        drives.add(new Drive(dutyStart6, dutyEnd6));
        drives.add(new Drive(dutyStart7, dutyEnd7));
        drives.add(new Drive(dutyStart8, dutyEnd8));
        drives.add(new Drive(dutyStart9, dutyEnd9));
        drives.add(new Drive(dutyStart10, dutyEnd10));
        drives.add(new Drive(dutyStart11, dutyEnd11));
        drives.add(new Drive(dutyStart12, dutyEnd12));
        drives.add(new Drive(dutyStart13, dutyEnd13));
        drives.add(new Drive(dutyStart14, dutyEnd14));
        drives.add(new Drive(dutyStart15, dutyEnd15));
        drives.add(new Drive(dutyStart16, dutyEnd16));
        drives.add(new Drive(dutyStart17, dutyEnd17));
        drives.add(new Drive(dutyStart18, dutyEnd18));
        drives.add(new Drive(dutyStart19, dutyEnd19));
        drives.add(new Drive(dutyStart20, dutyEnd20));
        drives.add(new Drive(dutyStart21, dutyEnd21));
        drives.add(new Drive(dutyStart22, dutyEnd22));
        drives.add(new Drive(dutyStart23, dutyEnd23));
        drives.add(new Drive(dutyStart24, dutyEnd24));
        drives.add(new Drive(dutyStart25, dutyEnd25));
        drives.add(new Drive(dutyStart26, dutyEnd26));
        drives.add(new Drive(dutyStart27, dutyEnd27));
        drives.add(new Drive(dutyStart28, dutyEnd28));*/





        return drives;
    }

    public static ArrayList<Day> getDays()
    {
        days = new ArrayList<>();
        int i =0;
        Iterator <Drive> iterator = drives.iterator();
        ArrayList<Day> tmpDays = new ArrayList<>();
        while(iterator.hasNext())
        {
            tmpDays.add(new Day());
            tmpDays.get(i).getDailyDrive().clear();
            for(int j=0; j<2; j++)
                tmpDays.get(i).getDailyDrive().add(iterator.next());


            days.add(tmpDays.get(i));

            i++;

        }

        return days;
    }



}