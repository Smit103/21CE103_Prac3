/* 
ID:21CE103
Name: Smit Patel
Repository Link: https://github.com/Smit103/21CE103_Prac3.git
Aim: Write a program that illustrates the significance of interface default method.
*/
interface d1
{
    void display();
    default void test()
    {
    System.out.println("test");
    }
}
interface d2 extends d1
{
    void display2();
    default void  test2()
    {
        System.out.println("test2");
    }
}
class P1{
    void s1(){
        System.out.println("s1");
    }
}
class testing extends P1 implements d2{
    public void display(){
        System.out.println("display");
    }
    public void display2(){
        System.out.println("Display2");
    }

}
public class Sm3_7{
    public static void main(String[] args) {
        testing t1=new testing();
        t1.display();
        t1.test();
        t1.test2();
        t1.display2();
        t1.s1();
    }
}