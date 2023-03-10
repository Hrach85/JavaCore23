package chapter8.chapter8_6;

public class Rectangle extends Figure{
    Rectangle( double a, double b){
        super(a , b);
    }

    double area (){
        System.out.println("B области четbрехугольника. ");
        return dim1 * dim2;
    }
}
