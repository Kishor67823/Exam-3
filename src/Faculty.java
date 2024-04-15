public class Faculty extends Employee {
    String officeHours;
    String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String department, double monthlySalary, String dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, department, monthlySalary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        String A = super.toString();
        return A + " office hours: " + officeHours + " rank: " + rank;
    }
}
