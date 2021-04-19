package Clases.constructors;

public class A_Constructor {

    public static void main(String[] args) {
        Box3 box = new Box3(10,10,10);
        
        System.out.print("Valor obtido do metodo volume(): ");
        box.volume();//metodo sem retorno
        
        System.out.println("\nValor calculo retornado: "+box.calculateVolume());
                                                       //metodo com retorno
        
        System.out.println("\nValor calculo retornado con parametro: "+box.calculateSquare(10));
        															 //metodo com retorno
        
        System.out.println("\nEnviando valores a variaveis de instancia");
        box.setDimensions(10, 20, 30);
        System.out.println("El width es: "+box.width+"\nEl height es: "+box.height+"\nEl depth es: "+box.depth);
    }
    
}
