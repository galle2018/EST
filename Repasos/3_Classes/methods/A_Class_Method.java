package br.edu.ifsul.methods;

import java.io.IOException;

public class A_Class_Method {

    public static void main(String[] args) throws IOException {
        Box2 box = new Box2();
        box.depth = 900;
        box.height = 80;
        box.width = 100;
        box.volume();

        double volume = box.calculateVolume();

        System.out.println("Volume:" + volume);

        box.setDimensions(10, 20, 30);

    }

}
