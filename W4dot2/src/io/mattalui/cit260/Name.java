package io.mattalui.cit260;

public class Name {
    private String firstName;
    private String lastName;

    public Name (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String toString(){
        return this.firstName + " " + this.lastName;
    }
}
