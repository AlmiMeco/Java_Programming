package day08_ternariesAndSwitch;

public class Elevator {
    public static void main(String[] args) {

        int floorNumber = 2;
        if (floorNumber <= 3 && floorNumber >= 1) {
            if (floorNumber == 1) {
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
            } else if (floorNumber == 2) {
                System.out.println("Floor 2 selected. Companies: Cydeo, NASA, Intelsat");
            } else {
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");



            }
        } else {
            System.out.println("Invalid  FLoor");
        }
    }
}
/*
Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cydeo, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			anything else: print "Invalid floor - 6"
 */