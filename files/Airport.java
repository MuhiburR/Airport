import java.util.ArrayList;

public class Airport{

	private ArrayList<Flight> allFlights;

public Airport(ArrayList<Flight> flights){
		allFlights = flights;
}
	
	public double getTotalRevenue(){
		double totalRevenue = 0;
			for(Flight flight: allFlights) {
				int numPassengers = flight.getNumPassengers();
				int numCapacity = flight.getCapacity();
				double numPrice = flight.getPrice();
					if(numPassengers < numCapacity){
						totalRevenue += numPassengers * numPrice;
					}
					else {
						totalRevenue += numCapacity * numPrice;
					}
			}
	return totalRevenue;
	}	
	
	public int updateFlights() {
		int count = 0;
		for(int i = 0; i < allFlights.size();i++){
			Flight flight = allFlights.get(i);
				if(((double) flight.getNumPassengers() / flight.getCapacity()*100)<20){
					count+= flight.getNumPassengers();
					allFlights.remove(i);
					i--;
			}
		}
		return count;
	}
	
}
