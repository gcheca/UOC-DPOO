package edu.uoc.pac3;

/**
 * This Class represents a Station Class
 * @author gcheca
 * @version 1.0
 * PEC3 Ex2
 * Test to check everything's ok || Javadoc's useful comments deleted
 */

public class Address 
{

	private String street;

	private double latitude;

	private double longitude;
		
	public Address(String street, double latitude, double longitude) throws Exception
	{
		setStreet(street);
		setLatitude(latitude);
		setLongitude(longitude);
	}
	
	public String getStreet() 
	{
		return street;
	}
	
	public void setStreet(String street) 
	{
		this.street = street;
	}

	public double getLatitude() 
	{		
		return latitude;
	}
	
	public void setLatitude(double latitude) throws Exception
	{
		if(latitude<-90 || latitude>90) 
		{
			throw new Exception("[ERROR] Address' latitude must be in range [-90,+90]");
		}else 
		{
			this.latitude = latitude;
		}
	}

	public double getLongitude() 
	{
		return longitude;
	}

	public void setLongitude(double longitude) throws Exception
	{
		if(longitude<-180 || longitude>180) 
		{
			throw new Exception("[ERROR] Address' longitude must be in range [-180,+180]");
		}else 
		{
			this.longitude = longitude;
		}
	}
}
