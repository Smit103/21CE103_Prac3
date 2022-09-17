/* 
ID:21CE103
Name: Smit Patel
Repository Link: https://github.com/Smit103/21CE103_Prac3.git
Aim: WAP that illustrate the interface inheritance. 
Interface P is extended by P1 and P2 interfaces. 
2 1,2 Interface P12 extends both P1 and P2. 
Each interface declares one method and one constant. 
Create one class that implements P12. 
By using the object of the class invokes each of its method and displays constant
*/
interface P
{
    final int p=3;
    void displayP();
}
interface P1 extends P
{
    final int p1=6;
    void displayP1();
}
interface P2 extends P
{
    final int p2=9;
    void displayP2();
}
interface P12 extends P1,P2
{
    final int p12=12;
    void displayP12();
}
class S1 implements P12
{
    public void displayP()
    {
        System.out.println("displayP : "+p);
    }
    public void displayP1()
    {
        System.out.println("displayP1 : "+p1);
    }
    public void displayP2()
    {
        System.out.println("displayP2 : "+p2);
    }
    public void displayP12()
    {
        System.out.println("displayP12 : "+p12);
    }
    
}
public class Sm3_3
{
    public static void main(String arg[])
    {
        S1 a=new S1();
        a.displayP();
        a.displayP1();
        a.displayP2();
        a.displayP12();
    }
}