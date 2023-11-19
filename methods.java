/*public class Main {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method

    Main myObj = new Main(); // Create an object of MyClass
    myObj.myPublicMethod(); // Call the public method
  }
}*/

public class MethodExample {

    // Method without parameters and return type
    static void sayHello() {
        System.out.println("Hello, World!");
    }

    // Method with parameters and return type
    static int addNumbers(int a, int b) {
        return a + b;
    }

    // Method with a return type but no parameters
    static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        // Calling a method without parameters and return type
        sayHello();

        // Calling a method with parameters and return type
        int sum = addNumbers(5, 7);
        System.out.println("Sum of numbers: " + sum);

        // Calling a method with a return type but no parameters
        double circleArea = calculateCircleArea(3.5);
        System.out.println("Area of the circle: " + circleArea);
    }
}

