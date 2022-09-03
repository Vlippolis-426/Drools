package io.github.aasaru.drools.sectionSengerio;
import io.github.aasaru.drools.repository.SengerioRepository;
import io.github.aasaru.drools.domain.Drive;

import java.util.Iterator;
import java.util.List;

import io.github.aasaru.drools.domain.*;
import org.kie.api.KieServices;
import org.kie.api.event.rule.ObjectDeletedEvent;
import org.kie.api.event.rule.ObjectInsertedEvent;
import org.kie.api.event.rule.ObjectUpdatedEvent;
import org.kie.api.event.rule.RuleRuntimeEventListener;
import org.kie.api.runtime.KieSession;


public class DrivingTime {
    public static int extensionNumberDrivingTime=0;


    List<Drive> drives = SengerioRepository.getDrive();

    SengerioRepository sR = new SengerioRepository();
    List<Day> days = sR.getDays();
    Week week;



    public static void main(String[] args)
    {
        KieSession ksession = KieServices.Factory.get().getKieClasspathContainer().newKieSession("DrivingTime");
        SengerioRepository.drives=SengerioRepository.getDrive();
        Week week1 = new Week();
        Week week2 = new Week();

        for (int i=0; i<6; i++)
            week1.dayList.add(SengerioRepository.getDays().get(i));

        for(int i=6; i<13; i++)
            week2.getDayList().add(SengerioRepository.getDays().get(i));

        //week1.isConsecutive(week2);
        System.out.println("Total week time: " + week1.weeklyDrivingTime());


        ksession.addEventListener(new RuleRuntimeEventListener() {
            @Override
            public void objectInserted(ObjectInsertedEvent event) {
                System.out.println("==> " + event.getObject() + " inserted");
            }

            @Override
            public void objectUpdated(ObjectUpdatedEvent event) {
                System.out.println("==> " + event.getObject() + " updated");
            }

            @Override
            public void objectDeleted(ObjectDeletedEvent event) {
                System.out.println("==> " + event.getOldObject() + " deleted");
            }
        });

        ksession.insert(week1);
        ksession.insert(week2);

        week1.getDayList().forEach(ksession::insert);
        week2.getDayList().forEach(ksession::insert);
        SengerioRepository.getDrive().forEach(ksession::insert);

        System.out.println(week1.isConsecutive(week2));


        System.out.println("==== DROOLS SESSION START ==== ");

        ksession.fireAllRules();
        ksession.dispose();

        System.out.println("==== DROOLS SESSION END ==== ");
    }
}
