package by.tc.task02.dao.impl.command.Creator;

import by.tc.task02.entity.Refrigerator;

import java.util.List;

public class RefrigeratorCreator implements  Creator {
    @Override
    public Refrigerator create(List<String> list) {

        Refrigerator refrigerator = new Refrigerator();
        setAllParameters(list, refrigerator);
        return refrigerator;
    }

    private void setAllParameters(List<String> list, Refrigerator refrigerator) {

        for (int i = 1; i < list.size(); i++ ) {


                    refrigerator.setPowerConsumption(Integer.parseInt(CompileRegular.extractNumber(list.get(1))));;


                    refrigerator.setWeight(Integer.parseInt(CompileRegular.extractNumber(list.get(2))));


                    refrigerator.setFreezerCapacity(Integer.parseInt(CompileRegular.extractNumber(list.get(3))));


                    refrigerator.setOverallCapacity(Double.parseDouble(CompileRegular.extractNumber(list.get(4))));

                    refrigerator.setHeight(Integer.parseInt(CompileRegular.extractNumber(list.get(5))));


                    refrigerator.setWidth(Integer.parseInt(CompileRegular.extractNumber(list.get(6))));

            }
        }
    }




