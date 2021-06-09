import java.util.*;
class product{
int pcode;
String pname;
double price;

void setData(int code,String name,double prc)
{
pcode=code;
pname=name;
price=prc;
}
void getData()
{
System.out.println("Product code: "+pcode);
System.out.println("Product name: "+pname);
System.out.println("Product price: "+price);
}

void lowerPrice(product p1,product p2)
{
if(price<=p1.price&&price<=p2.price)

System.out.println(price+" has the smallest price");

else if(p1.price<=price&&p2.price<=price)

System.out.println(p1.price+" has the smallest price");
else
//print c if the above conditions are false
System.out.println(p2.price+" has the smallest price");
}
}

class J6_Product{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int code;
double price;
String name;
product prod1=new product();
product prod2=new product();
product prod3=new product();

System.out.println("Enter the details of 1st product:");
System.out.println("Enter the product name: ");
name=sc.nextLine();

System.out.println("Enter the product code: ");
code=sc.nextInt();

System.out.println("Enter the product price: ");
price=sc.nextDouble();

prod1.setData(code,name,price);


System.out.println("Enter the details of 2nd product:");
sc.nextLine();
System.out.println("Enter the product name: ");
name=sc.nextLine();

System.out.println("Enter the product code: ");
code=sc.nextInt();

System.out.println("Enter the product price: ");
price=sc.nextDouble();

prod2.setData(code,name,price);

System.out.println("Enter the details of 3rd product:");
sc.nextLine();
System.out.println("Enter the product name: ");
name=sc.nextLine();

System.out.println("Enter the product code: ");
code=sc.nextInt();

System.out.println("Enter the product price: ");
price=sc.nextDouble();

prod3.setData(code,name,price);

System.out.println("Product 1");
prod1.getData();

System.out.println("Product 2");
prod2.getData();

System.out.println("Product 3");
prod3.getData();
prod1.lowerPrice(prod2,prod3);
}
}
