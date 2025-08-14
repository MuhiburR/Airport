public class Flight {

	private int numOfPassengers;
	private double price;
	private int capacity;
	
	
public Flight (int people, double p, int cap){
	numOfPassengers = people;
	price = p;
	capacity = cap;
}
	
	public int getNumPassengers(){
		return numOfPassengers;	
	}
	public double getPrice(){
		return price;
	}
	public int getCapacity(){
		return capacity;
	}
	
}
