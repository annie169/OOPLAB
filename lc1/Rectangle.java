class Rectangle{
float length;
float breadth;

void setData(float a,float b)
{
length=a;
breadth=b;
}
float getArea()
{
return length*breadth;
}
}

class J2_rectanglearea
{
public static void main(String args[])
{
Rectangle R1=new Rectangle();
R1.setData(12.4f,13f);
float r1area=R1.getArea();
System.out.println("Area of R1:  "+r1area);

Rectangle R2=new Rectangle();
R2.setData(10.5f,9f);
float r2area=R2.getArea();
System.out.println("Area of R2:  "+r2area);

Rectangle R3=new Rectangle();
R3.setData(13f,14f);
float r3area=R3.getArea();
System.out.println("Area of R3:  "+r3area);

}
}

