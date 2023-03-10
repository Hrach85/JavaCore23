package chapter7.chapter7_5;

public class PassObjRe {
    public static void main(String[] args) {

        Test ob = new Test(15, 20);
        System.out.println("ob.a и оЬ.Ь до вbзова: " + ob.a + " " + ob.b);

        ob.meth(ob);
        System.out.println("ob.a и оЬ.Ь после вbзова: " + ob.a + " " + ob.b);
    }
}