//Program name: Project_details.java
//Written by: L Ngwenya
//Date written: 19/02/2020
//A project details class to create project detail's objects

public class Project_details {

    // project_details class attributes
    int projectNumber;
    String projectName;
    String buildingDesign;
    String physicalAddress;
    int erfNumber;
    int projectFees;
    int amountPaid;
    String deadline;
    String projectComplete;
    String completionDate;


    // declaring three person to create the persons each time a project created.
    Person architect;
    Person contractor;
    Person client;

    // initialization for project constructor
    public Project_details(int projectNumber, String projectName, String  buildingDesign, String physicalAddress, int erfNumber, int projectFees,
                           int amountPaid, String deadline, String projectComplete, String completionDate){

        this.projectNumber = projectNumber;
        this.projectName = projectName;
        this.buildingDesign = buildingDesign;
        this.physicalAddress = physicalAddress;
        this.erfNumber = erfNumber;
        this.projectFees = projectFees;
        this.amountPaid = amountPaid;
        this.deadline = deadline;
        this.projectComplete = projectComplete;
        this.completionDate = completionDate;


    }
    // function for creating person "architect"
    public void  setArchitectObj ( String name, String phoneNumber, String email, String physicalAddress){
        architect = new Person(name, phoneNumber, email, physicalAddress);
    }

    // function for creating person "contractor"
    public void  setContractorObj ( String name, String phoneNumber, String email, String physicalAddress){
        contractor = new Person(name, phoneNumber, email, physicalAddress);
    }

    // function for creating person "client"
    public void  setClientObj ( String name, String phoneNumber, String email, String physicalAddress){
        client = new Person(name, phoneNumber, email, physicalAddress);
    }

    // function for getting details of "architect"
    public Person getArchitect(){
        return architect;
    }

    // function for getting details of "contractor"
    public Person getContractor(){
        return contractor;
    }

    // function for getting details of "client"
    public Person getClient(){
        return client;
    }


    // function to change deadline
    void setDeadline(String due_date){
        this.deadline = due_date;
    }

    // function to change amount paid
    void setAmountPaid (int amt){

        this.amountPaid = amt;
    }
// function to changer contractor's details

    // function to mark task complete
    void markComplete(String pro_complete, String pro_compDate){
        this.projectComplete = pro_complete;
        this.completionDate = pro_compDate;

    }

    // The format in which we want the details of the project to be printed
    public String toString() {
        String output = "Project number: " + projectNumber;
        output += "\nProject name: " + projectName;
        output += "\nBuilding design:" + buildingDesign;
        output += "\nPhysical address:" + physicalAddress;
        output += "\nErf number:" + erfNumber;
        output += "\nProject fees:" + projectFees;
        output += "\nAmount paaid:" + amountPaid;
        output += "\nDeadline:" + deadline;
        output += "\nProject complete: " + projectComplete;
        output += "\nCompletion date: " + completionDate;
        output += "\nArchitect: " + getArchitect();//.getPersonName();
        output += "\nContractor: " + getContractor();//.getPersonName();
        output += "\nCustomer: " + getClient(); //.getPersonName()"\n";


        return output;
    }
}

