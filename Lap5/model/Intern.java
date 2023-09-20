package Lap5.model;


    public class Intern extends Candidate {

        public Intern(String iD, String fullName, String birthDay, String phone, String email, String address,
                String employeeType) {
            super(iD, fullName, birthDay, phone, email, address, employeeType);
           
        }

        private String majors;
        private String semester;
        private String universityName;
    
        
        
        public String getMajors() {
            return majors;
        }
    
        public void setMajors(String majors) {
            this.majors = majors;
        }
    
        public String getSemester() {
            return semester;
        }
        public void setSemester(String semester) {
            this.semester = semester;
        }
        public String getUniversityName() {
            return universityName;
        }
        public void setUniversityName(String universityName) {
            this.universityName = universityName;
        }

        @Override
        public String toString() {
            return "Intern [majors=" + majors + ", semester=" + semester + ", universityName=" + universityName + "]";
        }
    
       
                }
    
    
