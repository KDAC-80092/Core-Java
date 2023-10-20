package com.app;

public class Labor implements Emp {

	private double hours;
	private double rate;
	
	public Labor() {
		
	}

	public Labor(double hours, double rate) {
		super();
		this.hours = hours;
		this.rate = rate;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getHours() {
		return hours;
	}

	public double getRate() {
		return rate;
	}

//	Create another class Labor (with ﬁelds hours and rate)
//	inherited from Emp interface. In this class override getSal() method (hours * rate) as well as calcIncentives() method (5% of salary if hours > 300,
//	otherwise no incentives).
	
	@Override
	public double getSal() {
		return hours*rate;
	}
	
	@Override
	public double calcIncentives() {
		if(hours>300)
			return getSal()+(getSal()*0.05);
		else
			return 0.0;
	}
	
	@Override
	public String toString() {
		return "Labor [Hours = " + hours + ", Rate=" + rate + "]";
	}
	
	
	
	
	
	
	
}
