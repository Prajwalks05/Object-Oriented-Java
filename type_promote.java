class promote
  {
    public static void main(String args[])
    {
      byte b=42;
      char c='a';
      short s=1024;
      int i=5000;
      float f=(float) 1.4;
      double result=(f*b)+(1/c)-(b*s);
      System.out.println("The value of result is: "+(result));
    }
  }
