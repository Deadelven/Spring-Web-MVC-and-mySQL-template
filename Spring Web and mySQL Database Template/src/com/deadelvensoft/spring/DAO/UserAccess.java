package com.deadelvensoft.spring.DAO;

public class UserAccess
{
	int		id;
	String	DisplayName;

	@Override
	public String toString()
	{
		return "UserAccess [id=" + id + ", DisplayName=" + DisplayName + "]";
	}

	public UserAccess()
	{
	}

	public UserAccess(int id, String displayName)
	{
		this.id = id;
		DisplayName = displayName;
	}

	public UserAccess(String displayName)
	{
		super();
		DisplayName = displayName;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getDisplayName()
	{
		return DisplayName;
	}

	public void setDisplayName(String displayName)
	{
		DisplayName = displayName;
	}

}
