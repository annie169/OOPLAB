import ArithmeticOperation.Addition;
import ArithmeticOperation.Subtraction;
import ArithmeticOperation.Multiplication;
import ArithmeticOperation.Division;

import java.util.*;
import java.io.*;
class j2_ArithmeticOperationMain
{
    public static void main(String[] args)
    {
      int k;
//     Scanner sc = new Scanner(System.in);
//k=sc.nextInt();

        Addition a = new Addition();
          Subtraction s = new Subtraction();
            Multiplication m = new Multiplication();
              Division d = new Division();
          do
          {
            System.out.println("Enter your choice");
            System.out.println("1.Addition ");
         System.out.println("2.Subtraction ");
          System.out.println("3.Multiplication");
         System.out.println("4.Division");
          Scanner sc = new Scanner(System.in);
k=sc.nextInt();

          switch(k)
          {
            case 1:
                   a.calculate();
                   break;
                   case 2:
                          s.calculate();
                          break;



                          case 3:
                                 m.calculate();
                                 break;
                                 case 4:
                                        d.calculate();
                                        break;

                                        default: System.out.println("WRONG CHOICE");
                                        break;
          }}
          while(k<=4);


    }
}
