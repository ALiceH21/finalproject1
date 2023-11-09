import java.util.Scanner;
public class Person
{
  private String ch1name;
  private String ch2name;
  private String ch3name;
  
  public Scanner askForCharacter()
  {
   System.out.println("enter the name of a character or person");
   Scanner n = new Scanner(System.in);
   return n;
  }
  
  String[] arr = {ch1name, ch2name, ch3name};

}