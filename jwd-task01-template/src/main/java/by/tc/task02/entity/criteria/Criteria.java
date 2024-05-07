package by.tc.task02.entity.criteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
//Добавлен:   методы equals() и  hashcode()

public class Criteria<E> {

	private String applianceType;
	private Map<E, Object> criteria = new HashMap<E, Object>();


	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}




	public Set<Map.Entry<E, Object>> entrySet() {

		return criteria.entrySet();
	}



	public Map<E, Object> getCriteria() {
		return criteria;
	}

	public String getApplianceType() {
		return applianceType;
	}

	public void setApplianceType(String applianceType) {
		this.applianceType = applianceType;
	}

	public Object[] getKeyArray() {
		return criteria.keySet().toArray();
	}

	public Object getValue(E searchCriteria) {
		return criteria.get(searchCriteria);
	}






	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Criteria<?> criteria1 = (Criteria<?>) o;
		return Objects.equals(applianceType, criteria1.applianceType) &&
				Objects.equals(criteria, criteria1.criteria);
	}

	@Override
	public int hashCode() {

		return Objects.hash(applianceType, criteria);
	}


}
