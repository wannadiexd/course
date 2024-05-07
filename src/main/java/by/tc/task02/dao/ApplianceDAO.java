package by.tc.task02.dao;

import by.tc.task02.entity.criteria.Criteria;

import java.io.IOException;
import java.util.List;

public interface ApplianceDAO {
	<E> List<E> find(Criteria<E> criteria) throws IOException;
}
