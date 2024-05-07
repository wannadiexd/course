package by.tc.task02.service.validation.command;

import by.tc.task02.dao.impl.command.Creator.CompileRegular;
import by.tc.task02.entity.criteria.Criteria;

import by.tc.task02.entity.criteria.SearchCriteria;

public class SpeakersValidator implements Validator {

    @Override
    public boolean validate(Criteria criteria, Object[] keyArray) {

        for (Object key : keyArray) {
            if (SearchCriteria.Speakers.FREQUENCY_RANGE.equals(key)) {
                if (!CompileRegular.isNumber(String.valueOf(criteria.getValue(key)))) {
                    return false;
                }
            }
        }
        return true;
    }
}
