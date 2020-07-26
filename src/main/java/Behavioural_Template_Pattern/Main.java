package Behavioural_Template_Pattern;
import java.util.*;

public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter dog/cat");
        String option = s.next();
        if(option.equals("Dog"))
        {
            Animal a = new dog();
            a.play();
        }
        else if(option.equals("cat"))
        {
            Animal a = new cat();
            a.play();
        }
        else
        {
            System.out.println("Please enter valid input...");
        }
    }
}
