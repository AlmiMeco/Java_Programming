package day12_customMethods;

public class CustomMethodintro {
    public static void main(String[] args) {
// every method you create MUST be created outside of other method bodies, but inside the main class
// (after line 6; before final curly brace)

        greetings(); // calling the method (must be called inside 'main method' to be output)
        System.out.println("-----------------------------------");
        displayMessage();
    }


    public static void greetings() {

        System.out.println("Hello Everyone");
        System.out.println("How are you today?");

    }

    public static void displayMessage() {

        System.out.println("Hello World!");
        System.out.println("I love Java!");
    }

//    Custom Methods:
    /*

SYNTAX --->  Access-Modifier   Specifier    Return-type    methodName(Parameter){
				                Code fragments
		}

----------------------------------------------------------------------------------------

		Access Modifiers: public, protected, default, private

						  public: (ALWAYS ACCESSIBLE)


		Specifiers: static, final, abstract, synchronized

					static: (can be called through the class name)


		Return-type: void, Any dataType (String, Int, Boolean...)

					void: does not return any value
					Any dataType: must return a value


		MethodName: meaningful, descriptive

		Parameters: Any Data Type

     */


}
