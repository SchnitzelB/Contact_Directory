public class Contact {

  private static String name;
  private static String phoneNumber;

  public Contact(String name, String phoneNumber) {
    this.name = name;
    this.phoneNumber = phoneNumber;
  }

  //getName() - getter for your name
  public String getName() {
    return this.name;
  }

  //getPhoneNumber() - getter for phoneNumber;
  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  //STATIC createContact(String name, String phoneNumber) - returns instance of Contact
  public static ArrayList<Contact> createContact(String name, String phoneNumber) {
    
  }


}
