package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }
    @Test
    public void testNameQueries() {
        //Given
        Employee employee1 = new Employee("John", "Doe");
        Employee employee2 = new Employee("Jane", "Doe");
        Employee employee3 = new Employee("Connor", "MacLeod");
        Company company1 = new Company("Datalogic");
        Company company2 = new Company("Dataminer");
        Company company3 = new Company("Highlander Ltd.");
        company1.getEmployees().add(employee1);
        company2.getEmployees().add(employee2);
        company3.getEmployees().add(employee3);
        employee1.getCompanies().add(company1);
        employee2.getCompanies().add(company2);
        employee3.getCompanies().add(company3);
        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        //When
        List<Employee> employeesDoe = employeeDao.retrieveEmployeeWithLastname("Doe");
        List<Company> companiesDat = companyDao.retrieveCompanyBeginningWith("Dat");

        //Then
        Assert.assertEquals(2, employeesDoe.size());
        Assert.assertEquals(2, companiesDat.size());

        //CleanUp
        try {
            companyDao.delete(company1.getId());
            companyDao.delete(company2.getId());
            companyDao.delete(company3.getId());
        } catch (Exception e) {
            //do nothing
        }
    }
}
