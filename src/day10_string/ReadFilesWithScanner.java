package day10_string;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFilesWithScanner {
    public static void main(String[] args) throws IOException {

        Scanner fileScan = new Scanner(Path.of("src/day10_string/test.txt"));

        //System.out.println(fileScan.next());// to read the first word of the txt file

        System.out.println(fileScan.nextLine());// to read the first line of the txt file
        System.out.println(fileScan.nextLine());
        System.out.println(fileScan.nextLine());// 3 nextLn() stetements = 3 lines of output



fileScan.close();
    }

}
