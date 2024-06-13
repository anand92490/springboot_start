package constructorProject;

public class Student {
    String firstname;
    String lastname;

    Student() {

    }

    Student(String fName, String lName) {
        this.firstname = fName;
        this.lastname = lName;
    }

    public String fullName() {
        if (this.firstname != null && this.lastname != null) {
            String name = this.firstname + " " + this.lastname;
            return name;
        } else {
            return "Unknown";
        }
    }
}
