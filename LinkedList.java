public class Patient {
  private String name;
  private int age;
  private String illness;
  private Patient nextPatient; /*
  very important as a linked list is nothing but
  a sequence of objects linked to each other and the last one
  point to null
  */

  public Patient(String name, int age, String illness) {
    this.name = name;
    this.age= age;
    this.illness= illness;
    this.nextPatient= null // Pointer to another patient!
  }

  //other methods will go here like getters and setters


}
