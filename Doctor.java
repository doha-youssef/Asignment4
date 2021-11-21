package factorypattern;
public class Doctor implements Staff
{
    private double salary;
    private double yearsOfWork;
    public Doctor(double salary, double yearsOfWork)
    {
        this.salary=salary;
        this.yearsOfWork=yearsOfWork;
    }
    public String getSalary()
    {
        return "Doctor's Salary is: "+salary;
    }
    public String getYearsOfWork()
    {
        return "Doctor's Years of Work is: "+yearsOfWork;
    }
}
