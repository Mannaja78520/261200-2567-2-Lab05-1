import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob;

    public User() {
        this.name = null;
        this.dob = LocalDate.now();
    }
    public User(String name, int year, int month, int date) {
        this.name = name;
        this.dob = LocalDate.of(year, month, date);
    }

    public void displayInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Date of Birth: " + this.dob);
    }
}
