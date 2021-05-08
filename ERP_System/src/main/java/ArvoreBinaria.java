import java.util.Scanner;

public class ArvoreBinaria {

    public static int x;
    //public static List<ArrayList> database = new ArrayList<>();

    public static void main(String[] args) {
        //Principal.lerCSV();
        ArvoreBinariaMenu();
    }

    public static void ArvoreBinariaMenu() {

        Arvore arv = new Arvore();
        //criando Arvore-----------------------------------------------------
        //for (int i = 0; i < 18; i++) {
        for (int i = 0; i < Principal.database.size(); i++) {
            arv.inserir(Integer.parseInt(Principal.database.get(i).getId()));
        }
        //-------------------------------------------------------------------

        Scanner le = new Scanner(System.in);
        int opcao;

        System.out.print("\n Arvore binaria de Int");
        do {
        System.out.print("\n*****************************************");
        System.out.print("\n 1 - Inserir dados em arvore binaria");
        System.out.print("\n 2 - Pesquisar produto na arvore binaria");
        System.out.print("\n 3 - Exibir arvore binaria");
        System.out.print("\n 4 - Voltar ao menu principal");
        System.out.print("\nEntre com a opcao:");
        System.out.print("\n*****************************************");
        System.out.print("\n> ");
        opcao = le.nextInt();
        switch (opcao) {

            case 1: {
                /*
                for (int i = 0; i < 18; i++) {
                    arv.inserir(Integer.parseInt(Principal.database.get(i).getId()));
                }
                //System.out.println(Principal.database.get(18).getId());
                System.out.println("\nDados inseridos com successo!!!\n" +
                        "Arvore Binaria criada com succeso!!!");
                */
                System.out.println("\nDados ya inseridos ao carregar o menu com successo!!!\n" +
                        "Arvore Binaria ja criada com succeso!!!");
                break;
            }

            case 2: {
                System.out.print("\n Informe o codigo a procurar -> ");
                x = le.nextInt();
                if (arv.buscar((int) x) != null) {
                    System.out.print("\n Produto Encontrado !!! \n");
                    System.out.println("Id: " + Principal.database.get(x - 1).getId()
                            + "\nNome: " + Principal.database.get(x - 1).getName()
                            + "\nPrice: " + Principal.database.get(x - 1).getPrice()
                            + "\nStock: " + Principal.database.get(x - 1).getStockList()
                            + "\n");
                } else
                    System.out.print("\n Produto nao encontrado !!! \n");
                break;
            }
            case 3: {
                arv.caminhar();
                break;
            }
            case 4: {
                //le.close();
                Principal.menu();
                break;
            }

        } // fim switch
        } while (opcao != 4);

        }//fim ArvoreBinaria

    //}
}
