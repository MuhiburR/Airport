# ✈️ Airport Revenue & Flight Management System

A Java program that calculates airport revenue and automatically removes underperforming flights based on passenger capacity thresholds.

## 📋 Features

- **Revenue Calculation**: Computes total revenue across all flights based on passenger count and ticket prices
- **Automatic Flight Removal**: Cancels flights with less than 20% capacity and tracks displaced passengers
- **Flight Management**: Manages multiple flights with passenger tracking and capacity monitoring

## 🛠️ Technologies Used

- **Language**: Java
- **Concepts**: Object-Oriented Programming, ArrayLists, Business Logic

## 📁 Project Structure

```
Airport/
├── files/
│   ├── Airport.java    # Revenue calculation and flight management
│   ├── Flight.java     # Flight data model (passengers, price, capacity)
│   └── main.java       # Demo with hardcoded test flights
└── README.md
```

## 🚀 How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line / Terminal

### Steps

1. **Clone the repository**
   ```bash
   git clone https://github.com/MuhiburR/Airport.git
   cd Airport/files
   ```

2. **Compile the Java files**
   ```bash
   javac *.java
   ```

3. **Run the program**
   ```bash
   java main
   ```

## 💡 Sample Output

```
Total Revenue: 8512.5

Passengers Removed: 10
```

## 🎯 How It Works

### Flight Class
- Stores flight data: number of passengers, ticket price, and capacity
- Provides getter methods for accessing flight information

### Airport Class
- **`getTotalRevenue()`**: Calculates total revenue by multiplying passengers by ticket price for each flight (capped at capacity)
- **`updateFlights()`**: Removes flights operating below 20% capacity and returns the count of displaced passengers

### Business Logic
The system automatically cancels underperforming flights to optimize airport operations:
- Flights with < 20% occupancy are removed
- System tracks how many passengers are affected by cancellations

## 🧪 Test Cases

The program includes 4 hardcoded test flights:
- **Raven**: 25 passengers, $50 tickets, 30 capacity (83% full - kept)
- **Eagle**: 10 passengers, $100.50 tickets, 60 capacity (17% full - **removed**)
- **Falcon**: 50 passengers, $200 tickets, 40 capacity (over capacity - revenue capped)
- **Pigeon**: 20 passengers, $100 tickets, 120 capacity (17% full - **removed**)

## 📊 Learning Outcomes

This project demonstrates:
- Object-oriented design with business logic
- ArrayList manipulation and iteration
- Revenue calculation algorithms
- Conditional logic for business rules (capacity thresholds)
- Handling edge cases (overbooking scenarios)

## 🔮 Potential Enhancements

- User input for adding custom flights
- Different cancellation thresholds (configurable percentage)
- Revenue forecasting and analytics
- Date/time scheduling for flights
- Rebooking system for displaced passengers
- Reporting features (revenue by flight, cancellation statistics)

## 📝 Note

This is an educational project created during high school to practice Java OOP and business logic implementation.

## 👤 Author

**Muhibur Rahman**
- GitHub: [@MuhiburR](https://github.com/MuhiburR)

---

*Created as part of learning Java programming*
