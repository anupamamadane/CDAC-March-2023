//convert state of double intance into byte,short,int double float short
class day2_14{
public static void main(String args[])
{
    double value = 25762;
    Double bs = new Double(value);
    
    byte num1 = bs.bytevalue();
    System.out.println("num1 :" +num1);//double instnce into byte

    short num2= bs.shortvalue();
    System.out.println("num2 :" +num2);//double instnce into short


    int num3 = bs.intvalue();
    System.out.println("num3 :" +num3);//double long instnce into int

    long num4 = bs.doublevalue();
    System.out.println("num4 :" +num4);//double instnce into long

    float num5 = bs.floatvalue();
    System.out.println("num5 :" +num5);//long instnce into float

    
}
}
    

