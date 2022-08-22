package io.github.aasaru.drools.repository;

import io.github.aasaru.drools.domain.Drive;

import java.time.Month;
import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;





public class SengerioRepository {

    public static final LocalDateTime dutyStart1 = LocalDateTime.of(2022, Month.MAY, 25, 8, 00);
    public static final LocalDateTime dutyEnd1 = LocalDateTime.of(2022, Month.MAY, 25, 17, 00);

    public static final LocalDateTime dutyStart2 = LocalDateTime.of(2022, Month.MAY, 26, 7, 00);
    public static final LocalDateTime dutyEnd2 = LocalDateTime.of(2022, Month.MAY, 26, 17, 00);

    public static final LocalDateTime dutyStart3 = LocalDateTime.of(2022, Month.MAY, 27, 7, 00);
    public static final LocalDateTime dutyEnd3 = LocalDateTime.of(2022, Month.MAY, 27, 17, 00);

    public static final LocalDateTime dutyStart4 = LocalDateTime.of(2022, Month.MAY, 28, 7, 00);
    public static final LocalDateTime dutyEnd4 = LocalDateTime.of(2022, Month.MAY, 28, 17, 00);

    public static final LocalDateTime dutyStart5 = LocalDateTime.of(2022, Month.MAY, 29, 8, 00);
    public static final LocalDateTime dutyEnd5 = LocalDateTime.of(2022, Month.MAY, 29, 17, 00);

    public static final LocalDateTime dutyStart6 = LocalDateTime.of(2022, Month.MAY, 30, 8, 00);
    public static final LocalDateTime dutyEnd6 = LocalDateTime.of(2022, Month.MAY, 30, 17, 00);


    public static List<Drive> getDrive(){
        List<Drive> drives = new ArrayList<>();

        drives.add(new Drive(dutyStart1, dutyEnd1));
        drives.add(new Drive(dutyStart2, dutyEnd2));
        drives.add(new Drive(dutyStart3, dutyEnd3));
        drives.add(new Drive(dutyStart4, dutyEnd4));
        drives.add(new Drive(dutyStart5, dutyEnd5));
        drives.add(new Drive(dutyStart6, dutyEnd6));

        return drives;
    }


}