package Sandbox;

public class MoveFlairPricing {

    // Constants for Movers Only
    private static final int BASE_RATE_MOVERS_ONLY = 5000; // 5000 cents ($50) for the first hour
    private static final int HOURLY_RATE_MOVERS_ONLY = 3500; // 3500 cents ($35) per hour after the first hour
    private static final int BASE_RATE_MINUTES = 60;

    // Constants for Movers/Drivers
    private static final int RATE_PER_MINUTE_MOVERS_DRIVERS = 50; // 50 cents per minute
    private static final int MILEAGE_RATE_MOVERS_DRIVERS = 100; // 100 cents per km after the first 10 km
    private static final double DISTANCE_THRESHOLD = 10.0; // in km

    // Constants for Drivers Only
    private static final int RATE_PER_MINUTE_DRIVERS_ONLY = 20; // 20 cents per minute
    private static final int MILEAGE_RATE_DRIVERS_ONLY = 150; // 150 cents per km after the first 10 km

    public static int calculateMoversOnlyPrice(int minutes) {
        if (minutes <= BASE_RATE_MINUTES) {
            return BASE_RATE_MOVERS_ONLY;
        } else {
            int extraMinutes = minutes - BASE_RATE_MINUTES;
            return BASE_RATE_MOVERS_ONLY + (extraMinutes * HOURLY_RATE_MOVERS_ONLY) / BASE_RATE_MINUTES;
        }
    }

    public static int calculateMoversAndDriversPrice(int minutes, double distanceKm, double fuelCostPerKm, double optionalTruckRentalCost) {
        int timeCost = minutes * RATE_PER_MINUTE_MOVERS_DRIVERS;
        int mileageCost = (distanceKm > DISTANCE_THRESHOLD) ? (int) ((distanceKm - DISTANCE_THRESHOLD) * MILEAGE_RATE_MOVERS_DRIVERS) : 0;
        int fuelCost = (int) (distanceKm * fuelCostPerKm * 100); // converting dollars to cents
        int truckRentalCost = (int) (optionalTruckRentalCost * 100); // converting dollars to cents

        return timeCost + mileageCost + fuelCost + truckRentalCost;
    }

    public static int calculateDriversOnlyPrice(int minutes, double distanceKm) {
        int timeCost = minutes * RATE_PER_MINUTE_DRIVERS_ONLY;
        int mileageCost = (distanceKm > DISTANCE_THRESHOLD) ? (int) ((distanceKm - DISTANCE_THRESHOLD) * MILEAGE_RATE_DRIVERS_ONLY) : 0;

        return timeCost + mileageCost;
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println("Movers Only Price: " + calculateMoversOnlyPrice(120)); // 90 minutes
        System.out.println("Movers and Drivers Price: " + calculateMoversAndDriversPrice(50, 12, 1.4, 0)); // 120 minutes, 15 km, $1.5 fuel cost per km, $50 truck rental
        System.out.println("Drivers Only Price: " + calculateDriversOnlyPrice(60, 70)); // 60 minutes, 20 km
    }
}