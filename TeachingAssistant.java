package factorypattern;
public class TeachingAssistant implements Staff
{
    private double salary;
    private double yearsOfWork;
    public TeachingAssistant(double salary, double yearsOfWork)
    {
        this.salary=salary;
        this.yearsOfWork=yearsOfWork;
    }
    public String getSalary()
    {
        return "Teaching Assistant's Salary is: "+salary;
    }
    public String getYearsOfWork()
    {
        return "Teaching Assistant's Years of Work is: "+yearsOfWork;
    }
}
