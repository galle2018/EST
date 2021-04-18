package br.edu.ifsul.classes;

public class A_Classes_Run {

    public static void main(String[] args) {

        Box box = new Box();
        box.depth = 900;
        box.height = 80;
        box.width = 100;

        double vol;

        vol = box.width * box.height * box.depth;

        System.out.println("Volume:" + vol);
    }

}
