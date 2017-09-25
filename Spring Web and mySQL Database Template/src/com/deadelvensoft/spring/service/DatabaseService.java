package com.deadelvensoft.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deadelvensoft.spring.DAO.MainDAO;
import com.deadelvensoft.spring.DAO.Person;
import com.deadelvensoft.spring.DAO.UserObject;

@Service("databaseService")
public class DatabaseService
{
	private MainDAO	mainDao;

	@Autowired
	public void setMainDao(MainDAO mainDao)
	{
		this.mainDao = mainDao;
	}

	public List<Person> getCurrentPeople()
	{
		return mainDao.getPeople();
	}

	public List<UserObject> getCurrentUsers()
	{
		return mainDao.getUsers();
	}

	public void createPerson(Person person)
	{
		mainDao.AddPerson(person);

	}

	public String CheckUser(String Username, String Password)
	{
		if (mainDao.CheckUserPass(Username, Password) == null) { return "null"; }
		return mainDao.CheckUserPass(Username, Password);

	}

	public void CreateUser(UserObject user)
	{
		mainDao.addUserData(user.getUsername(), user.getPassword(), user.getDisplayName());

	}

	public void DeleteUser(int id)
	{
		mainDao.deleteUser(id);

	}

}
