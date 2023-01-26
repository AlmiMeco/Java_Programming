package day02_escapeSequences;

public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Hello World\nGood Morning"); // (\n) escape seq. for a NEW LINE
        System.out.println("\t My Name is Almi");        // (\t) escape seq. for TAB
        System.out.println("w\\out");                    // (\\) escape seq. for printing a BACKSLASH
        System.out.println("\"YOO\"");                   // (\") escape seq. for printing a QUOTATION

    }
}
/*
The reasoning behind the last two escape sequences is because
The BACKSLASH (\) and The QUOTATION MARK (") both have a function in Java ("" implies TEXT)
If you want to print them in the console you must use these Esc Seq. tricks :)
 */