
package ca.sheridancollege.week1.softwarefundamentals;

public class Student {

    private int ID;
    private String name;
    private String Phone;
  private String Vishwa;
    
    private String Address;
  
    public String getAddress() {
        return Address;
    }

    /**
     * Set the value of Address
     *
     * @param Address new value of Address
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

     /* Get the value of ID
     *
     * @return the value of ID
     */
    public int getID() {
        return ID;
    }

    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }
    private String email;

    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * Set the value of ID
     *
     * @param ID new value of ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }  
    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getName() {
        return name;
    }
    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setName(String name) {
        this.name = name;
    }  
}
