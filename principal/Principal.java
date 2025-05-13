package principal;
import arvore.Arvore;

public class Principal {
    public static void main(String[] args) {
        Arvore arvore= new Arvore();

        arvore.inserir(12, arvore.getRaiz());
        arvore.inserir(1, arvore.getRaiz());
        arvore.inserir(10, arvore.getRaiz());
        arvore.inserir(20, arvore.getRaiz());
        arvore.inserir(40, arvore.getRaiz());
        arvore.inserir(13, arvore.getRaiz());

        arvore.ordem(arvore.getRaiz());
        System.out.println("");
        arvore.preOrdem(arvore.getRaiz());
        System.out.println("");
        arvore.posOrdem(arvore.getRaiz());

    }
}
