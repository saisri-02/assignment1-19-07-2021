import java.util.*;
public class Diffoperations.java
{
public static void main(String args[])
{
Map<Integer,Integer> h=new HashMap<Integer,Integer>();
Scanner sc=new Scanner(System.in);
do
{
System.out.println("a) add key x and value y");
System.out.println("b) print value of key x");
System.out.println("c) print size of Hashmap");
System.out.println("d) Remove key x");
System.out.println("Enter your choice : ");
String ch=sc.next();
switch(ch)
{
case "a":
System.out.println("Enter key x : ");
int x=sc.nextInt();
System.out.println("Enter value y : ");
int y=sc.nextInt();
h.put(x,y);
break;
case "b":
System.out.println("Enter key x : ");
int m=sc.nextInt();
if(h.containsKey(m))
{
System.out.println("Value of x is : "+h.get(m));
}
else
{
System.out.println("-1");
}
break;
case "c":
System.out.println("Size of Hashmap : "+h.size());
break;
case "d":
System.out.println("Enter key to remove : ");
int n=sc.nextInt();
System.out.println(h.remove(n));
break;
default:
System.exit(0);
break;
}
}while(true);
}
}

output:

a) add key x and value y
b) print value of key x
c) print size of Hashmap
d) Remove key x
Enter your choice : 
a
Enter key x : 
1  
Enter value y : 
2
a) add key x and value y
b) print value of key x
c) print size of Hashmap
d) Remove key x
Enter your choice : 
a
Enter key x : 
66
Enter value y : 
3
a) add key x and value y
b) print value of key x
c) print size of Hashmap
d) Remove key x
Enter your choice : 
b
Enter key x : 
66
Value of x is : 3
a) add key x and value y
b) print value of key x
c) print size of Hashmap
d) Remove key x
Enter your choice : 
d
Enter key to remove : 
1
2
a) add key x and value y
b) print value of key x
c) print size of Hashmap
d) Remove key x
Enter your choice : 
c
Size of Hashmap : 1
a) add key x and value y
b) print value of key x
c) print size of Hashmap
d) Remove key x
Enter your choice : 
r
