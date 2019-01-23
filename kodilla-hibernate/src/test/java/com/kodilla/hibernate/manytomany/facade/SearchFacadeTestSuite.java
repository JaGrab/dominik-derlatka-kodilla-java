package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    SearchFacade facade;

    @Test
    public void shouldFindCompany() {
        //Given
        Company company1 = new Company("Datalogic");
        Company company2 = new Company("Dataminer");
        Company company3 = new Company("Highlander Ltd.");
        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        //When
        List<CompanyDto> companies = new ArrayList<>();
        try {
            companies = facade.searchCompanyLike("l");
        } catch (SearchProcessingException e) {
            // call for help ;)
        }

        //Then
        assertEquals(2, companies.size());

        //CleanUp
        companyDao.delete(company1);
        companyDao.delete(company2);
        companyDao.delete(company3);
    }
    @Test
    public void shoutFindEmployee() {
        //Given
        Employee employee1 = new Employee("John", "Doe");
        Employee employee2 = new Employee("Jane", "Doe");
        Employee employee3 = new Employee("Connor", "MacLeod");
        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);

        //When
        List<EmployeeDto> employees = new ArrayList<>();
        try {
            employees = facade.searchEmployeeLike("L");
        } catch (SearchProcessingException e) {
            // call for help ;)
        }

        //Then
        assertEquals(1, employees.size());

        //CleanUp
        employeeDao.delete(employee1);
        employeeDao.delete(employee2);
        employeeDao.delete(employee3);
    }
}