/* 
ID:21CE103
Name: Smit Patel
Repository Link: https://github.com/Smit103/21CE103_Prac3.git
Aim: Create an abstract class GeometricObject as the superclass for Circle and Rectangle. 
GeometricObject models common features of geometric objects. 
Both Circle and Rectangle contain the getArea() and getPerimeter() methods for computing the area and perimeter of a circle and a rectangle. 
Since you can compute areas and perimeters for all geometric objects, 
so define the getArea() and getPerimeter() methods in the GeometricObject class. 
Give implementation in the specific type of geometric object. 
Create TestGeometricObject class to display area and perimeter of Rectangle and Triangle, 
compare area of both and display results.
Design of all classes are given in the following UML diagram.
*/
public class Sm3_1 {
    public static void main(String[] args) { 
        GeometricObject g=new Circle();
        g.Draw(); 
        System.out.format("Area of Circle is: %.2f \n",g.getArea()); 
        System.out.println("Perimeter of Circle is: " +g.getPerimeter()); 
        GeometricObject g1=new Rectangle(); 
        g1.Draw(); 
        System.out.println("Area of Rectangle is: " +g1.getArea()); 
        System.out.println("Perimeter of Rectangle is: " +g1.getPerimeter());
    }
}