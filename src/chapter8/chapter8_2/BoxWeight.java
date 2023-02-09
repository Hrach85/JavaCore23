package chapter8.chapter8_2;

public class BoxWeight extends Box {
    double weigth;

    // сконструировать клон объекта
    BoxWeight(BoxWeight ob) {
        super(ob);
        weigth = ob.weigth;
    }
    BoxWeight(double w, double h, double d, double m){
        super(w, h, d);
        weigth = m;
    }

    BoxWeight(){
        super();
        weigth = -1;
    }

    BoxWeight(double len, double m){
        super(len);
        weigth = m;
    }
}
