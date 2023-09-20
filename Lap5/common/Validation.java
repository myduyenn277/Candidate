package Lap5.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import Lap5.model.Candidate;

public class Validation {

 public static Scanner sc=  new Scanner(System.in);
     public static String checkPhone() {
        String phone;
        do {
            phone = sc.nextLine().trim();
            if (!phone.matches("09\\d{8}")) {
                System.out.print("Input error.Phone Number have 10 letters and start with  \"09\". ");
            } else {
                break;
            }
        } while (true);
        return phone;
    }
    

    public static String checkDateOfBirth(Scanner input) {
        String dateOfBirth;
        do {
            dateOfBirth = input.nextLine().trim();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dateFormat.setLenient(false);
            try {
                Date date = dateFormat.parse(dateOfBirth);
                break;
            } catch (ParseException e) {
                System.out.print("Input Errror . Please input the format \"dd/MM/yyyy\": ");
            }
        } while (true);
        return dateOfBirth;
    }

    public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

        

    private static final String EMAIL_VALID
            = "^[A-Za-z0-9.+-_%]+@[A-Za-z.-]+\\.[A-Za-z]{2,4}$";

    public static String checkInputEmail() {
        
        while (true) {
            String result = checkInputString();
        
            if (result.matches(EMAIL_VALID)) {
                return result;
            } else {
                System.err.println("Email with format <account name>@<domain>");
                System.out.print("Enter again: ");
            }
        }
    }
   public static boolean checkIdExist(ArrayList<Candidate> candidates, String id) {
        for (Candidate candidate : candidates) {
            if (candidate.getID().equalsIgnoreCase(id)) {
                System.err.println("Id exist.");
                return false;
            }
        }
        return true;
    }

    public static int getInt( int m, int n) {
        int a = -1;
        while (true) {
            System.out.print(": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= m && a <= n) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between " + m + " and " + n);
            }
        }
        return a;
    }
   
    //  public static int checkInputExprience(String birthDay) {
    //     int yearCurrent = Calendar.getInstance().get(Calendar.YEAR);
    //     int age = yearCurrent -birthDay;
    //     while (true) {
    //       int yearExperience= getInt( 1,100);
    //         if (yearExperience > age) {
    //             System.err.println("Experience must be smaller than age");
    //         } else {
    //             return yearExperience;
    //         }
    //     }

    // }
    public static int checkExpYear() {
        int result = 0;
        try {
            while (true) {
                result = Integer.parseInt(sc.nextLine());
                if (result >= 0 && result <= 100) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Please, input a number with minimum 10 characters! ");
        }
        return result;
    }

     public static String checkGraduationRank() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Excellence")
                    || result.equalsIgnoreCase("Good")
                    || result.equalsIgnoreCase("Fair")
                    || result.equalsIgnoreCase("Poor")) {
                return result;
            } else {
                System.err.println("Please input string: Excellence, Good, Fair, Poor");
                System.out.print("Enter again: ");
            }
        }
    }
    public static boolean checkInputYN() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }


   
}
