package chapter8.chapter8_8;

public class Rectangle extends Figure{

    Rectangle(double a, double b){
        super(a, b);
    }

    //  переопределить метод area() для четbрехугольника
    @Override
    double area() {
        System.out.println(" области четbрехугольника.");
        return dim1 * dim2;
    }
}
