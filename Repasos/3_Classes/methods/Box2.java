package br.edu.ifsul.methods;

class Box2 {

    double width;
    double height;
    double depth;

    // métodos
    void volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }

    // função: retorna valor
    double calculateVolume() {
        return width * height * depth;
    }

    // passar parametro
    int calculateSquare(int i) {
        return i * i;
    }

    // atribuindo valores para as variáveis de instância
    void setDimensions(double w, double h, double d) {
        width = w;
        height = h;
        d = depth;
    }

}
