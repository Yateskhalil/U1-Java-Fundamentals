public class L3 {

    //add the main method header below.

/*
Literal Value is a value written into code
An Expression is a value written using variables or operators.
 */

    public static void main(String[] args) {

        int literalValue=5;
        int literalValue2=6;
        int expression1= 5 + 6;
        int expression2= literalValue + 6;
        int expression3= literalValue  +literalValue2;

        //Examples of Literal Values
        double literalExample1= 3.6;
        boolean Literalexample2= true;
        String literalExample3= "APPLE";

        //Example of Expression
        double expressionExample2 = 5+6;

        //bad Example

        //A String expression is called a String Concatenation. You can combine Strings using the +.
   String expressionExample3= "A fruit people eat is a "+ literalExample3;

    //EXAMPLE PROGRAM

        String message1 = "The store has ";
        String message2 = " apples in stock.";
        int numApples = 20;

        System.out.println("The store has 20 apples in stock.");
        System.out.println("The store has " + numApples + " apples in stock");
        System.out.println(message1 + numApples + message2);



    }
}
