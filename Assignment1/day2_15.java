/*30.Write a program to find minimum and maximum number as well as
to add two double numbers using methods of Double.*/

class day2_15
{
    public static void main(String args[])
    {
        double num1 = 24.41d;
        double num2 = 19.46d;
        double max_no = Math.max(num1,num2);
        double min_no = Math.min(num1,num2);
        double Result = Double.sum(num1,num2);
        System.out.println("maximum value =" +max_no);
        System.out.println("manimum value =" +min_no);
        System.out.println("Result =" +Result);
    }
}
            