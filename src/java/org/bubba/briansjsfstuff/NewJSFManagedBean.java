package org.bubba.briansjsfstuff;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "helloWorld", eager = true)
@RequestScoped
public class NewJSFManagedBean
{

	/**
	 * Creates a new instance of NewJSFManagedBean
	 */
	public NewJSFManagedBean()
	{
	}
	@ManagedProperty(value = "#{name}")
	private String name = "nnaammee";
	@ManagedProperty(value = "#{street1}")
	private String street1 = "streeettt 1";
	@ManagedProperty(value = "#{street2}")
	private String street2 = "sstttrreeet 2";
	@ManagedProperty(value = "#{apt}")
	private String apt = "apttttt";

	private String message;

	public void createMessage()
	{
		message = " Hello, " + name +  "  " + street1 +  "  " + street2 + "  " + apt + " !";
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getStreet1()
	{
		return street1;
	}

	public void setStreet1(String street1)
	{
		this.street1 = street1;
	}

	public String getStreet2()
	{
		return street2;
	}

	public void setStreet2(String street2)
	{
		this.street2 = street2;
	}

	public String getApt()
	{
		return apt;
	}

	public void setApt(String apt)
	{
		this.apt = apt;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}
}
