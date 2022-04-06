package Ex3;

public class Minivan extends Vehicle
{
	
	private String fName;
	private String lName;
	private String Type;
	public Minivan(int fECity, int fEHwy, int seating, double cargo, String l, String f, String t) {
		super(fECity, fEHwy, seating, cargo);
		fName = f;
		lName = l;
		Type = t;
		// TODO Auto-generated constructor stub
	}
	
	public String lName()
	{
		return lName;
	}
	
	public String fName()
	{
		return fName;
	}
	public String Type()
	{
		return Type;
	}
	
	@Override
	String description() 
	{
		// TODO Auto-generated method stub
		return ("Feul Economy City: "+ super.getFECity()+"");
	}

	@Override
	String cargoContainer() 
	{
		// TODO Auto-generated method stub
		return null ;
	}
	public String toString()//print manager Salary
	{
		return("Name: " + lName+" "+fName+" ,Type: " + Type);
	}



}
