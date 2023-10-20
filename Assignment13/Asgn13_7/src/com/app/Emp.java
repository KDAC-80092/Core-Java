package com.app;

public interface Emp {
	double getSal();
	default double calcIncentives()
	{
		return 0.0;
	}
	
	static double calcTotalIncome(Emp[] arr)
	{
		double total = 0;
		for(Emp e : arr)
			total = total+e.getSal()+e.calcIncentives();
		
		return total;
	}
	
}
