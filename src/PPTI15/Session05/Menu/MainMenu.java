package PPTI15.Session05.Menu;

import PPTI15.Session05.Ride;

public class MainMenu {
    public static void main(String[] args) {
        Ride ride = new Ride("B1234CA", "081234567890", "Jalan Jaya Wijaya 1 No 23", "Jalan Maju Jaya 4 No 56");
        System.out.println("Price: " + ride.CalculatePrice());
    }
}
