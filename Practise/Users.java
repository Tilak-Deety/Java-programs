package Practise;

public class Users {
    private String firstName;
    private String lastName;

    public String getFullName(){
        return getFirstName()+" "+getLastName();
    }

    public void setFirstName(String fn){
        firstName = fn;
    }
    public String getFirstName(){
        return firstName.toUpperCase();
    }
    public void setLastName(String ln){
        lastName = ln;
    }
    public String getLastName(){
        return lastName.toUpperCase();
    }

}
