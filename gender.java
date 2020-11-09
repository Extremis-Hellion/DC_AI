import java.util.*;
import java.util.concurrent.TimeUnit;
public class gender
{
    private String gender;
    Scanner sc = new Scanner(System.in);
    public void gender() throws InterruptedException
    {
        System.out.println("Are you a boy or a girl?");
        gender = sc.nextLine();
        if(gender.equals("boy")||gender.equals("man")||gender.equals("boi")||gender.equals("male"))//checks gender(male) in lower-case
        {
            System.out.println("OK Sir!");
        }
        else if(gender.equals("BOY")||gender.equals("MAN")||gender.equals("BOI")||gender.equals("MALE"))//checks gender(male) in upper-case
        {
            System.out.println("OK Sir!");
        }
        else if(gender.equals("girl")||gender.equals("female")||gender.equals("gurl")||gender.equals("gul"))//checks gender(female) in lower-case
        {
            System.out.println("OK Mam!");
        }
        else if(gender.equals("GIRL")||gender.equals("FEMALE")||gender.equals("GURL")||gender.equals("GUL"))//checks gender(female) in upper*case
        {
            System.out.println("OK Mam!");
        }
        else if(gender.equals("gay")||gender.equals("Gay")||gender.equals("GAY")||gender.equals("GUL"))//checks gender(gay)
        {
            System.out.println("Ohh! Bhago BC Chakka aaya!!");
            TimeUnit.SECONDS.sleep(7);
            System.exit(0);
        }
    }

    public static void main(String args[])throws InterruptedException
    {
        gender run = new gender(); 
        run.gender();
    }
}