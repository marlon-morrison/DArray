public class DemoArray {
   public static void main(String[] args) {
      double[] salaries = new double[4];
      salaries[0] = 6.25;
      salaries[1] = 6.55;
      salaries[2] = 10.25;
      salaries[3] = 16.85;
      
      double[] salaries2 = {6.25, 6.55, 10.25, 16.85};
      
      double[] salaries3 = {6.25, 6.55, 10.25, 16.85};
      
      System.out.println("Salaries one by one are:");
      System.out.println(salaries[0]);
      System.out.println(salaries[1]);
      System.out.println(salaries[2]);
      System.out.println(salaries[3]);
      System.out.println("");
      
      System.out.println("Salaries 2v one by one are:");
      System.out.println(salaries2[0]);
      System.out.println(salaries2[1]);
      System.out.println(salaries2[2]);
      System.out.println(salaries2[3]);
      System.out.println("");
      
      System.out.println("Salaries 3v one by one are:");
      for(int x = 0; x < salaries3.length; ++x)
         System.out.println(salaries3[x]);
   }
}