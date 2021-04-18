package br.edu.ifsul.variables;

/**
 *
 * @author silviogn
 */
public class EscopoDasVariaveis {

    public static void main(String[] args) {

        Box b1 = new Box();
        b1.width = 100;
        Box b2 = b1;
        b2.width = 900;
        System.out.println(b1.width);

    }
}


class Box {
    public double width; 
    public double height; 
    public double depth;
}

