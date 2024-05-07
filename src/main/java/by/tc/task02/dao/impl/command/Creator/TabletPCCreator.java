package by.tc.task02.dao.impl.command.Creator;

import by.tc.task02.entity.TabletPC;

import java.util.List;

public class TabletPCCreator implements Creator {

    @Override
    public TabletPC create (List<String> list) {

        TabletPC tabletPC = new TabletPC();
        setAllParameters(list, tabletPC);
        return tabletPC;
    }

    private void setAllParameters(List<String> list, TabletPC tabletPC) {

        for (int i = 1; i < list.size(); i++) {


                    tabletPC.setBatteryCapacity(Integer.parseInt(CompileRegular.extractNumber(list.get(1))));


                    tabletPC.setDisplayInches(Integer.parseInt(CompileRegular.extractNumber(list.get(2))));


                    tabletPC.setMemoryrom(Integer.parseInt(CompileRegular.extractNumber(list.get(3))));;


                    tabletPC.setFlashMemory(Integer.parseInt(CompileRegular.extractNumber(list.get(4))));;


                    tabletPC.setColor(CompileRegular.extractSimpleWord(list.get(5)));

            }
        }
    }


