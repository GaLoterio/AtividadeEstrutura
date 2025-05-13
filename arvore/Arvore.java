package arvore;

public class Arvore {
    private No raiz;

    public No getRaiz() {
        return raiz;
    }

    public void inserir(int numero, No ref) {

        if (ref == null) {
            raiz = new No(numero, null, null);
        } else {
            if (numero < ref.getNumero()) {
                if (ref.getEsquerda() == null) {
                    ref.setEsquerda(new No(numero, null, null));
                } else {
                    inserir(numero, ref.getEsquerda());
                }
            } else {
                if (ref.getDireita() == null) {// Ve se direita está livre
                    ref.setDireita(new No(numero, null, null));// Se estiver vai colocar numero a direita da raiz
                } else {
                    inserir(numero, ref.getDireita());// Chama o inserir até achar espaço para o num
                }

            }
        }
    }

    public void ordem(No ref) {
        if (ref != null) {
            ordem(ref.getEsquerda());
            System.out.println(ref.getNumero());
            ordem(ref.getDireita());

        }
    }

    public void preOrdem(No ref) {

        if (ref != null) {
            System.out.println(ref.getNumero());
            preOrdem(ref.getEsquerda());
            preOrdem(ref.getDireita());
        }
    }

    public void posOrdem(No ref) {
        if (ref != null) {
            
            posOrdem(ref.getEsquerda());
            posOrdem(ref.getDireita());
            System.out.println(ref.getNumero());
        }
    }

}
