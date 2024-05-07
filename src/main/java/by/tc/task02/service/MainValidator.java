package by.tc.task02.service;

import by.tc.task02.entity.criteria.Criteria;
import by.tc.task02.service.validation.command.ValidationCommand;
import by.tc.task02.service.validation.command.Validator;

public class MainValidator {

	public static <E> boolean criteriaValidator(Criteria<E> criteria) {

		ValidationCommand commander = new ValidationCommand();
		Validator command=commander.getCommand(criteria.getApplianceType());

		return command.validate(criteria, criteria.getKeyArray());
	}



}