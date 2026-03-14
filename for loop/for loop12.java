import java.util.*;
public class ParkingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double totalRevenue = 0;
        int peakHourVehicles = 0;
        for(int i = 1; i <= n; i++) {
            String vehicleType = sc.next();
            double hoursParked = sc.nextDouble();
            double hourlyRate = 0;
            double dailyCap = 0;
            if(vehicleType.equalsIgnoreCase("Car")) {
                hourlyRate = 3.0;
                dailyCap = 30.0;
            }
            else if(vehicleType.equalsIgnoreCase("Motorcycle")) {
                hourlyRate = 2.0;
                dailyCap = 20.0;
            }
            else if(vehicleType.equalsIgnoreCase("Truck")) {
                hourlyRate = 5.0;
                dailyCap = 60.0;
            }
            else if(vehicleType.equalsIgnoreCase("Bus")) {
                hourlyRate = 7.0;
                dailyCap = 100.0;
            }
            double fee = hoursParked * hourlyRate;
            boolean capApplied = false;
            if(fee > dailyCap) {
                fee = dailyCap;
                capApplied = true;
            }
            if(hoursParked > 8)
                peakHourVehicles++;
            totalRevenue += fee;
            System.out.println("Vehicle " + i + ": " + vehicleType);
            System.out.println("Hours Parked: " + hoursParked);
            System.out.println("Hourly Rate: $" + hourlyRate);
            System.out.println("Parking Fee: $" + fee);

            if(capApplied)
                System.out.println("Cap Applied: Yes");
            else
                System.out.println("Cap Applied: No");
        }
        double averageFee = totalRevenue / n;
        System.out.println("Total Vehicles: " + n);
        System.out.println("Total Revenue: $" + totalRevenue);
        System.out.println("Average Fee: $" + Math.round(averageFee * 100.0) / 100.0);
        System.out.println("Peak Hour Vehicles (>8 hours): " + peakHourVehicles);
    }
}