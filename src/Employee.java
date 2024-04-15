public abstract class Employee extends Person {
    String department;
    double monthlySalary;
    String dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress, String department, double monthlySalary, String dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.department = department;
        this.monthlySalary = monthlySalary;
        this.dateHired = dateHired;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public String getDepartment() {
        return department;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public String getDateHired() {
        return dateHired;
    }

    @Override
    public String toString() {
        String A = super.toString();
        return A + " department: " + department + " monthly salary: " + monthlySalary + " date hired: " + dateHired;
    }
}
