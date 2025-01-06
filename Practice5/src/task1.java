//public class Example1
//{
//    public static void main(String[] args)
//    {
//	int     denominator, numerator, ratio;
//
//
//	numerator   = 5;
//	denominator = 2;
//
//    ratio = numerator / denominator;
//	System.out.println("The answer is: "+ratio);
//
//	System.out.println("Done."); // Don't move this line
//    }
//}

public class task1 { 
 public static void main(String[] args) 
    { 
  int     denominator, numerator, ratio; 
 
  numerator   = 5; 
  denominator = 0; 
  
  try { 
   ratio = numerator / denominator; 
   System.out.println("The answer is: "+ratio); 
 
  } 
  catch(ArithmeticException e ){ 
   System.out.println("Divided by 0"); 
   e.printStackTrace(); 
  }
  System.out.println("Done."); // Don't move this line 
    } 
 
}