package arvore;

public class No {
    private int numero;
    private No esquerda,direita,raiz;
    
    public No(int numero, No esquerda, No direita) {
        this.numero = numero;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }

    public No getRaiz(){
        return raiz;
    }
    public void setRaiz(No raiz){
        this.raiz=raiz;
    }

}
