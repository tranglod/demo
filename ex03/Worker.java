package tut10.ex03;

public class Worker extends Human {
    private double salaryPerHour;
    private double hoursPerDay;
    private double weekSalary;

    public Worker(String firstName, String lastName, double hoursPerDay, double weekSalary) {
        super(firstName, lastName);
        this.hoursPerDay = hoursPerDay;
        this.weekSalary = weekSalary;
    }

    @Override
    public void setLastName(String lastName) throws IllegalArgumentException{
        if(lastName.length() < 3) {
            throw new IllegalArgumentException("Expected length more than 3 symbols! Argument: lastName");
        }
        super.setLastName(lastName);
    }

    public double getSalaryPerHour() {
        salaryPerHour = (weekSalary / 7) / hoursPerDay;
        return Math.round(salaryPerHour * 100.0)/100.0;
    }

    public void setSalaryPerHour(double salaryPerHour) throws IllegalArgumentException{
        if(salaryPerHour < 1 || salaryPerHour > 12) {
            throw new IllegalArgumentException("Expected value mismatch! Argument: workHoursPerDay");
        } else {
            this.salaryPerHour = salaryPerHour;
        }
    }

    public double getHoursPerDay() {
        return hoursPerDay;
    }

    public void setHoursPerDay(double hoursPerDay) {
        this.hoursPerDay = hoursPerDay;
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(double weekSalary) throws IllegalArgumentException{
        if(weekSalary < 10) {
            throw new IllegalArgumentException("Expected value mismatch! Argument: weekSalary");
        }
        this.weekSalary = weekSalary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("First Name: ").append(this.getFirstName())
                .append(System.lineSeparator())
                .append("Last Name: ").append(this.getLastName())
                .append(System.lineSeparator())
                .append("Week Salary: ").append(this.getWeekSalary())
                .append(System.lineSeparator())
                .append("Hours per day: ").append(this.getHoursPerDay())
                .append(System.lineSeparator())
                .append("Salary per hour: ").append(this.getSalaryPerHour())
                .append(System.lineSeparator());
        return sb.toString();
    }
}
