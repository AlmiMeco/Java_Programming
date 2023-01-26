package day09_scanner;

import java.util.Scanner;      // Import Statement (adding scanner)

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in); // Scanner Declaration / Creation (enabling scanner)
//   (class)   (variable)     (declaration to scan user input)

        byte n1 = keyboard.nextByte();

        System.out.println("You Entered " + n1);

        keyboard.close(); //closes the scanner (no more inputs allowed) (prev inputs now locked in)



    }

}
