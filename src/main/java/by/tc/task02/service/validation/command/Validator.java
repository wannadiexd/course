package by.tc.task02.service.validation.command;

import by.tc.task02.entity.criteria.Criteria;

public interface Validator {

     boolean validate(Criteria criteria, Object[] keyArray);

}