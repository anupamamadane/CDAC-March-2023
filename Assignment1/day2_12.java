//Ass13
class day2_12
{
    public static void main(String args[])
    {
        short sh = 1221;
        String b=Short.toString(sh);
        System.out.println("short value into String:" +b);

        Short a1=Short.valueof(sh);
        System.out.println("short value into String:" +a1);

    
        String s="3345";
        Short a2=Short.valueof(s);
        System.out.println("string value into Short instance :"+a2);
    }
}
