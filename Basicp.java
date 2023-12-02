public class Basicp {

  public static void main(String[] args) {
    System.out.println("1) this is simple text");
    System.out.println("2) using println, is good as breaks line each time");

    System.out.print("3) without println ");
    System.out.print("4) code doesnt change line automatically");
    System.out.println(" how to comment in java");
    System.out.println(" 5) Normally, we use // for short comments, and /* */ for longer.");

    int myNum = 15;
    myNum = 20; // overwrite myNum is now 20
    System.out.println(myNum);
    System.out.println("types of variable declaration & display it :");
    int Num = 5;
    float myFloatNum = 5.99f;
    //char li = 'D';
    //boolean B = true;
    String myText = "Hello Simran";
    System.out.println(myText);// displayed by variable
    System.out.println(Num + myFloatNum);// displayed by adding two variable

    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double
    System.out.println(myDouble);

    //double MyDouble = 9.78d;
    int MyInt = (int) myDouble; // Manual casting: double to int
    System.out.println(MyInt);
  }
}
