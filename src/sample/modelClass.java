package sample;

import java.time.LocalDate;



public class modelClass {
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String option;
    private String annee;


    public modelClass(String FirstName, String LastName, LocalDate Birthday, String Option, String Annee) {
        this.firstName = FirstName;
        this.lastName = LastName;
        this.birthday = Birthday;
        this.option = Option;
        this.annee = Annee;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String Annee) {
        this.annee = Annee;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }


    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

}
