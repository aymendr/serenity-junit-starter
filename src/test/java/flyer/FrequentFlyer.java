package flyer;

public class FrequentFlyer {
	
	private int balance;
	private String status;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static FrequentFlyer withInitialBalanceOf(int b) {
		// TODO Auto-generated method stub  
		FrequentFlyer f = new FrequentFlyer();
		f.balance = b;
		if(f.balance < 10000) f.status = "Bronze";
		else if(f.balance >= 10000) f.status = "Silver";
		return f;
	}

	public void recordFlightDistanceInKilometers(int distance) {
		// TODO Auto-generated method stub
		this.balance = this.balance + distance;
		if(this.balance < 10000) this.status = "Bronze";
		else if(this.balance >= 10000) this.status = "Silver";
		
	}

	public void remove_transfered_points(int points) {
		// TODO Auto-generated method stub
		this.balance = this.balance - points;
		if(this.balance < 10000) this.status = "Bronze";
		else if(this.balance >= 10000) this.status = "Silver";
		
	}

}
