/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

class Shape
{
    String type;
}
class twoDimentional extends Shape
{
    void area(Circle ob)
    {
        System.err.println(ob.dim1);
        /*if(type=="square"||type=="rectangle")
        {
            return dim1*dim2;
        }
        if(type=="circle")
        {
            return 3.1416*dim1*dim1;
        }
        else return 0;*/
    }
   /* double area(Rectangle ob )
    {
            
    }*/
    
}
class Circle extends twoDimentional
{
    int dim1;

    public Circle(int dim1) {
        this.dim1 = dim1;
    }
        
}
    class Rectangle extends twoDimentional
    {
        int dim1,dim2;

        public Rectangle(int dim1, int dim2) {
            this.dim1 = dim1;
            this.dim2 = dim2;
        }
        
    }
    class Triangle extends twoDimentional
    {
        private int dim1,dim2,dim3;

        public Triangle(int dim1, int dim2, int dim3) {
            this.dim1 = dim1;
            this.dim2 = dim2;
            this.dim3 = dim3;
        }
        
    }
class threeDimentional extends Shape
{
    class Cube
    {
        private int dim1,dim2,dim3;

        public Cube(int dim1, int dim2, int dim3) {
            this.dim1 = dim1;
            this.dim2 = dim2;
            this.dim3 = dim3;
        }
        
    }
    class Sphere
    {
        private int dim1;

        public Sphere(int dim1) {
            this.dim1 = dim1;
        }
        
    }
    void area(Cube ob)
    {
        System.err.println(ob.dim1);
        /*if(type=="cube")return (dim1*dim2+dim1*dim3+dim2*dim3);
        if(type=="sphere")return 4*3.1416*dim1*dim1; */
    }
}
public class ShapeHierarchy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle ob=new Circle(5);
        twoDimentional ob1=new twoDimentional();
        ob1.area(ob);
        // TODO code application logic here
    }
    
}
