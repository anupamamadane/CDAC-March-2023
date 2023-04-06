class day2_2
  {
    public static void main(String args[])
    {
  String s1="true";
    String s2="True";
    boolean b3= Boolean.parseBoolean(s1); //here unboxing is happen as boolean is primitive then primitive to nonpremitive conversion we use parse method
    boolean b4= Boolean.parseBoolean(s2);
    System.out.println("boolean value is: "+b3);
    System.out.println("boolean value is: "+b4);
    }
  }
