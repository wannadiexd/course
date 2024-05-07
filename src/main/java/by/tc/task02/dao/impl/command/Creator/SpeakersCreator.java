package by.tc.task02.dao.impl.command.Creator;

import by.tc.task02.entity.Speakers;

import java.util.List;

public class SpeakersCreator implements Creator {
    @Override
    public Speakers create (List<String> list) {

        Speakers speakers = new Speakers();
        setAllParameters(list, speakers);
        return speakers;
    }

    private void setAllParameters(List<String> list, Speakers speakers) {

        for (int i = 1; i < list.size(); i++) {


                    speakers.setPowerConsumption(Integer.parseInt(CompileRegular.extractNumber(list.get(1))));

                    speakers.setNumberOfSpeakers(Integer.parseInt(CompileRegular.extractNumber(list.get(2))));


                    speakers.setFregquencyRange(CompileRegular.extractFrequencyRange(list.get(3)));


                    speakers.setCordLength(Integer.parseInt(CompileRegular.extractNumber(list.get(4))));

            }
        }
    }



