package starter.steps;

import java.util.function.IntPredicate;

public class Calculator {
	
	private int total;
	
	public Calculator(int amount) {
		this.total = amount;
	}

	public void add(int amount) {
		// TODO Auto-generated method stub
		total = total + amount;
	}

	public int getTotal() {
		// TODO Auto-generated method stub
		return total;
	}

}
