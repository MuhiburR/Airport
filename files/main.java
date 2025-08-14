import java.util.*;

public class Main {
  public static void main(String[] args) {

    //Hard coded for test cases
		Flight raven = new Flight(25, 50.00, 30);
		Flight eagle = new Flight(10, 100.50, 60);
		Flight falcon = new Flight(50, 200.00, 40);
		Flight pigeon = new Flight(20, 100, 120);

		ArrayList<Flight> flights = new ArrayList<Flight>();
		flights.add(raven);
		flights.add(eagle);
		flights.add(falcon);
		flights.add(pigeon);
		
		Airport capitalHub = new Airport(flights);

		System.out.println("Total Revenue:" + capitalHub.getTotalRevenue());
			System.out.println();
		System.out.println("Passengers Removed:" + capitalHub.updateFlights());

	}


}
