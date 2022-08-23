package io.github.aasaru.drools.sectionSengerio;
import io.github.aasaru.drools.domain.Passport;
import io.github.aasaru.drools.repository.ApplicationRepository;
import io.github.aasaru.drools.repository.SengerioRepository;
import io.github.aasaru.drools.domain.Drive;
import java.util.List;

import io.github.aasaru.drools.Common;
import io.github.aasaru.drools.domain.*;
import org.kie.api.KieBase;
import io.github.aasaru.drools.Common;
import io.github.aasaru.drools.domain.*;
import io.github.aasaru.drools.repository.ApplicationRepository;
import org.kie.api.KieServices;
import org.kie.api.event.process.ProcessEventListener;
import org.kie.api.event.rule.ObjectDeletedEvent;
import org.kie.api.event.rule.ObjectInsertedEvent;
import org.kie.api.event.rule.ObjectUpdatedEvent;
import org.kie.api.event.rule.RuleRuntimeEventListener;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import java.util.function.Consumer.*;


public class DrivingTime {
    public static int extensionNumberDrivingTime=0;

    KieSession ksession = KieServices.Factory.get().getKieClasspathContainer().newKieSession("DrivingTime");
    List<Drive> drives = SengerioRepository.getDrive();
    Week week;

    public DrivingTime() {
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
    }

    public static void main(String[] args)
    {

        DrivingTime dT = new DrivingTime();

        SengerioRepository.loadDay();



        dT.drives.forEach(dT.ksession::insert);
        dT.week=new Week(dT.drives, SengerioRepository.dayList);
        dT.ksession.insert(dT.week);
        dT.ksession.insert(SengerioRepository.dayList.get(0));
        dT.ksession.insert(SengerioRepository.dayList.get(1));
        dT.ksession.insert(SengerioRepository.dayList.get(2));

        System.out.println("==== DROOLS SESSION START ==== ");

        dT.ksession.fireAllRules();
        dT.ksession.dispose();

        System.out.println("==== DROOLS SESSION END ==== ");


    }

}
