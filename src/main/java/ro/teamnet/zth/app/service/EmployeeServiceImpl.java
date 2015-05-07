package ro.teamnet.zth.app.service;

import ro.teamnet.zth.app.dao.EmployeeDao;
import ro.teamnet.zth.app.domain.Employee;

import java.util.List;

/**
 * Created by Racabol.Razvan on 07.05.2015.
 */
public class EmployeeServiceImpl implements EmployeeService{

    @Override
    public List<Employee> findAllEmployees() {
        return (new EmployeeDao().getAllEmployees());

    }

    @Override
    public Employee findOneEmployee(Integer id) {
       return  new EmployeeDao().getEmployeeById(id);

    }
}
