package com.controller;

import com.model.Employee;
import com.repository.EmployeeRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "/", description = "Perform add, deleteAll & getById operations")
public class EmployeeController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping(path = "/hello", method = RequestMethod.PUT)
    @ResponseBody
    public String helloWorld() {
        return "Hello World";
    }

        @ApiOperation(value = "/add", response = Employee.class)
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Employee created/added successfully"),
            @ApiResponse(code = 401, message = "unable to create/ add Employee")})
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Employee save(@RequestBody Employee employee) {
        logger.info("************* Added employee: " + employee);
        return employeeRepository.save(employee);
    }

    @ApiOperation(value = "/getById", response = Employee.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Employee found and their details are shown"),
            @ApiResponse(code = 400, message = "Employee not found")})
    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    public Employee get(@RequestParam(value = "id", required = true) Long id) {
        logger.info("************* Get employee by Id: " + id);

        return employeeRepository.findById(id);
    }

    @ApiOperation(value = "/deleteAll")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "All employees are deleted"),
            @ApiResponse(code = 400, message = "Employee not found")})
    @RequestMapping(value = "/deleteAll", method = RequestMethod.DELETE)
    public void deleteAll() {
        logger.info("************* Deleting all employee: ");
        employeeRepository.deleteAll();
    }

    @RequestMapping(value = "/deleteById", method = RequestMethod.DELETE)
    public void deleteById(@RequestParam(value = "id", required = true) Long id) {
        logger.info("************* Deleting by employee id: " + id);
        employeeRepository.deleteById(id);
    }

}
