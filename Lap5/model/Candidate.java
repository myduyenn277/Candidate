package Lap5.model;

public  class Candidate {
    private String ID;
        private String fullName;
        private String birthDay;
        private String phone;
        private String email;
        private String address;
        private String employeeType;
      
        public Candidate(String iD, String fullName,String birthDay, String phone, String email, String address,String employeeType
               ) {
            ID = iD;
            this.fullName = fullName;
            this.birthDay = birthDay;
            this.phone = phone;
            this.email = email;
            this.address = address;
         
        }
        public String getID() {
            return ID;
        }
        public void setID(String iD) {
            ID = iD;
        }
        public String getFullName() {
            return fullName;
        }
        public void setFullName(String fullName) {
            this.fullName = fullName;
        }
        public String getBirthDay() {
            return birthDay;
        }
        public void setBirthDay(String birthDay) {
            this.birthDay = birthDay;
        }
        public String getPhone() {
            return phone;
        }
        public void setPhone(String phone) {
            this.phone = phone;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }
        public String getEmployeeType() {
            return employeeType;
        }
        public void setEmployeeType(String employeeType) {
            this.employeeType = employeeType;
        }
        
       
   
}
        