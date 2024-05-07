package by.tc.task02.service.impl;

import by.tc.task02.dao.ApplianceDAO;
import by.tc.task02.dao.DAOFactory;
import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.criteria.Criteria;
import by.tc.task02.service.ApplianceService;
import by.tc.task02.service.MainValidator;

import java.io.IOException;

public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public <E> Appliance find(Criteria<E> criteria) throws IOException {
		if (!MainValidator.criteriaValidator(criteria)) {
			return null;
		}

		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		Appliance appliance = (Appliance) applianceDAO.find(criteria);

		return appliance;
	}

}