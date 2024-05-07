package by.tc.task02.dao.impl.command.Creator;

import by.tc.task02.entity.Oven;

import java.util.List;

public class OvenCreator implements Creator {
    @Override
    public Oven create(List<String> list) {

        Oven oven = new Oven();
        setAllParameters(list, oven);
        return oven;
    }

    private void setAllParameters(List<String> list, Oven oven) {

        for (int i = 1; i < list.size(); i++ ) {

                    oven.setPowerConsumption(Integer.parseInt(CompileRegular.extractNumber(list.get(1))));
                    oven.setWeight(Integer.parseInt(CompileRegular.extractNumber(list.get(2))));
                    oven.setCapacity(Integer.parseInt(CompileRegular.extractNumber(list.get(3))));
                    oven.setDepth(Integer.parseInt(CompileRegular.extractNumber(list.get(4))));
                    oven.setHeight(Double.parseDouble(CompileRegular.extractNumber(list.get(5))));
                    oven.setWidth(Double.parseDouble(CompileRegular.extractNumber(list.get(6))));
            }
        }
    }



