package by.tc.task02.dao.impl;

import by.tc.task02.dao.ApplianceDAO;
import by.tc.task02.dao.impl.command.ApplianceCommand;
import by.tc.task02.entity.criteria.Criteria;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplianceDAOImpl implements ApplianceDAO {


    private final static String PATH = "C:\\appliances_db.txt";

    private Reader reader = new Reader();

    String matcherValue;
    String matcherKey;
    String fullMatcher;


    ApplianceCommand applianceCommand = new ApplianceCommand();

    //To create collection, where will contain found objects

    List collectionApplianceUnit = new ArrayList<>();




    @Override
    public <E> List<E> find(Criteria<E> criteria) throws IOException {


        List<List<String>> lists = reader.readListLineSplitByComma(PATH);




        for (List<String> list :
                lists)

            //To find the first element of array to match with type of criteria

            if (list.get(0).equalsIgnoreCase(criteria.getApplianceType())) {

                //To create loop, which    search matching  with value of Map collection

                for (int i = 1; i < list.size(); i++) {


                    for (Map.Entry<E, Object> entry : criteria.entrySet()) {

                        E key = entry.getKey();
                        Object value = entry.getValue();

                        //To create full matching in criteria

                        matcherKey=key.toString();
                        matcherValue = value.toString();
                        fullMatcher=matcherKey+"="+matcherValue;

                    //To match with all parametrs of array

                        if (isFindMatcher(list.get(i))) {

                            //if mathings find, command will create searching object and will add to collection


                            collectionApplianceUnit.add(applianceCommand.FindCriteria(criteria.getApplianceType()));
                        }


                    }

                }

            }

        return collectionApplianceUnit;
    }

    //To create method to find matches in parameters of array

    public boolean isFindMatcher(String getParametr) {

        Pattern validationPattern = Pattern.compile(getParametr);
        Matcher validationMatcher = validationPattern.matcher(fullMatcher);
        return validationMatcher.find();
    }
}


















