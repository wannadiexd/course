package by.tc.task02.dao.impl.command.Creator;

import by.tc.task02.entity.Appliance;

import java.util.List;

public interface Creator {
     Appliance create(List<String> list);
}
