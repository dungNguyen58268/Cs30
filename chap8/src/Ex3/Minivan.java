package Ex3;

public class Minivan extends Vehicle
{
	
	private String fName;
	private String lName;
	public Minivan(int fECity, int fEHwy, int seating, double cargo, String l, String f) {
		super(fECity, fEHwy, seating, cargo);
		fName = f;
		lName = l;
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

	@Override
	 String cargoContainer() {
		// TODO Auto-generated method stub
		return(super.cargoContainer() + ", type: Truck");
	}

	@Override
	String description() {
		// TODO Auto-generated method stub
		return null;
	}

}
