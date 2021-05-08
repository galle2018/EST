import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.*;


public class Principal {

    public static List<Product> database = new ArrayList<Product>();
    private static int id,qty;
    public static int x;//para arvore

    public static void main(String[] args) {

        lerCSV();
        menu();

    }//fin main

    public static void menu(){

        //Arvore arv = new Arvore();
        Scanner in = new Scanner(System.in);

        System.out.println("\nERP_System\n\n"
                //+ "Piso Atual="+pos_atual+"\nCap Max Elev = "+capacidade_max+"\nCapac Disp Elev = "+capacidade_disp+"\nQuantidade Pisos="+q_pisos+"\nQuant Pess Atual = "+q_pessoas+"\n\n"
                + "1 - Listar todos os produtos\n"
                + "2 - Buscar produto por codigo\n"
                + "3 - Buscar produto por nome\n"
                + "4 - Retirar produto\n"
                + "5 - Buscar por produtos em árvore binária\n"
                + "8 - Sair"
                + "\n\nDigite sua escolha: ");

        String escolha = in.nextLine();


        if(escolha.equals("1")) {
            Products.listarProducts();
            menu();
        }

        else if(escolha.equals("2")) {
            in = new Scanner(System.in);
            System.out.println("Por favor ingresse o codigo do produto a buscar: ");
            String codigo = in.nextLine().toLowerCase();
            Products.buscarcodigo(codigo);
            menu();
        }

        else if(escolha.equals("3")) {
            in = new Scanner(System.in);
            System.out.println("Por favor ingresse o nome do produto ou parte dele a buscar: ");
            String nome = in.nextLine().toLowerCase();
            Products.buscarnome(nome);
            menu();
        }

        else if(escolha.equals("4")) {
            int control=0;

            in = new Scanner(System.in);

            System.out.println("\nRetiro de stock de produtos" +
                               "\n---------------------------");

            Scanner scanner = new Scanner(System.in);
            //int id,qty;
            boolean bError = true;
            while (bError) {
                System.out.println("Por favor ingresse o codigo do produto:");
                if (scanner.hasNextInt())
                    id = scanner.nextInt();
                else {
                    scanner.next();
                    continue;
                }
                System.out.println("Por favor ingresse a quantidade a ser retirada do produto: ");
                if (scanner.hasNextInt())
                    qty = scanner.nextInt();
                else {
                    scanner.next();
                    continue;
                }
                bError = false;
            }

            Products.retirarProduct(id,qty);
            menu();
        }

        else if(escolha.equals("5")) {//infresar varios
            ArvoreBinaria.ArvoreBinariaMenu();
            //menu();
        }//fim ingresar varios

        else if(escolha.equals("6")) {//exibir
            Arvore arv = new Arvore();
            arv.caminhar();
            menu();
        }//fim exibir

        else if(escolha.equals("7")) {
            Arvore arv = new Arvore();
            Scanner le = new Scanner(System.in);
            System.out.print("\n Informe o valor (long) -> ");
            int x = le.nextInt();
            if( arv.buscar(x) != null )
                System.out.print("\n Valor Encontrado !!! \n");
            else
                System.out.print("\n Valor nao encontrado !!! \n");
            menu();
        }//fim buscar


        else if(escolha.equals("8")){
            System.out.println("\nAte a proxima...\nObrigado por usar este codigo...");
            System.exit(1);
        }

        else
            System.err.println("Voce escolheu uma opcao invalida!!!");
        menu();

        in.close();
    }//fim menu

    //lendo o arquivo csv e add os dados ao array---------------------------------------------------------------------
    public static void lerCSV(){
        try (
                Reader reader = Files.newBufferedReader(Paths.get("e:\\csv\\Products.csv"));
                CSVReader csvReader = new CSVReader(reader);
        ) {
            // Reading Records One by One in a String array
           //List<Product> database = new ArrayList<Product>();

            String[] nextRecord;

            int count = 0;

            //while ((nextRecord = csvReader.readNext()) != null && count < 21) {
            while ((nextRecord = csvReader.readNext()) != null) {

                if (count > 0) {
                    Product p = new Product(nextRecord[0], nextRecord[1], nextRecord[21]);


                    // inicio parte del add de stock-------------------------
                    Random r = new Random();
                    int total = r.nextInt(20);

                    //para la fecha variable
                    LocalDateTime today = LocalDateTime.now();     //Today

                    for(int i=0; i<total; i++){
                        //Stock s = new Stock(new Date(), 1);
                        LocalDateTime fechaingreso = today.plusDays(i);
                        Stock s = new Stock(fechaingreso, 1);
                        p.getStockList().add(s);
                    }
                    // fin parte del add de stock---------------------------

                    database.add(p);//agrego los datos

                }
                count += 1;
            }//fin while

            //System.out.println(database);

        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }//fim leerCSV

}
