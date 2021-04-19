package Clases.methods;

class Box2 {

    double width;
    double height;
    double depth;

    // metodos
    void volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }

    // funcao: retorna valor
    double calculateVolume() {
        return width * height * depth;
    }

    // passar parametro
    int calculateSquare(int i) {
        return i * i;
    }

    // atribuindo valores para as variaveis de instancia
    void setDimensions(double w, double h, double d) {
        width = w;
        height = h;
        d = depth;
    }

}
