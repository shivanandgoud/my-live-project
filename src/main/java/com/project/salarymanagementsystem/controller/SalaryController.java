package com.project.salarymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.salarymanagementsystem.dao.SalaryRepo;
import com.project.salarymanagementsystem.entity.Salary;


@Controller
public class SalaryController {
	
	@Autowired
	SalaryRepo sr;
	
	@RequestMapping("/")
	public String show()
	{
		return "index.jsp"; 
	}
	
	@RequestMapping("/addsalary")
	@ResponseBody
	public String addsalary(Salary s)
	{
		sr.save(s);
		return "salary added...";
	}
	
	@RequestMapping("/viewsalary")
	@ResponseBody
	public String viewsalary(int salary_id)
	{
		Salary s = sr.findById(salary_id).orElse(new Salary());
		return s.toString();
	}
	
	@RequestMapping("/salarylist")
	@ResponseBody
	public String videolist()
	{
		List<Salary> l =(List<Salary>) 
				sr.findAll();
		
		return l.toString();
	}
	
	@RequestMapping("/updatesalary")
	@ResponseBody
	public String updatevideo(Salary s)
	{
		sr.save(s);
		return "salary updated...";
	}
	
	@RequestMapping("/deletesalary")
	@ResponseBody
	public String deletesalary(int salary_id)
	{
		sr.deleteById(salary_id);
		return "salary deleted...";
	}
}
