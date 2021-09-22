import Graphics.Rectangle;
import Graphics.Circle;
import Graphics.Square;
import Graphics.Triangle;
import java.util.*;
import java.io.*;
public class j1_GraphicsPackage
{
    public static void main(String[] args)
    {
      int a;

        Rectangle r = new Rectangle();
          Circle c = new Circle();
          Square s=new Square();
              Triangle t=new Triangle();
          do
          {
            System.out.println("Enter your choice");
            System.out.println("1.calculate area of Rectangle ");
         System.out.println("2.calculate area of Circle ");
          System.out.println("3.calculate area of Square");
         System.out.println("4.calculate area of Triangle");
          Scanner sc = new Scanner(System.in);
a=sc.nextInt();

          switch(a)
          {
            case 1:
                   r.area();
                   break;
                   case 2:
                          c.area();
                          break;



                          case 3:
                                 s.area();
                                 break;
                                 case 4:
                                        t.area();
                                        break;

                                        default: System.out.println("WRONG CHOICE");
                                        break;
          }}
          while(a<=4);


    }
}
