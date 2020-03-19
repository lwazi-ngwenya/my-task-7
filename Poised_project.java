//Program name: Poised_project.java
//Written by: L Ngwenya
//Date written: 19/02/2020
//This is the main class where we output all information


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;

public class Poised_project {
    public static void main (String[] args) throws Exception {
        int projectNumber;
        String projectName;
        String buildingDesign;
        String physicalAddress;
        int erfNumber;
        int projectFees;
        int amountPaid;
        String deadline;
        String architect;
        String contractor;
        String client;
        String projectComplete;
        String completionDate;
        String phoneNumber;
        String email;

        // user input
        Scanner projectNumber_input = new Scanner(System.in);
        System.out.print("Please enter the project number: ");
        projectNumber = projectNumber_input.nextInt();
        Scanner projectName_input = new Scanner(System.in);
        System.out.print("Please enter the project name: ");
        projectName = projectName_input.nextLine();
        Scanner building = new Scanner(System.in);
        System.out.print("Please enter the building design (e.g. House, Apartment, etc): ");
        buildingDesign = building.nextLine();
        Scanner address_input = new Scanner(System.in);
        System.out.print("Please enter the physical address: ");
        physicalAddress = address_input.nextLine();
        Scanner ERF_input = new Scanner(System.in);
        System.out.print("Please enter the ERF number: ");
        erfNumber = ERF_input.nextInt();
        Scanner fee_input = new Scanner(System.in);
        System.out.print("Please enter project Fee: ");
        projectFees = fee_input.nextInt();
        Scanner paidAmt_input = new Scanner(System.in);
        System.out.print("Please enter the amount paid: ");
        amountPaid = paidAmt_input.nextInt();
        Scanner deadline_input = new Scanner(System.in);
        System.out.print("Please enter the deadline as dd-MM-yyyy ");
        String deadline1 = deadline_input.nextLine();
        projectComplete = "No";
        completionDate = "none";

        // converting deadline date into date format to cast the Date data type into a string
        SimpleDateFormat thisDate = new SimpleDateFormat("dd-MM-yyyy");
        Date converted_date = thisDate.parse(deadline1);
        deadline = new SimpleDateFormat("dd-MM-yyyy").format(converted_date);

        // creating a project object
        Project_details proj1 = new Project_details(projectNumber, projectName, buildingDesign, physicalAddress, erfNumber, projectFees,
                amountPaid, deadline, projectComplete, completionDate);

        // getting architect details.
        Scanner architect_input = new Scanner(System.in);
        System.out.print("Please enter the name of the architect: ");
        architect = architect_input.nextLine();
        Scanner architect_phoneNumber_input = new Scanner(System.in);
        System.out.print("For architect " + architect + ", please enter their phone number: ");
        phoneNumber = architect_phoneNumber_input.nextLine();
        Scanner architect_email_input = new Scanner(System.in);
        System.out.print("For architect " + architect + ", please enter their email: ");
        email = architect_email_input.nextLine();
        Scanner architect_pysicalAddress_input = new Scanner(System.in);
        System.out.print("For architect " + architect + ", please enter their physical address: ");
        physicalAddress = architect_pysicalAddress_input.nextLine();

        // creating an architect using a set function declared in the project details class to create an architect
        proj1.setArchitectObj(architect, phoneNumber, email, physicalAddress);


        // getting input for contractor
        Scanner contractor_input = new Scanner(System.in);
        System.out.print("Please enter the name of the contractor: ");
        contractor = contractor_input.nextLine();
        Scanner contractor_phoneNumber_input = new Scanner(System.in);
        System.out.print("For contractor " + contractor + ", please enter their phone number: ");
        phoneNumber = contractor_phoneNumber_input.nextLine();
        Scanner contractor_email_input = new Scanner(System.in);
        System.out.print("For contractor  " + contractor + ", please enter their email: ");
        email = contractor_email_input.nextLine();
        Scanner contractor_physicalAddress_input = new Scanner(System.in);
        System.out.print("For contractor  " + contractor + ", please enter their physical address: ");
        physicalAddress = contractor_physicalAddress_input.nextLine();

        // creating a contractor using a set function declared in the project details class to create a contractor
        proj1.setContractorObj(contractor, phoneNumber, email, physicalAddress);


        Scanner client_input = new Scanner(System.in);
        System.out.print("Please enter the name of the client: ");
        client = client_input.nextLine();
        Scanner client_phoneNumber_input = new Scanner(System.in);
        System.out.print("For client " + client + ", please enter their phone number: ");
        phoneNumber = client_phoneNumber_input.nextLine();
        Scanner client_email_input = new Scanner(System.in);
        System.out.print("For client " + client + ", please enter their email: ");
        email = client_email_input.nextLine();
        Scanner client_physicalAddress_input = new Scanner(System.in);
        System.out.print("For client " + client + ", please enter their physical address: ");
        physicalAddress = client_physicalAddress_input.nextLine();
        proj1.setClientObj(client, phoneNumber, email, physicalAddress);


        System.out.println("------------------------------------\n" + "Project details");
        System.out.print("------------------------------------\n" + proj1.toString() + "------------------------------------\n");


        System.out.println("Architect details" + "\n--------------------------------\n");
        System.out.print(proj1.getArchitect().toString() + "\n---\n");
        System.out.println("Contractor details" + "\n--------------------------------\n");
        System.out.print(proj1.getContractor().toString() + "\n---\n");
        System.out.println("Client details" + "\n--------------------------------\n");
        System.out.println(proj1.getClient().toString() + "\n--------------------------------\n");


        // the editing part of the project is put inside a loop to allow the user to choose if they want to change specific details of the project.
        Boolean control_edit = true;
        while (control_edit) {
            Scanner user_input = new Scanner(System.in);
            System.out.print("Would you like to edit the project? (Yes or No) ");
            String edit_project = user_input.nextLine();
            String edit_projectLower = edit_project.toLowerCase();

            // user chooses what they want to edit should they want to edit
            if (edit_projectLower.equals("yes")) {
                Scanner input = new Scanner(System.in);
                System.out.print("Please enter the letter of what you want to edit: d-deadline, a-amount paid, u-update contractor, f-finalize- ");
                String edit_choice = input.nextLine();
                String edit_choiceLower = edit_choice.toLowerCase();

                // if the user chooses to edit the deadline, they are asked to enter the new details and the necessary changes are made.
                if (edit_choiceLower.equals("d")) {
                    Scanner nwDeadline = new Scanner(System.in);
                    System.out.print("Enter new deadline as dd-MM-yyyy e.g. 12-02-2020: ");
                    deadline1 = nwDeadline.nextLine(); // getting the new date from the user as a string

                    // specifying format for date
                    SimpleDateFormat new_date = new SimpleDateFormat("dd-MM-yyyy");
                    //converting the new date entered as a string to a Date data type to use it later for comparison purposes.
                    Date newDate_converted = new_date.parse(deadline1);
                    // assigning the date to our variable deadline
                    deadline = new SimpleDateFormat("dd-MM-yyyy").format(newDate_converted);
                    proj1.setDeadline(deadline);
                    System.out.println(proj1.toString());

                    // if user chooses to edit amount paid, they are asked to put the new details and the necessary changes are made.
                } else if (edit_choiceLower.equals("a")) {
                    Scanner newAmount_paid = new Scanner(System.in);
                    System.out.print("Enter new amount paid: ");
                    amountPaid = proj1.amountPaid + newAmount_paid.nextInt(); // adding new amount entered to not overwrite current amount paid.
                    proj1.setAmountPaid(amountPaid);
                    System.out.println(proj1.toString());

                    // if user chooses to update the contractor's details, they are asked to enter the new details and the necessary changes are made.
                } else if (edit_choiceLower.equals("u")) {

                    System.out.print("Changing the details of the contractor named: " + proj1.getContractor().getPersonName() + "\n");
                    Scanner contractor_phoneNumber_inputnew = new Scanner(System.in);
                    System.out.print("For Contractor " + proj1.getContractor().getPersonName() + ", please enter their phone number: ");
                    phoneNumber = contractor_phoneNumber_inputnew.nextLine();
                    Scanner contractor_email_inputnew = new Scanner(System.in);
                    System.out.print("For Contractor " + proj1.getContractor().getPersonName() + ", please enter their email: ");
                    email = contractor_email_inputnew.nextLine();
                    proj1.getContractor().setPersonDetails(phoneNumber, email);

                    System.out.print("\n--------------------------------\nThe new details of the contractor\n" + proj1.getContractor().toString() + "\n--------------------------------\n");


                    // if user chooses to finalize the project, if the user still owes the company, an invoice is generated and printed in a text file
                } else if (edit_choiceLower.equals("f")) {
                    if (projectFees > amountPaid) {
                        int amount_owed = projectFees - amountPaid;
                        try {
                            Formatter f = new Formatter("invoice.txt");

                            // prints formatted strings to the file
                            f.format("Invoice" + "\nClient :" + client + "\nProject fees: R" + projectFees + "\nAmount paid: R" + amountPaid + "\nAmount owed: R" + amount_owed);
                            System.out.println("Invoice printed in text file 'invoice.txt' check it out");
                            f.close();
                        } catch (Exception e) {
                            System.out.println("Error");
                        }
                        // if the customer has already fully paid, no invoice is generated.
                    } else if (projectFees <= amountPaid) {
                        System.out.println("No invoice to be generated, the client settled the balance.");
                    }
                    Scanner mark_complete = new Scanner(System.in);
                    System.out.print("Do you want to mark this task complete? (Yes or No) ");
                    String complete_task = mark_complete.nextLine();
                    String complete_taskLower = complete_task.toLowerCase();
                    // if the user chooses to mark the task complete, we mark it with a Yes and assign the current date to the completion date.
                    if (complete_taskLower.equals("yes")) {
                        projectComplete = "Yes";
                        // setting the current date
                        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                        String date = sdf.format(new Date());
                        Date today = sdf.parse(date);
                        completionDate = new SimpleDateFormat("dd-MM-yyyy").format(today);
                        proj1.markComplete(projectComplete, completionDate);
                        System.out.println(proj1.toString());
                        control_edit = false;
                    }
                    // if user chooses not to edit the project, we exit the program.
                } else if (edit_projectLower.equals("no")) {
                    System.out.print("Exit successful, thank you");
                    control_edit = false;
                }
            }
        }

    }

}
