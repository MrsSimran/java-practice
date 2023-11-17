import java.util.Arrays;

public class d3string {
    public static void main(String[] args) {
        String txt = "count lenght of letter";
        System.out.println("the lenght of txt is:" + txt.length());

        System.out.println("the lenght of txt is:" + txt.toUpperCase());
        System.out.println("the lenght of txt is:" + txt.toLowerCase());

        /* single qoutation, double quation & // */

        String text = "We are the so-called \"Vikings\" this make quotation to word.";
        System.out.println(text);
        String text2 = "The sequence \'  inserts a single\' quote in a string";
        System.out.println(text2);
        String text3 = "The sequence \\\\  inserts a single backslash in a string:";
        System.out.println(text3);

        /* maths */

        System.out.println("The Math.min(a,b) method can be used to find the lowest value of a and b:");
        System.out.println(Math.min(5, 10));
        System.out.println("The Math.sqrt(x) method returns the square root of x:");
        System.out.println(Math.sqrt(64));
        System.out.println("The Math.abs(x) method returns the absolute (positive) value of x:");
        System.out.println(Math.abs(-4.7));
        System.out.println("Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):");
        System.out.println(Math.random());

        /*Array */

       System.out.println( " Arrays are used to store multiple values in a single variable using[]");
       String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
       System.out.println(cars[0]);
       System.out.println(cars[3]);/*refer to the index number: */
       System.out.println(cars.length);/*To find out how many elements an array has, use the length property: */
       for (int i = 0; i < cars.length; i++)/* loop through the array elements &  loop through the array elements   */
       {
        System.out.println(cars[i]);
       }

       /*Multi-dimensional Arrray */
       
       System.out.println("Multi-DemenstionalArray  to store data as a tabular form, like a table with rows and columns");
       int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
       System.out.println(myNumbers[1][2]);


    }
}
