/* 
ID:21CE103
Name: Smit Patel
Repository Link: https://github.com/Smit103/21CE103_Prac3.git
Aim: Develop a Program that illustrate method overriding concept.
*/
class A{
    public void test1(){
        System.out.println("class A");
    }
}

class B extends A{
    @Override
    public void test1(){
        System.out.println("class B");
    }


}
public class Sm3_4{
    public static void main(String[] args) {
        A a = new A();
        a.test1();

        B b = new B();
        b.test1();
    }
}