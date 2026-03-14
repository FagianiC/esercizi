package esercizi;

public class esercizio5 {
    private String nome;
    private int eta;

    public esercizio5(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public void presentati() {
        System.out.println("Ciao, mi chiamo " + this.nome + " e ho " + this.eta + " anni");
    }

    public static void main(String[] args) {
        esercizio5 p1 = new esercizio5("Marco", 30);
        esercizio5 p2 = new esercizio5("Luca", 25);

        p1.presentati();
        p2.presentati();
    }
}
