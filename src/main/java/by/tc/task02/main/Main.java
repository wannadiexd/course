package by.tc.task02.main;

import static by.tc.task02.entity.criteria.SearchCriteria.*;

import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.criteria.Criteria;
import by.tc.task02.service.ApplianceService;
import by.tc.task02.service.ServiceFactory;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args, List collectionApplianceUnit) throws IOException {
        Appliance appliance;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////

        Criteria<Oven> criteriaOven = new Criteria<Oven>();
        criteriaOven.setApplianceType("Oven");
        criteriaOven.add(Oven.CAPACITY, 3);

        appliance = service.find(criteriaOven);


       ;

        PrintApplianceInfo.print(collectionApplianceUnit);

        //////////////////////////////////////////////////////////////////
        criteriaOven.setApplianceType("Oven");

        criteriaOven = new Criteria<Oven>();
        criteriaOven.setApplianceType("Oven");
        criteriaOven.add(Oven.HEIGHT, 200);
        criteriaOven.add(Oven.DEPTH, 300);

        appliance = service.find(criteriaOven);

        PrintApplianceInfo.print(collectionApplianceUnit);

        //////////////////////////////////////////////////////////////////

        Criteria<TabletPC> criteriaTabletPC = new Criteria<TabletPC>();
        criteriaTabletPC.setApplianceType("TabletPC");
        criteriaOven.setApplianceType("TabletPC");
        criteriaTabletPC.add(TabletPC.COLOR, "BLUE");
        criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 14);
        criteriaTabletPC.add(TabletPC.MEMORY_ROM, 4);

        appliance = service.find(criteriaOven);

        PrintApplianceInfo.print(collectionApplianceUnit);

    }

}
