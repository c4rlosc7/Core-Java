public class TypeCasting {
    public static void widening() {
       // Widening 
       int i = 100;
       long l = i; //no explicit type casting required
       float f = l;  //no explicit type casting required
       System.out.println("Widening ");
       System.out.println("Int value "+i);
       System.out.println("Long value "+l);
       System.out.println("Float value "+f);
       System.out.println("=======================================");
    }

    public static void narrowing() {
      // Narrowing 
      double d = 100.04;
      long l = (long)d;  //explicit type casting required
      int i = (int)l; //explicit type casting required
      System.out.println("Narrowing ");
      System.out.println("Double value "+d);
      System.out.println("Long value "+l);
      System.out.println("Int value "+i);
      System.out.println("=======================================");
    }
    public static void main(String[] args)
    {
        TypeCasting.widening();
        TypeCasting.narrowing();
    }
}