package Lap5.model;

public class Experience extends Candidate {

    private int expInYear;
    private String proSkill;
    public Experience(String iD, String fullName, String birthDay, String phone, String email, String address,
            String employeeType) {
        super(iD, fullName, birthDay, phone, email, address, employeeType);
    }
    public int getExpInYear() {
        return expInYear;
    }
    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }
    public String getProSkill() {
        return proSkill;
    }
    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

   

   @Override
    public String toString() {
        return "Experience [expInYear=" + expInYear + ", proSkill=" + proSkill + "]";
    }
}