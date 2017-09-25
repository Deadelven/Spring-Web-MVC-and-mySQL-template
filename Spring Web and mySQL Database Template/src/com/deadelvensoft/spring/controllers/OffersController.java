package com.deadelvensoft.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.deadelvensoft.spring.DAO.Person;
import com.deadelvensoft.spring.DAO.UserObject;
import com.deadelvensoft.spring.service.DatabaseService;

@Controller
public class OffersController
{

	private DatabaseService	dbService;

	@Autowired
	public void setDbService(DatabaseService dbService)
	{
		this.dbService = dbService;
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String showTest(Model model, @RequestParam("id") String id)
	{
		System.out.println("ID is: " + id);
		return "Home";
	}

	@RequestMapping("/people")
	public String showPeople(Model model)
	{
		List<Person> people = dbService.getCurrentPeople();
		model.addAttribute("people", people);
		model.addAttribute("name", "Karkarof");
		return "people";
	}

	@RequestMapping("/addperson")
	public String addPerson()
	{
		return "addperson";
	}

	@RequestMapping("/deleteuserpage")
	public String deleteUser()
	{
		return "DeleteUser";
	}

	@RequestMapping("/dodeleteuser")
	public String doDeleteUser(Model model, UserObject userobject)
	{

		dbService.DeleteUser(userobject.getId());
		return "showusers";
	}

	@RequestMapping(value = "/doaddperson", method = RequestMethod.POST)
	public String doAddPerson(Model model, Person person, BindingResult result)
	{

		if (result.hasErrors())
		{
			System.out.println("Form does not Validate");
			return "addperson";
		}

		dbService.createPerson(person);
		return "personcreated";
	}

	@RequestMapping(value = "/dologin", method = RequestMethod.POST)
	public String doLogin(Model model, UserObject userobject)
	{
		System.out.println(userobject);
		String Displayname;
		if (dbService.CheckUser(userobject.getUsername(), userobject.getPassword()) == "null")
		{
			return "login";
		}
		else
		{
			Displayname = dbService.CheckUser(userobject.getUsername(), userobject.getPassword());
			model.addAttribute("displayname", Displayname);
		}
		return "loginsuccess";
	}

	@RequestMapping(value = "/doadduser", method = RequestMethod.POST)
	public String doAddUser(Model model, UserObject userobject)
	{
		dbService.CreateUser(userobject);
		System.out.println("UserInfo: " + userobject);
		return "showusers";
	}

	@RequestMapping("/adduser")
	public String addUser()
	{
		return "createuser";
	}

	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}

	@RequestMapping("/showusers")
	public String showUsers(Model model)
	{
		List<UserObject> users = dbService.getCurrentUsers();
		for (UserObject user : users)
		{
			System.out.println("UserInfo: " + user);

		}

		model.addAttribute("users", users);
		return "showusers";
	}

}
