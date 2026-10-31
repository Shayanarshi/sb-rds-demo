package in.ashokit.service;

import in.ashokit.entity.Employee;
import in.ashokit.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


    @Autowired
    EmployeeRepository repository;



    public List<Employee> getEmployee(){
         return repository.findAll();
    }
    public  Employee saveEmployee(Employee employee){
        Employee saved = repository.save(employee);
        return saved;
    }

}
