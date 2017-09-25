package com.deadelvensoft.spring.DAO;

public class Person
{
	int		id;
	String	name;
	int		money;
	String	description;

	@Override
	public String toString()
	{
		return "Person [id=" + id + ", name=" + name + ", money=" + money + ", description=" + description + "]";
	}

	public Person(String name, int money, String description)
	{
		this.name = name;
		this.money = money;
		this.description = description;
	}

	public Person(int id, String name, int money, String description)
	{
		this.id = id;
		this.name = name;
		this.money = money;
		this.description = description;
	}

	public Person()
	{
	}

	public int ReturnMoneyValueFinal(int addition)
	{
		return this.money += addition;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getMoney()
	{
		return money;
	}

	public void setMoney(int money)
	{
		this.money = money;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

}
