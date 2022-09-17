/* 
ID:21CE103
Name: Smit Patel
Repository Link: https://github.com/Smit103/21CE103_Prac3.git
Aim:  Write a program to create a default method in an interface IPrinter.
Create an interface IPrinter and IScanner. 
You can assume variables and methodsfor both interfaces. 
Create a concrete class to implement both the interfaces. 
Create 5 objects of the class, store it in Vector and
display the result of the vector.
*/
import java.util.Vector;
public class Sm3_2 {
    public static void main(String[] args) {
        Concrete c1= new Concrete();
        c1.iscan();
        c1.iprint();
        Vector<Integer> Conrete = new Vector<Integer>();
    {
        Conrete.add(1);
        Conrete.add(2);
        Conrete.add(3);
        Conrete.add(4);
        Conrete.add(5);
        System.out.println("Vector: " + Conrete);
       
    }
    }
}
