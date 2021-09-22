import java.io.*;
import java.util.*;
public class j6_TreeSet {

    public static void main(String[] args) {

        TreeSet<Integer> tSet = new TreeSet<Integer>();
          tSet.add(30);
            tSet.add(11);
              tSet.add(99);
        tSet.add(7);
        tSet.add(3);
        tSet.add(9);
        tSet.add(5);
        tSet.add(1);

        System.out.println("TreeSet contains: " + tSet);

System.out.println("Reverse Set contains:  ");
Iterator i=tSet.descendingIterator();
while(i.hasNext())
{
System.out.println(i.next());
}

    }
}
