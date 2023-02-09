package chapter8.chapter8_2;

public class SuperDemo {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight myBox3 = new BoxWeight();
        BoxWeight myCube = new BoxWeight(3, 2);
        BoxWeight myClone = new BoxWeight(myBox1);
        double vol;

        vol = myBox1.volume();
        System.out.println("Oбъeм mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен  " + myBox1.weigth);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Oбъeм mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен  " + myBox2.weigth);
        System.out.println();

        vol = myBox3.volume();
        System.out.println("Oбъeм mybox3 равен " + vol);
        System.out.println("Вес mybox3 равен  " + myBox3.weigth);
        System.out.println();

        vol = myClone.volume();
        System.out.println("Oбъeм myClone равен " + vol);
        System.out.println("Вес myClone равен  " + myClone.weigth);
        System.out.println();

        vol = myCube.volume();
        System.out.println("Oбъeм myCube равен " + vol);
        System.out.println("Вес myCube равен  " + myCube.weigth);
        System.out.println();
    }
}