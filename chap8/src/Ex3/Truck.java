package Ex3;

public class Truck extends Minivan 
{
	
	public Truck(int fECity, int fEHwy, int seating, double cargo, String t,String l, String f) 
	{
		super(fECity, fEHwy, seating, cargo, l, f);
		
	}
	 
	
	@Override
	String cargoContainer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String description() {
		// TODO Auto-generated method stub
		return null;
	}
}
