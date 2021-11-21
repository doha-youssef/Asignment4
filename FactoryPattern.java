package factorypattern;
import java.util.Scanner;
public class FactoryPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Staff Type: ");
        String s=input.next();
        TeachingAssistant t = new TeachingAssistant(2000,3);
        Doctor d = new Doctor(5000,10);
        MemberFactory m = new MemberFactory();
        Staff st = m.getStaff(s);
        System.out.println(st.getSalary());
        System.out.println(st.getYearsOfWork());
    }
    
}
