package project02;
/*We have to calculate the average of marks obtained in three subjects by student A and by student B.
Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage
of marks. Provide implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes
the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B.
Test your code*/
public abstract class Marks {
    int subject1;
    int subject2;
    int subject3;
    Marks(int subject1,int subject2,int subject3){
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
    }
    abstract double getPercentage();

}
class A extends Marks{
     A(int subject1,int subject2,int subject3){
       super(subject1,subject2,subject3);
    }
    @Override
    double getPercentage() {
         int sum=subject1+subject2+subject3;
         double average=sum/3;
        return average;
     }
}
class B extends Marks{
    int subject4;
     B(int subject1,int subject2,int subject3,int subject4){
         super(subject1,subject2,subject3);
         this.subject4=subject4;
     }
     @Override
    double getPercentage() {
         int sum=subject1+subject2+subject3+subject4;
         double average=sum/4;
         return average;
    }
}
class MarksTester{
    public static void main(String[] args) {
        Marks[]m1={new A(20,40,60),new B(120,210,140,99) };
        for(Marks m2:m1){
           double result = m2.getPercentage();
            System.out.println(result);
        }
    }
}
