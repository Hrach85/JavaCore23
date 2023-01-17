package chapter6.chapter6_2;

public class Box {
    double width;
    double height;
    double depth;

    // Это конструктор класса Вох
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    double volume() {
        return width * height * depth;
    }
}