package p1;

public class HomogeneousDB extends distributedDB {
	
	public static final double COST_FACTOR=1.2;

	public HomogeneousDB(String name, double bCost, double DBStorage, int nUser,double cpu)
	{
		super(name,bCost,DBStorage,nUser,cpu);
	}

	public double getCostFactor()
	{
		return COST_FACTOR;
	}
	
	@Override
	public double monthlyCost() {
		
		return bCost+(UserCost()*COST_FACTOR);
	}
}


