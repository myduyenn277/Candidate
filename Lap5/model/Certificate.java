package Lap5.model;

public class Certificate {
   
    private String certificateID;
    private String certificateName;
    private String certificateRank;
    private String certificateDate;

    public Certificate(String certificateID, String certificateName, String certificateRank, String certificateDate) {
        this.certificateID = certificateID;
        this.certificateName = certificateName;
        this.certificateRank = certificateRank;
        this.certificateDate = certificateDate;
    }

    public String getCertificateID() {
        return certificateID;
    }

    public void setCertificateID(String certificateID) {
        this.certificateID = certificateID;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getCertificateRank() {
        return certificateRank;
    }

    public void setCertificateRank(String certificateRank) {
        this.certificateRank = certificateRank;
    }

    public String getCertificateDate() {
        return certificateDate;
    }

    public void setCertificateDate(String certificateDate) {
        this.certificateDate = certificateDate;
    }
    public void showInfo() {
        System.out.println("Certificate ID: " + certificateID);
        System.out.println("Certificate Name: " + certificateName);
        System.out.println("Certificate Rank: " + certificateRank);
        System.out.println("Certificate Date: " + certificateDate);

    
}

}

