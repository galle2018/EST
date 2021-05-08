//*********************************//
//* @author --> Hector Oliva <--- *//
//*********************************//
public class Arvore {

    private No root; // raiz

    public Arvore() { root=null; } // inicializa arvore

    //inicio inserir ------------------------------------------------------------------
    public void inserir(int v) {
        No novo = new No(); // cria um novo No
        novo.item = v; // atribui o valor recebido ao item de dados do No
        novo.dir = null;
        novo.esq = null;

        if (root == null) root = novo;
        else  { // se nao for a raiz
            No atual = root;
            No anterior;
            while(true) {
                anterior = atual;
                if (v <= atual.item) { // ir para esquerda
                    atual = atual.esq;
                    if (atual == null) {
                        anterior.esq = novo;
                        return;
                    }
                }  // fim da condicao ir a esquerda
                else { // ir para direita
                    atual = atual.dir;
                    if (atual == null) {
                        anterior.dir = novo;
                        return;
                    }
                } // fim da condicao ir a direita
            } // fim do laco while
        } // fim do else nao raiz

    }//fim inserir ------------------------------------------------------------------


    // inicio Buscar codigo ---------------------------------------------------------
    public No buscar(int x) {
        if (root == null) return null; // se arvore vazia
        No atual = root;  // comeca a procurar desde raiz
        while (atual.item != x) { // enquanto nao encontrou
            if(x < atual.item ) atual = atual.esq; // caminha para esquerda
            else atual = atual.dir; // caminha para direita
            if (atual == null) return null; // encontrou uma folha -> sai
        } // fim laÃ§o while
        return atual; // terminou o laco while e chegou aqui e pq encontrou item
    }
    // fim Buscar codigo -------------------------------------------------------------

    public void caminhar() {
        System.out.print("\n Exibindo em ordem: ");
        inOrder(root);
        System.out.print("\n Exibindo em pos-ordem: ");
        posOrder(root);
        System.out.print("\n Exibindo em pre-ordem: ");
        preOrder(root);
        System.out.print("\n Altura da arvore: " + altura(root));
        System.out.print("\n Quantidade de folhas: " + folhas(root));
        System.out.print("\n Quantidade de Nós: " + contarNos(root));
        if (root != null ) {  // se arvore nao esta vazia
            System.out.print("\n Valor minimo: " + min().item);
            System.out.println("\n Valor maximo: " + max().item);
        }
    }

    public void inOrder(No atual) {
        if (atual != null) {
            inOrder(atual.esq);
            System.out.print(atual.item + " ");
            inOrder(atual.dir);
        }
    }

    public void preOrder(No atual) {
        if (atual != null) {
            System.out.print(atual.item + " ");
            preOrder(atual.esq);
            preOrder(atual.dir);
        }
    }

    public void posOrder(No atual) {
        if (atual != null) {
            posOrder(atual.esq);
            posOrder(atual.dir);
            System.out.print(atual.item + " ");
        }
    }

    public int altura(No atual) {
        if(atual == null || (atual.esq == null && atual.dir == null))
            return 0;
        else {
            if (altura(atual.esq) > altura(atual.dir))
                return ( 1 + altura(atual.esq) );
            else
                return ( 1 + altura(atual.dir) );
        }
    }

    public int folhas(No atual) {
        if(atual == null) return 0;
        if(atual.esq == null && atual.dir == null) return 1;
        return folhas(atual.esq) + folhas(atual.dir);
    }

    public int contarNos(No atual) {
        if(atual == null)  return 0;
        else return ( 1 + contarNos(atual.esq) + contarNos(atual.dir));
    }

    public No min() {
        No atual = root;
        No anterior = null;
        while (atual != null) {
            anterior = atual;
            atual = atual.esq;
        }
        return anterior;
    }

    public No max() {
        No atual = root;
        No anterior = null;
        while (atual != null) {
            anterior = atual;
            atual = atual.dir;
        }
        return anterior;
    }

}
