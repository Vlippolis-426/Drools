package io.github.aasaru.drools.repository;

import io.github.aasaru.drools.domain.Day;
import io.github.aasaru.drools.domain.Drive;

import java.time.Month;
import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;





public class SengerioRepository {

    public static ArrayList <Day> dayList = new ArrayList <Day>(3);


    public static final LocalDateTime dutyStart1 = LocalDateTime.of(2022, Month.MAY, 25, 8, 00);
    public static final LocalDateTime dutyEnd1 = LocalDateTime.of(2022, Month.MAY, 25, 12, 30);

    public static final LocalDateTime dutyStart2 = LocalDateTime.of(2022, Month.MAY, 25, 13, 15);
    public static final LocalDateTime dutyEnd2 = LocalDateTime.of(2022, Month.MAY, 25, 17, 45);

    public static final LocalDateTime dutyStart3 = LocalDateTime.of(2022, Month.MAY, 26, 8, 00);
    public static final LocalDateTime dutyEnd3 = LocalDateTime.of(2022, Month.MAY, 26, 12, 30);

    public static final LocalDateTime dutyStart4 = LocalDateTime.of(2022, Month.MAY, 26, 13, 15);
    public static final LocalDateTime dutyEnd4 = LocalDateTime.of(2022, Month.MAY, 26, 17, 45);

    public static final LocalDateTime dutyStart5 = LocalDateTime.of(2022, Month.MAY, 27, 8, 00);
    public static final LocalDateTime dutyEnd5 = LocalDateTime.of(2022, Month.MAY, 27, 12, 30);

    public static final LocalDateTime dutyStart6 = LocalDateTime.of(2022, Month.MAY, 27, 13, 15);
    public static final LocalDateTime dutyEnd6 = LocalDateTime.of(2022, Month.MAY, 27, 17, 45);

    //------------Start another week--------------------



    public static List<Drive> getDrive(){
        List<Drive> drives = new ArrayList<>();


        System.out.println(dutyEnd1.getDayOfWeek());


        drives.add(new Drive(dutyStart1, dutyEnd1));
        drives.add(new Drive(dutyStart2, dutyEnd2));
        drives.add(new Drive(dutyStart3, dutyEnd3));
        drives.add(new Drive(dutyStart4, dutyEnd4));
        drives.add(new Drive(dutyStart5, dutyEnd5));
        drives.add(new Drive(dutyStart6, dutyEnd6));

        return drives;
    }

    public static void loadDay()
    {
        ArrayList<Drive> driveTmpList = new ArrayList<>();
        driveTmpList.add(new Drive(dutyStart1, dutyEnd1));
        driveTmpList.add(new Drive(dutyStart2, dutyEnd2));

        dayList.add(new Day(driveTmpList));

        driveTmpList.clear();
        driveTmpList.add(new Drive(dutyStart3, dutyEnd3));
        driveTmpList.add(new Drive(dutyStart4, dutyEnd4));
        dayList.add(new Day(driveTmpList));

        driveTmpList.clear();
        driveTmpList.add(new Drive(dutyStart5, dutyEnd5));
        driveTmpList.add(new Drive(dutyStart6, dutyEnd6));
        dayList.add(new Day(driveTmpList));

    }


}