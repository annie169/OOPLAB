class CPU
{
double price;
RAM r_obj;
Processor p_obj;
CPU(double p,String r_memory,String r_manufacturer,String p_manufacturer,int p_cores)
{
price=p;
r_obj=new RAM(r_memory,r_manufacturer);
p_obj=new Processor(p_cores,p_manufacturer);
}

class Processor{
int p_cores;
String p_manufacturer;
Processor(int p_cores,String p_manufacturer)
{
this.p_cores=p_cores;
this.p_manufacturer=p_manufacturer;
}

void p_display()
{
System.out.println("Processor Core= "+p_cores);
System.out.println("Processor Manufacturer= "+p_manufacturer);
}
}
static class RAM{
String r_memory;
String r_manufacturer;
RAM(String r_memory,String r_manufacturer)
{
this.r_memory=r_memory;
this.r_manufacturer=r_manufacturer;
}

void r_display()
{
System.out.println("RAM Memory= "+r_memory);
System.out.println("RAM Manufacturer= "+r_manufacturer);
}
}
void display()
{
System.out.println("CPU Price= "+price);
r_obj.r_display();
p_obj.p_display();
}
}

class J8_CPU{
public static void main(String args[]){
CPU c=new CPU(1000,"120GB","RAMmanufacturer","Processormanufacturer",4);
c.display();
}
}
