package factorypattern;
public class MemberFactory 
{
    public Staff getStaff(String staffName)
    {
        String str = staffName.toLowerCase();
        if(str=="teaching assistant")
            return new TeachingAssistant(0,0);
        else if(str=="doctor")
            return new Doctor(0,0);
        else
            return null;
    }
}
