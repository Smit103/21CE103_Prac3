class Circle extends GeometricObject {
    void Draw() { 
       System.out.println("Drawing Circle");
   } 
   double getArea() 
   { 
       int r=3; 
       return(3.14*r*r);
   } 
   double getPerimeter() 
   { 
       int r=3; 
       return(2*3.14*r); 
   } 
} 

