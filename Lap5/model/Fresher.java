package Lap5.model;


public class Fresher extends Candidate {
   

      

    private String graduationDate;
    private String graduationRank;
    private String education;

   
    


    public Fresher(String iD, String fullName, String birthDay, String phone, String email, String address,
            String employeeType) {
        super(iD, fullName, birthDay, phone, email, address, employeeType);
    }


   


    public String getGraduationDate() {
        return graduationDate;
    }


    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }


    public String getGraduationRank() {
        return graduationRank;
    }


    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }


    public String getEducation() {
        return education;
    }


    public void setEducation(String education) {
        this.education = education;
    }


    @Override
    public String toString() {
        return "Fresher [graduationDate=" + graduationDate + ", graduationRank=" + graduationRank + ", education="
                + education + "]";
    }

   
}

