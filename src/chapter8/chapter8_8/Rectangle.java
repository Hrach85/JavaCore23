package chapter8.chapter8_8;

public class Rectangle extends Figure{

    Rectangle(double a, double b){
        super(a, b);
    }

    //  переопределить метод area() для четырехугольника
    @Override
    double area() {
        System.out.println(" области четырехугольника.");
        return dim1 * dim2;
    }
}
