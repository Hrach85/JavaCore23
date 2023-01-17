package chapter6.chapter6_1;

public class Box {
    double width;
    double height;
    double depth;

    Box(){
        System.out.println("Koнcтpyиpoвaниe объекта Вох");
        width = 10;
        height = 20;
        depth = 15;
    }

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
