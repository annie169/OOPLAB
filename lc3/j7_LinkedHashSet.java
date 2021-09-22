import java.util.*;
import java.util.LinkedHashSet;
import java.io.*;
class j7_LinkedHashSet
{
 public static void main(String args[]){
 //Creating HashSet and adding elements
        LinkedHashSet<String> set=new LinkedHashSet<String>();
               set.add("KoK");
               set.add("MaK");
               set.add("rinky");
               set.add("aame");
               set.add("sunny");
               Iterator<String> i=set.iterator();
               while(i.hasNext())
               {
               System.out.println(i.next());
               }
               System.out.println("Size of LinkedHashSet = " +set.size());
 }
}
