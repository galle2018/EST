package Clases.overloading;

public class Box5 {

    double width=2;
    double height=3;
    double depth=4;

    public Box5() {
    }    

    //overloading methods (sobrecarga)
    void test() {
        System.out.println(width * height * depth);
    }

    void test(double volume) {
        System.out.println("Volume Double:"+ volume);
    }

    void test(int volume) {
        System.out.println("Volume Int:" + volume);
    }

}
