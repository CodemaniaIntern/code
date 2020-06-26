//Java program for arthimatic series
import java.util.*;
class Arithseries 
{
public static void main(String[] args)
{

int T,n1,n2,nn,d,ap;
Scanner sc=new Scanner(System.in);

T=sc.nextInt();
while(T!=0){
 n1=sc.nextInt();
 n2=sc.nextInt();
 nn=sc.nextInt();
 d=n2-n1;
ap=(n1+(nn-1)*d);  //arthimetic progression formula

System.out.println(ap);
T--;
}
}
}