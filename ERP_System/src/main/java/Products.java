import java.util.List;
import java.util.Scanner;

public class Products {

    // public static int countcodigo,countname;

    public static void listarProducts() {
        System.out.println(Principal.database);//muestro todos los datos almacenados
    }


    public static void buscarcodigo(String codigo) {
        //String codigo="1";
        int countcodigo = 0;
        for (int i = 0; i < Principal.database.size(); i++) {
            //if(Principal.database.get(i).getId().toLowerCase().contains(codigo)){
            if (Principal.database.get(i).getId().toLowerCase().equals(codigo)) {
                System.out.println("Id: " + Principal.database.get(i).getId()
                        + "\nNome: " + Principal.database.get(i).getName()
                        + "\nPrice: " + Principal.database.get(i).getPrice()
                        + "\nStock: " + Principal.database.get(i).getStockList()
                        + "\n");
                countcodigo += 1;
            }
        }
        if (countcodigo == 0) System.out.println("Produto nao foi encontrado!!!");
    }//fim buscarcodigo

    public static void buscarnome(String nome) {
        //String nome="tone";
        int countname = 0;
        for (int i = 0; i < Principal.database.size(); i++) {

            if (Principal.database.get(i).getName().toLowerCase().contains(nome)) {
                System.out.println("Id: " + Principal.database.get(i).getId()
                        + "\nNome: " + Principal.database.get(i).getName()
                        + "\nPrice: " + Principal.database.get(i).getPrice()
                        + "\nStock: " + Principal.database.get(i).getStockList()
                        + "\n");
                countname += 1;
            }
        }
        if (countname == 0)
            System.out.println("Produto com o nome ou parte dele que contenha " + nome + " nao encontrado");
    }//fim buscarnome

    public static void retirarProduct(int id, int qty) {
        int numberId = id - 1;

        //elimino stock si qty es al menos igual al stock actual y no mayor
        if(Principal.database.get(numberId).getStockList().size()>=qty){

            //System.out.println("Lista de stock a ser removida:");
            System.out.println("\n\tRetirando stock");
            System.out.println("\t-----------------------------------------------------------------" +
                    "\n\tProduto:" +
                    "         \n\tId: "
                    + Principal.database.get(numberId).getId() +
                    "\n\tNome: "
                    + Principal.database.get(numberId).getName());

            for(int i=0;i<qty;i++){
                System.out.println( Principal.database.get(numberId).getStockList().get(0));

                Principal.database.get(numberId).getStockList().remove(0);

                System.out.println("\t\t\tEliminado com exito!!!");
            }
            System.out.println("\t-----------------------------------------------------------------");
        }
        else if(Principal.database.get(numberId).getStockList().size()<qty && Principal.database.get(numberId).getStockList().size()>0){
            int control=0;
            while(control!=1){
                System.out.println("No hay la cantidad de productos que quieres eliminar," +
                        "\nactualmente hay en stock: "+Principal.database.get(numberId).getStockList().size()
                        +"\nquieres eliminar estas "+Principal.database.get(numberId).getStockList().size()
                        +" entradas de stock (1-si 2-no)?");
                Scanner in = new Scanner(System.in);
                int escolha = in.nextInt();

                if(escolha==1){
                    System.out.println("\n\tRetirando stock");
                    System.out.println("\t-----------------------------------------------------------------" +
                            "\n\tProduto:" +
                            "         \n\tId: "
                            + Principal.database.get(numberId).getId() +
                            "\n\tNome: "
                            + Principal.database.get(numberId).getName());

                    int qtyStock=Principal.database.get(numberId).getStockList().size();

                    for(int i=0;i< qtyStock;i++){
                        System.out.println( Principal.database.get(numberId).getStockList().get(0));
                        Principal.database.get(numberId).getStockList().remove(0);
                        System.out.println("\t\t\tEliminado com exito!!!");
                    }//fim for

                    System.out.println("\t-----------------------------------------------------------------");
                    control = 1;
                }
                else if(escolha==2){
                    System.out.println("\nOk, volviendo al menu principal, no se han eliminado ingresos del stock\n");

                    control = 1;
                }
                else if(escolha!=1 && escolha!=2){
                    System.out.println("\nOpcao nao valida, voce deve escolher 1 das 2 opcoes\n");
                }
            } //fim while

        }//fim else if

        else if(Principal.database.get(numberId).getStockList().size()==0){
            System.out.println("Actualmente no hay stock de este producto!!!");
        }
        else System.out.println("No es posible remover esa cantidad del stock del producto que quieres eliminar," +
                "\nPor intenta nuevamente!!!");

    }//fim retirarProduto(String id,int qty)


}