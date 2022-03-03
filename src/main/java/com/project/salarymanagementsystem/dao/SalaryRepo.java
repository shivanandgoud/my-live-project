package com.project.salarymanagementsystem.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.project.salarymanagementsystem.entity.Salary;

@Component
public interface SalaryRepo extends CrudRepository<Salary, Integer> {

}
