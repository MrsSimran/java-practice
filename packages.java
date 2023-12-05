import java.util.*; // import the java.util package 

class packages {
  public static void main(String[] args) {
    Scanner MyObj = new Scanner(System.in);
    String userName;

    // Enter username and press Enter
    System.out.println("Enter username");
    userName = MyObj.nextLine();

    System.out.println("Username is: " + userName);
  }
}
