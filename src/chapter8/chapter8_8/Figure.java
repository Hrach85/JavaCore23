package chapter8.chapter8_8;

// Применение абстрактных методов и классов
abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    // теперь метод area() объявляется абстрактным
    abstract double area();
}
