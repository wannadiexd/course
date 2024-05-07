package by.tc.task02.dao.impl.command.Creator;

import by.tc.task02.entity.VacuumCleaner;

import java.util.List;

public class VacuumCleanerCreator implements Creator {
    @Override
    public VacuumCleaner create (List<String> list) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        setAllParameters(list, vacuumCleaner);
        return vacuumCleaner;
    }

    private void setAllParameters(List<String> list, VacuumCleaner vacuumCleaner) {

        for (int i = 1; i < list.size(); i++) {


                    vacuumCleaner.setPowerConsumption(Integer.parseInt(CompileRegular.extractNumber(list.get(1))));


                    vacuumCleaner.setFilterType(CompileRegular.extractFilterType(list.get(2)));


                    vacuumCleaner.setBagType(CompileRegular.extractBagType(list.get(3)));


                    vacuumCleaner.setWandType(CompileRegular.extractWandType(list.get(4)));


                    vacuumCleaner.setMotorSpeedRegulation(Integer.parseInt(CompileRegular.extractNumber(list.get(5))));

                    vacuumCleaner.setCleaningWidth(Integer.parseInt(CompileRegular.extractNumber(list.get(6))));

            }
        }
    }


