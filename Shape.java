package project02;
/*Create an Interface 'Shape' with undefined methods as calculateArea and calculate Perimeter.
Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.*/
public interface Shape{
   void calculateArea();
   void calculatePerimeter();
}
class Circle implements Shape{
    public void calculateArea(){
        System.out.println("Calculating area of circle......");
    }
    public void calculatePerimeter(){
       System.out.println("Calculating perimeter of circle......");
        }
}class Square implements Shape{
    public void calculateArea(){
        System.out.println("Calculating area of Square......");
    }
    public void calculatePerimeter(){
        System.out.println("Calculating perimeter of Square......");
    }
}
class ShapeTester{
    public static void main(String[] args) {
        Shape [] s1 = {new Circle(),new Square()};
        for(Shape s2:s1){
           s2.calculateArea();
           s2.calculatePerimeter();
        }

    }
}
