//convert state of long intance into byte,short,int double float short
class day2_13{
public static void main(String args[])
{
    long value = 25762;
    Long bs = new Long(value);
    
    byte num1 = bs.bytevalue();
    System.out.println("num1 :" +num1);//long instnce into byte

    short num2= bs.shortvalue();
    System.out.println("num2 :" +num2);//long instnce into byte


    int num3 = bs.intvalue();
    System.out.println("num3 :" +num3);//long instnce into byte

    double num4 = bs.doublevalue();
    System.out.println("num4 :" +num4);//long instnce into byte

    float num5 = bs.floatvalue();
    System.out.println("num5 :" +num5);//long instnce into byte

    
}
}
    

