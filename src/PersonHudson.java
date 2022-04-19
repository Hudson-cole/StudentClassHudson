public class PersonHudson {

     String firstName;
     String lastName;
// build constructor for person object
    public PersonHudson(String fName, String lName){
        this.firstName = fName;
        this.lastName = lName;

    }
    // use toString to print object in a string
    public String toString(){
        return (lastName + ", " + firstName);
    }
}
