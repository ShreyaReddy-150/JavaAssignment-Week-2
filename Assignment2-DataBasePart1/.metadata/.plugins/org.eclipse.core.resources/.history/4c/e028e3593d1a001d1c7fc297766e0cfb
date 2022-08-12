package p1;

public class centralizedDB extends database {
	
	private double license;

	public centralizedDB(String name, double bCost, double DBStorage, double license)
	{
		super(name,bCost,DBStorage);
		setLicense(license);
	}

	@Override
	public double monthlyCost() {
		
		return bCost+license;
	}

	public double getLicense() {
		return license;
	}

	public void setLicense(double license) {
		this.license = license;
	}
	
	public String toString()
	{
		String s1=super.toString();
		String s2="License: "+String.format("$%,.2f",getLicense());
		return s1+"\n"+s2;
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}



}


