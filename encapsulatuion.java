public class encapsulatuion{
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.setName("John");
    System.out.println(myObj.getName());
  }
}

/* here we will get an error because private/updated data cannot be accessed directly */



    public class Person {
        private String name;
     
        // Getter
        public String getName() {
          return name;
        }
     
        // Setter
        public void setName(String newName) {
          this.name = newName;
        }
     }
