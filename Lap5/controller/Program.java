package Lap5.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import Lap5.common.Validation;
import Lap5.model.Candidate;
import Lap5.model.Experience;
import Lap5.model.Fresher;
import Lap5.model.Intern;
import Lap5.view.Menu;

    public class Program extends Menu<String> {

        static String[] opsList = {"Candidate", "Search", "Exit"};
        protected ArrayList<Candidate> candidateList;
        Validation validation = new Validation();
        Scanner sc = new Scanner(System.in);
    
        public Program() {
            super("Candidate Menu", opsList);
            candidateList = new ArrayList<>();
        }
    
        @Override
        public void execute(int n) {
            switch (n) {
                case 1: {
         createCandidate(candidateList, n);
                    break;
                }
                
                case 4: {
                    printListNameCandidate(candidateList);
                    search(candidateList);
                    break;
                }
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Please, enter again!");
            }
        }
 

private void search(ArrayList<Candidate> candidateList2) {
        }

public static void createCandidate(ArrayList<Candidate> candidates,
            int type) {
        while (true) {
            System.out.print("Enter id: ");
            String id = Validation.checkInputString();
            System.out.print("Enter first name: ");
            String fullName = Validation.checkInputString();
            System.out.print("Enter birth date: ");
           String birthDay = Validation.checkDateOfBirth(null);
            System.out.print("Enter phone ");
            String phone = Validation.checkPhone();
             System.out.print("Enter email: ");
            String email = Validation.checkInputEmail();
            System.out.print("Enter address: ");
            String address = Validation.checkInputString();
            System.out.println("Enter Employee Type");
            String employeeType=Validation.checkInputString();
        Candidate candidate =new Candidate(id, fullName,birthDay, phone, email, address, employeeType);
       

            if (Validation.checkIdExist(candidates, id)) {
                switch (type) {
                    case 0:
                        createExperience(candidates, candidate);
                        break;
                    case 1:
                        createFresher(candidates, candidate);
                        break;
                    case 2:
                        createInternship(candidates, candidate);
                        break;
                }
            } else {
                return;
            }
            System.out.print("Do you want to continue (Y/N): ");
            if (!Validation.checkInputYN()) {
                return;
            }
        }
    }

public static void createFresher(ArrayList<Candidate> candidates,
Candidate candidate) 
{
Scanner sc= new Scanner(System.in);
System.out.print("Enter graduation date: ");
String graduationDate = Validation.checkInputString();
System.out.print("Enter graduation rank: ");
String graduationRank = Validation.checkGraduationRank();
System.out.println("Enter education");
String education=sc.nextLine();
candidates.add(new Fresher( candidate.getID(),candidate.getFullName(),
candidate.getBirthDay(),candidate.getPhone(),candidate.getEmail(),candidate.getAddress()
    ,candidate.getEmployeeType()));
System.out.println("Create success.");
}

   public static void createExperience(ArrayList<Candidate> candidates,
     Candidate candidate) {
     System.out.print("Enter year of experience: ");
    int expInYear  = Validation.checkExpYear();
    System.out.print("Enter professional skill: ");
    String proSkill = Validation.checkInputString();
    candidates.add(new  Experience (
    candidate.getID(), candidate.getFullName(),
    candidate.getBirthDay(), candidate.getAddress(),
    candidate.getPhone(), candidate.getEmail(), candidate.getEmployeeType()));
    System.out.println("Create success");

    }


public static void createInternship(ArrayList<Candidate> candidates,
    Candidate candidate) {
System.out.print("Enter major: ");
String major = Validation.checkInputString();
System.out.print("Enter semester: ");
String semester = Validation.checkInputString();
System.out.print("Enter university: ");
String universityName = Validation.checkInputString();
candidates.add(new Intern(candidate.getID(),candidate.getFullName(),candidate.getBirthDay(),
candidate.getPhone(),candidate.getEmail(),candidate.getAddress()
    ,candidate.getEmployeeType()));
System.err.println("Create success.");
}

public static void searchCandidate(ArrayList<Candidate> candidates) {
        printListNameCandidate(candidates);
        System.out.print("Enter andidate name (First name or Last name): ");
        String nameSearch = Validation.checkInputString();
        System.out.print("Enter type of candidate: ");
        int typeCandidate = Validation.getInt(0, 2);
        for (Candidate candidate : candidates) {
            if (candidate.getEmployeeType() ==employeeType
                    && candidate.getFullName().contains(nameSearch)) {
                System.out.println(candidate.toString());
            }
        }
    }

    public static void printListNameCandidate(ArrayList<Candidate> candidates) {
        System.err.println("Experience Candidate");
        for (Candidate candidate : candidates) {
            if (candidate instanceof Experience) {
                System.out.println(candidate.getFullName() + " "
                        + candidate.getFullName());
            }
        }
        System.err.println("Fresher Candidate");
        for (Candidate candidate : candidates) {
            if (candidate instanceof Fresher) {
                System.out.println(candidate.getFullName() + " "
                        + candidate.getFullName());
            }
        }
        System.err.println("Internship Candidate");
        for (Candidate candidate : candidates) {
            if (candidate instanceof Intern) {
                System.out.println(candidate.getFullName() + " "
                        + candidate.getFullName());
            }
        }
    }
}