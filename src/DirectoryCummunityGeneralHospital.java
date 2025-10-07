import java.util.Arrays;

//Class: CSE 1321L
//Section: J52
//Term: Spring 2023
//Instructor: Chandana Avadhani
//Name: Mavis Phaphol
//Assignment#: 5A
import java.util.Scanner;
public class Assignment5A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[Community General Hospital Directory]");
        //arrays of directory
        Object[] firstID = {0, "Mark", "Sloan", 67, "Chief of Internal Medicine", "Medical License: TRUE"};
        Object[] secondID = {1, "Amanda", "Bentley", 33, "Pathologist", "Medical License: TRUE"};
        Object[] thirdID = {2, "Norman", "Briggs", 47, "Administrator", "Medical License: FALSE"};
        Object[] fourthID = {3, "Steve", "Sloan", 35, "Hospital Security", "Medical License: FALSE"};
        Object[] fifthID = {4, "Jesse", "Travis", 24, "Surgeon Intern", "Medical License: TRUE"};
        //loops
        int userChoice = 0;
        while(userChoice!=4){
            System.out.println("1) List all employees\n2) Search employee by ID\n3) Search employee by Last Name\n4) Quit");
            System.out.print("Choice: ");
            userChoice = sc.nextInt();
            if (userChoice == 1) {//lists all employees in directory
                System.out.println("#" + firstID[0] + ": " + firstID[1] + " " + firstID[2] + ", Age " + firstID[3] + ", " + firstID[4] + ", " + firstID[5]);
                System.out.println("#" + secondID[0] + ": " + secondID[1] + " " + secondID[2] + ", Age " + secondID[3] + ", " + secondID[4] + ", " + secondID[5]);
                System.out.println("#" + thirdID[0] + ": " + thirdID[1] + " " + thirdID[2] + ", Age " + thirdID[3] + ", " + thirdID[4] + ", " + thirdID[5]);
                System.out.println("#" + fourthID[0] + ": " + fourthID[1] + " " + fourthID[2] + ", Age " + fourthID[3] + ", " + fourthID[4] + ", " + fourthID[5]);
                System.out.println("#" + fifthID[0] + ": " + fifthID[1] + " " + fifthID[2] + ", Age " + fifthID[3] + ", " + fifthID[4] + ", " + fifthID[5]);
            } else if (userChoice == 2) {//search by id
                int idNum = 0;
                while (idNum < 4 || idNum > 0) {
                    System.out.print("ID: ");
                    idNum = sc.nextInt();
                    if (idNum == 0) {
                        System.out.println("#" + firstID[0] + ": " + firstID[1] + " " + firstID[2] + ", Age " + firstID[3] + ", " + firstID[4] + ", " + firstID[5]);
                        System.out.println("#" + fourthID[0] + ": " + fourthID[1] + " " + fourthID[2] + ", Age " + fourthID[3] + ", " + fourthID[4] + ", " + fourthID[5]);
                        break;
                    } else if (idNum == 1) {
                        System.out.println("#" + secondID[0] + ": " + secondID[1] + " " + secondID[2] + ", Age " + secondID[3] + ", " + secondID[4] + ", " + secondID[5]);
                        break;
                    } else if (idNum == 2) {
                        System.out.println("#" + thirdID[0] + ": " + thirdID[1] + " " + thirdID[2] + ", Age " + thirdID[3] + ", " + thirdID[4] + ", " + thirdID[5]);
                        break;
                    } else if (idNum == 3) {
                        System.out.println("#" + firstID[0] + ": " + firstID[1] + " " + firstID[2] + ", Age " + firstID[3] + ", " + firstID[4] + ", " + firstID[5]);
                        System.out.println("#" + fourthID[0] + ": " + fourthID[1] + " " + fourthID[2] + ", Age " + fourthID[3] + ", " + fourthID[4] + ", " + fourthID[5]);
                        break;
                    } else if (idNum == 4) {
                        System.out.println("#" + fifthID[0] + ": " + fifthID[1] + " " + fifthID[2] + ", Age " + fifthID[3] + ", " + fifthID[4] + ", " + fifthID[5]);
                        break;
                    } else {
                        System.out.println("Invalid ID!");
                    }
                }
            }
            //used https://stackoverflow.com/questions/20246120/using-array-strings-in-an-if-statement to figure out how to compare string with arrays
            else if (userChoice == 3) { //search by last name
                System.out.print("Last Name: ");
                String surName = sc.next();
                if (surName.equals(firstID[2]) || surName.equals(fourthID[2])) {
                    System.out.println("#" + firstID[0] + ": " + firstID[1] + " " + firstID[2] + ", Age " + firstID[3] + ", " + firstID[4] + ", " + firstID[5]);
                    System.out.println("#" + fourthID[0] + ": " + fourthID[1] + " " + fourthID[2] + ", Age " + fourthID[3] + ", " + fourthID[4] + ", " + fourthID[5]);
                } else if (surName.equals(secondID[2])) {
                    System.out.println("#" + secondID[0] + ": " + secondID[1] + " " + secondID[2] + ", Age " + secondID[3] + ", " + secondID[4] + ", " + secondID[5]);
                } else if (surName.equals(thirdID[2])) {
                    System.out.println("#" + thirdID[0] + ": " + thirdID[1] + " " + thirdID[2] + ", Age " + thirdID[3] + ", " + thirdID[4] + ", " + thirdID[5]);
                } else if (surName.equals(fifthID[2])) {
                    System.out.println("#" + fifthID[0] + ": " + fifthID[1] + " " + fifthID[2] + ", Age " + fifthID[3] + ", " + fifthID[4] + ", " + fifthID[5]);
                } else {
                    System.out.println("No Records Found!");
                }
            } else if (userChoice == 4) { //to quit program
                System.out.println("[Closing Directory...]");
            }
            else if (userChoice>4||userChoice<0) {
                System.out.println("No option " + userChoice);
                System.out.print("Choice: ");
                userChoice = sc.nextInt();
                if (userChoice == 1) {//lists all employees in directory
                    System.out.println("#" + firstID[0] + ": " + firstID[1] + " " + firstID[2] + ", Age " + firstID[3] + ", " + firstID[4] + ", " + firstID[5]);
                    System.out.println("#" + secondID[0] + ": " + secondID[1] + " " + secondID[2] + ", Age " + secondID[3] + ", " + secondID[4] + ", " + secondID[5]);
                    System.out.println("#" + thirdID[0] + ": " + thirdID[1] + " " + thirdID[2] + ", Age " + thirdID[3] + ", " + thirdID[4] + ", " + thirdID[5]);
                    System.out.println("#" + fourthID[0] + ": " + fourthID[1] + " " + fourthID[2] + ", Age " + fourthID[3] + ", " + fourthID[4] + ", " + fourthID[5]);
                    System.out.println("#" + fifthID[0] + ": " + fifthID[1] + " " + fifthID[2] + ", Age " + fifthID[3] + ", " + fifthID[4] + ", " + fifthID[5]);
                } else if (userChoice == 2) {//search by id
                    int idNum = 0;
                    while (idNum < 4 || idNum > 0) {
                        System.out.print("ID: ");
                        idNum = sc.nextInt();
                        if (idNum == 0) {
                            System.out.println("#" + firstID[0] + ": " + firstID[1] + " " + firstID[2] + ", Age " + firstID[3] + ", " + firstID[4] + ", " + firstID[5]);
                            System.out.println("#" + fourthID[0] + ": " + fourthID[1] + " " + fourthID[2] + ", Age " + fourthID[3] + ", " + fourthID[4] + ", " + fourthID[5]);
                            break;
                        } else if (idNum == 1) {
                            System.out.println("#" + secondID[0] + ": " + secondID[1] + " " + secondID[2] + ", Age " + secondID[3] + ", " + secondID[4] + ", " + secondID[5]);
                            break;
                        } else if (idNum == 2) {
                            System.out.println("#" + thirdID[0] + ": " + thirdID[1] + " " + thirdID[2] + ", Age " + thirdID[3] + ", " + thirdID[4] + ", " + thirdID[5]);
                            break;
                        } else if (idNum == 3) {
                            System.out.println("#" + firstID[0] + ": " + firstID[1] + " " + firstID[2] + ", Age " + firstID[3] + ", " + firstID[4] + ", " + firstID[5]);
                            System.out.println("#" + fourthID[0] + ": " + fourthID[1] + " " + fourthID[2] + ", Age " + fourthID[3] + ", " + fourthID[4] + ", " + fourthID[5]);
                            break;
                        } else if (idNum == 4) {
                            System.out.println("#" + fifthID[0] + ": " + fifthID[1] + " " + fifthID[2] + ", Age " + fifthID[3] + ", " + fifthID[4] + ", " + fifthID[5]);
                            break;
                        } else {
                            System.out.println("Invalid ID!");
                        }
                    }
                }
                //used https://stackoverflow.com/questions/20246120/using-array-strings-in-an-if-statement to figure out how to compare string with arrays
                else if (userChoice == 3) { //search by last name
                    System.out.print("Last Name: ");
                    String surName = sc.next();
                    if (surName.equals(firstID[2]) || surName.equals(fourthID[2])) {
                        System.out.println("#" + firstID[0] + ": " + firstID[1] + " " + firstID[2] + ", Age " + firstID[3] + ", " + firstID[4] + ", " + firstID[5]);
                        System.out.println("#" + fourthID[0] + ": " + fourthID[1] + " " + fourthID[2] + ", Age " + fourthID[3] + ", " + fourthID[4] + ", " + fourthID[5]);
                    } else if (surName.equals(secondID[2])) {
                        System.out.println("#" + secondID[0] + ": " + secondID[1] + " " + secondID[2] + ", Age " + secondID[3] + ", " + secondID[4] + ", " + secondID[5]);
                    } else if (surName.equals(thirdID[2])) {
                        System.out.println("#" + thirdID[0] + ": " + thirdID[1] + " " + thirdID[2] + ", Age " + thirdID[3] + ", " + thirdID[4] + ", " + thirdID[5]);
                    } else if (surName.equals(fifthID[2])) {
                        System.out.println("#" + fifthID[0] + ": " + fifthID[1] + " " + fifthID[2] + ", Age " + fifthID[3] + ", " + fifthID[4] + ", " + fifthID[5]);
                    } else {
                        System.out.println("No Records Found!");
                    }
                } else if (userChoice == 4) { //to quit program
                    System.out.println("[Closing Directory...]");
                }
            }
        }
    }
}
