//Program name: Client.java
//Written by: L Ngwenya
//Date written: 19/02/2020
//A person class to create persons's objects

public class Person {

    // attributes of each person
    String name;
    String phoneNumber;
    String email;
    String physicalAddress;

    // constructor
    public Person (String name, String phoneNumber, String email, String physicalAddress){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.physicalAddress = physicalAddress;
    }
    // function to change details of each person
    void setPersonDetails(String Ptel, String Pemail){
        this.phoneNumber = Ptel;
        this.email = Pemail;
    }

    // function to get a person's name
    public String getPersonName(){
        return  name;
    }

    // output format for details of each person
    public String toString (){
        String output = "Name: " + this.name;
        output = output + "\nTelephone number: " + this.phoneNumber;
        output = output + "\nEmail: " + this.email;
        output = output + "\nPhysical address: " + this.physicalAddress;
        return output;
    }
}
