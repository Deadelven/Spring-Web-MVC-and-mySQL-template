package com.deadelvensoft.spring.DAO;

public class UserObject
{
int id;
String Username;
String Password;
String DisplayName;
@Override
public String toString()
{
	return "UserObject [id=" + id + ", Username=" + Username + ", Password=" + Password + ", DisplayName=" + DisplayName + "]";
}
public UserObject(int id, String username, String password, String displayName)
{
	this.id = id;
	Username = username;
	Password = password;
	DisplayName = displayName;
}

public UserObject()
{

}
public int getId()
{
	return id;
}
public void setId(int id)
{
	this.id = id;
}
public String getUsername()
{
	return Username;
}
public void setUsername(String username)
{
	Username = username;
}
public String getPassword()
{
	return Password;
}
public void setPassword(String password)
{
	Password = password;
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
