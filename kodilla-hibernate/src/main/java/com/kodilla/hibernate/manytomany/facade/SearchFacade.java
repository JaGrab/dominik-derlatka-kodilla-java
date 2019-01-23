package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public final class SearchFacade {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    FacadeMapper mapper;
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public void validatePattern(final String pattern) throws SearchProcessingException {
        if(pattern.isEmpty()) {
            LOGGER.error(SearchProcessingException.ERR_EMPTY_PATTERN);
            throw new SearchProcessingException(SearchProcessingException.ERR_EMPTY_PATTERN);
        }
    }
    public List<CompanyDto> searchCompanyLike(final String companyPattern) throws SearchProcessingException {
        validatePattern(companyPattern);
        LOGGER.info("Start searching company");
        List<CompanyDto> companies = mapper.mapToCompanyDtoList(companyDao.retrieveCompanyLike("%" +
                companyPattern + "%").orElse(new ArrayList<>()));
        long size = companies.size();
        if(size > 0) {
            LOGGER.info("Found " + size + ((size > 1) ? " company" : " companies"));
        } else {
            LOGGER.error(SearchProcessingException.ERR_COMPANY_NOT_FOUND);
            throw new SearchProcessingException(SearchProcessingException.ERR_COMPANY_NOT_FOUND);
        }
        return companies;
    }
    public List<EmployeeDto> searchEmployeeLike(final String employeePattern) throws SearchProcessingException {
        validatePattern(employeePattern);
        LOGGER.info("Start searching employee");
        List<EmployeeDto> employees = mapper.mapToEmployeeDtoList(employeeDao.retrieveEmployeeLike("%" +
                employeePattern + "%").orElse(new ArrayList<>()));
        long size = employees.size();
        if(size > 0) {
            LOGGER.info("Found " + size + ((size > 1) ? " employee" : " employees"));
        } else {
            LOGGER.error(SearchProcessingException.ERR_EMPLOYEE_NOT_FOUND);
            throw new SearchProcessingException(SearchProcessingException.ERR_EMPLOYEE_NOT_FOUND);
        }
        return employees;
    }
}
