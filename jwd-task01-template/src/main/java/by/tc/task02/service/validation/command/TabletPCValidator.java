package by.tc.task02.service.validation.command;

import by.tc.task02.dao.impl.command.Creator.CompileRegular;
import by.tc.task02.entity.criteria.Criteria;

import by.tc.task02.entity.criteria.SearchCriteria;

public class TabletPCValidator implements Validator {

    @Override
    public boolean validate(Criteria criteria, Object[] keyArray) {

        for (Object key : keyArray) {
            if (SearchCriteria.TabletPC.COLOR.equals(key)) {
                if (!(criteria.getValue(key) instanceof String) || criteria.getValue(key).toString().isEmpty()) {
                    return false;
                }
            }
            else {
                if (!CompileRegular.isNumber(String.valueOf(criteria.getValue(key)))) {
                    return false;
                }
            }
        }
        return true;
    }


}
