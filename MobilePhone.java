import java.util.ArrayList;
import java.util.Arrays;

public class MobilePhone {

  private static String myNumber;
  private static ArrayList<Contact> myContacts = new ArrayList<>();
  
  public MobilePhone() {
    this.myNumber = myNumber;
    this.myContacts = myContacts;
  }

  /** addNewContact()
   * One parameter of type Contact, return type of boolean
   *  Returns true if the contact doesn't exist
   *  Returns false if contact exists.
   * 
   */

   public static boolean addNewContact(ArrayList<Contact> myContacts) {

    boolean hasContacts = findItem(myContacts);

      if (hasContacts == true) {
        return true;
      } else {
        return false;
      }

   }

   /** updateContact() 
    * Has two (2) parameters of type Contact(old contact will be updated with new contact)
    * Return type of boolean.
    *   if contact exists and updated successfully,
          return true;
        if contact doesn't exist,
          return false;
    * 
    */

    public static boolean updateContact(ArrayList<Contact> oldContacts, ArrayList<Contact> myContacts) {

      boolean hasContacts = findItem(myContacts);

      if (hasContacts == true) {
        return true;
      } else {
        return false;
      }

    }

    /** removeContact()
     * Has one (1) parameter of type Contact
     * Return type of boolean
     *  if contact exists and removes successfully,
     *    return true;
     *  if contact doesn't exist,
     *    return false;
     */

    public static boolean removeContact(ArrayList<Contact> myContacts) {
      boolean hasContacts = findItem(myContacts);

      if (hasContacts == true && myContacts.remove(true)) {
        return true;
      } else {
        return false;
      }
    }


     /** findContact() (PRIVATE)
      * Has one parameter of type Contact
      * Return type of int.
      *   Returned value is the contact's position in the ArrayList.
      *     if the contact exists,
      *       return value must be greater than, or equal to, 0;
            if the contact doesn't exist,
              return value must equal -1;
      */

      private static int findContact(ArrayList<Contact> myContacts) {
        System.out.println("You have " + myContacts.size() + " contact(s) in your directory");

        for(int i = 0; i < myContacts.size(); i++) {
          // System.out.println((i + 1) + ". " + myContacts.getItem(i));
          if(myContacts.getItem(i) >= 0) {
            return myContacts.getItem(i);
          }
        }
        return -1;
      }

      /** findContact(String) (PRIVATE)
       * EXACT SAME AS findContact(), ONLY IT HAS ONE PARAMETER OF TYPE STRING!!!
       */

      private static int findContact(String contactName) {

        contactName = ArrayList.toString(myContacts.getItem());
        System.out.println("You have " + myContacts.size() + " contact(s) in your directory");

        for(int i = 0; i < myContacts.size(); i++) {
          // System.out.println((i + 1) + ". " + myContacts.getItem(i));

          if(myContacts.getItem(i) >= 0) {
            return myContacts.getItem(i);
          }

        }
        
        return -1;

      }

       /** queryContact()
        * Has one (1) parameter of type String
        * Return type of Contact
        * Use String parameter to search for the name
        *   then return the Contact
        *  Else
            return null;
        */

      public static <Contact> queryContact(String contactName) {
        
      }

      /** printContacts() 
       * Has no parameters
       * Won't return anything (void)
       * Print the contacts in the following format:
       * 
       * Contact List:
       * 
       * 1. Bob -> 31415926
       * 2. Alice -> 16180339
       * 3. Tom -> 11235813
       * 4. Jane -> 23571113
       */

}
