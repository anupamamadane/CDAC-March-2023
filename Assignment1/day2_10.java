//que 11
import java.util.*;
class day2_10  //take input
{
    public static void main(String args [])   //if entered char is digit
    {

        Scanner sc = new Scanner (System.in);
        char ch,ch1;
        System.out.ptintln("Enter the value");
        ch=sc.next().charAt(0);
        boolean condition = Character.getNumbericvalue(ch);//if entered char is digit
  if(condition)
  {
    int digi=character.getNumbericValue(ch);
    System.out.ptintln("Digit is =" +digit);
  }
  else{
    if(ch>97&&ch<122)
    {
        ch1 = Character.toUppercase(ch);
        System.out.println("Uppercase Letter = " +ch1);
    }
  }
    }       

}