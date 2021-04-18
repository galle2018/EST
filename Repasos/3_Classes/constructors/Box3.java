package br.edu.ifsul.constructors;

public class Box3 {
    double width;
    double height;
    double depth;

    public Box3() {
    }

    public Box3(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // métodos
    void volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }

    // retornar valor
    double calculateVolume() {
        return width * height * depth;
    }

    // passar parametro
    double calculateSquare(int i) {
        return i * i;
    }
    
    // atribuindo valores para as variáveis de instância
    void setDimensions(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    
    
}
