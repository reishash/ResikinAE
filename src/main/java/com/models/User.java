package src.main.java.com.models;

public class User {
    private String fullName;
    private String birthDate;
    private String motherName;
    private String username;
    private String password;

    // Constructor
    public User(String fullName, String birthDate, String motherName, String username, String password) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.motherName = motherName;
        this.username = username;
        this.password = password;
    }

    // Getter dan Setter untuk fullName
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    // Getter dan Setter untuk birthDate
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    // Getter dan Setter untuk motherName
    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    // Getter dan Setter untuk username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter dan Setter untuk password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
