package com.deadelvensoft.spring.DAO;

public class Transaction
{
	int		id;
	int		person1Id;
	int		person2Id;
	int		amount;
	String	description;

	public Transaction(int id, int person1Id, int person2Id, int amount, String description)
	{
		this.id = id;
		this.person1Id = person1Id;
		this.person2Id = person2Id;
		this.amount = amount;
		this.description = description;
	}

	public Transaction(int person1Id, int person2Id, int amount, String description)
	{
		this.person1Id = person1Id;
		this.person2Id = person2Id;
		this.amount = amount;
		this.description = description;
	}

	public Transaction createTransaction(Person p1, Person p2, int amt, String description)
	{
		this.person1Id = person1Id;
		this.person2Id = person2Id;
		this.amount = amount;
		this.description = description;

		return this;

	}

}
