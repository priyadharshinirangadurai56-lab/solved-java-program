import java.util.Scanner;
public class HotelRoomOccupancyTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double totalRate = 0;
        double highestRate = 0;
        int peakDay = 0;
        int fullDays = 0;
        for (int i = 1; i <= n; i++) {
            int day = sc.nextInt();
            int roomsOccupied = sc.nextInt();
            int totalRooms = sc.nextInt();
            double occupancyRate = (roomsOccupied * 100.0) / totalRooms;
            String status;
            if (occupancyRate == 100) {
                status = "Full";
                fullDays++;
            } 
            else if (occupancyRate >= 80) {
                status = "High";
            } 
            else if (occupancyRate >= 60) {
                status = "Moderate";
            } 
            else {
                status = "Low";
            }
            totalRate += occupancyRate;
            if (occupancyRate > highestRate) {
                highestRate = occupancyRate;
                peakDay = day;
            }
            System.out.println("Day: " + day);
            System.out.println("Rooms Occupied: " + roomsOccupied);
            System.out.println("Total Rooms: " + totalRooms);
            System.out.println("Occupancy Rate: " + occupancyRate + "%");
            System.out.println("Status: " + status);
        }
        double averageRate = totalRate / n;
        System.out.println("Total Days Analyzed: " + n);
        System.out.println("Average Occupancy Rate: " + String.format("%.2f", averageRate) + "%");
        System.out.println("Peak Occupancy Day: Day " + peakDay);
        System.out.println("Days at Full Capacity: " + fullDays);
    }
}