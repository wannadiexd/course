package by.tc.task02.dao.impl.command.Creator;

import by.tc.task02.entity.Laptop;

import java.util.List;

public class LaptopCreator implements Creator {
    @Override
    public Laptop create (List<String> list) {

        Laptop laptop = new Laptop();
        setAllParameters(list, laptop);
        return laptop;
    }

    private void setAllParameters(List<String> list, Laptop laptop) {

        for (int i = 1; i < list.size(); i++) {
                  laptop.setBatteryCapacity(Double.parseDouble(CompileRegular.extractNumber(list.get(1))));
                  laptop.setOs(CompileRegular.extractSimpleWord(list.get(2)));
                  laptop.setSystemMemory(Integer.parseInt(CompileRegular.extractNumber(list.get(3))));
                  laptop.setSystemMemory(Integer.parseInt(CompileRegular.extractNumber(list.get(4))));
                  laptop.setCpu(Double.parseDouble(CompileRegular.extractNumber(list.get(5))));
                  laptop.setDisplayInches(Double.parseDouble(CompileRegular.extractNumber(list.get(6))));

            }
        }
    }





