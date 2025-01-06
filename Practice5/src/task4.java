import java.util.*; 
 
public class task4 
{ 
    public static void main(String[] args) 
    { 
       double                 leftOperand, result, rightOperand; 
       String                 leftString, operator, rightString; 
       StringTokenizer        tokenizer; 
       Scanner in = new Scanner(System.in); 
        
       String input = in.nextLine(); 
       String[] expressions = input.split(" "); 
        
       for (String expression : expressions) { 
        tokenizer = new StringTokenizer(expression, "+-*/", true); 
        try 
           { 
              leftString   = tokenizer.nextToken(); 
              operator     = tokenizer.nextToken(); 
              rightString  = tokenizer.nextToken(); 
               
              try { 
               leftOperand  = Double.parseDouble(leftString); 
              } catch (NumberFormatException nfe) { 
               System.out.println("Invalid left operand. It is not a number."); 
               continue; 
              } 
               
              try { 
                  rightOperand = Double.parseDouble(rightString); 
              } catch (NumberFormatException nfe) { 
               System.out.println("Invalid right operand. It is not a number"); 
               continue; 
              } 
               
              if (operator.equals("+")) { 
               result = leftOperand + rightOperand; 
              } else if (operator.equals("-")) { 
               result = leftOperand - rightOperand; 
              } else if (operator.equals("*")) { 
               result = leftOperand * rightOperand; 
              } else if (operator.equals("/")) { 
               if (rightOperand == 0) { 
                System.out.println("Can't divide by 0."); 
                continue; 
               } 
               result = leftOperand / rightOperand; 
              } else { 
               result = 0.0; 
              } 
               
              System.out.println(expression + " = " +result); 
           } catch (NoSuchElementException nsee) { 
           System.out.println("Invalid syntax"); 
           nsee.printStackTrace(); 
           } 
        } 
       in.close(); 
    } 
}

//import java.util.*;
//
//public class Example4
//{
//    public static void main(String[] args)
//    {
//       double                 leftOperand, result, rightOperand;
//       String                 leftString, operator, rightString;
//       StringTokenizer        tokenizer;
//       Scanner in = new Scanner(System.in);
//
//       tokenizer = new StringTokenizer(in.nextLine(), "+", true);
//
//       try
//       {
//          leftString   = tokenizer.nextToken();
//          operator     = tokenizer.nextToken();
//          rightString  = tokenizer.nextToken();
//
//          leftOperand  = Double.parseDouble(leftString);
//          rightOperand = Double.parseDouble(rightString);
//
//          if (operator.equals("+"))
//             result = leftOperand + rightOperand;
//          else
//             result = 0.0;
//
//          System.out.println("Result: " + result);
//       }
//       catch (NoSuchElementException nsee)
//       {
//          System.out.println("Invalid syntax");
//       }
//       catch (NumberFormatException nfe)
//       {
//          System.out.println("One or more operands is not a number");
//       }
//
//
//    }
//}