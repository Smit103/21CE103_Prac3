class Rectangle extends GeometricObject
    { 
        void Draw() 
        { System.out.println("Drawing Rectangle"); } 
        double getArea()
         {
             int l=5,b=5; 
             return(l*b); 
         } 
        double getPerimeter() 
        { 
            int l=5; 
            int b=5; 
            return(2*(l+b)); 
        } 
    } 