package io.mattalui.cit260;

public class Name {
    private String name;

    public Name(String name){
        this.name = name;
    }

    public void printOtherGuysName(Name otherName){
        System.out.println(otherName.name);
    }
}
