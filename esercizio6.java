package esercizi;

public class esercizio6 {
    public class Persona {
    String nome;
    int eta;

    // Costruttore
    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    // Metodo
    public void presentati() {
        System.out.println("Ciao, mi chiamo " + nome + " e ho " + eta + " anni.");
    }
    public class Main {
    public void main(String[] args) {

        Persona p1 = new Persona("Luca", 20);
        Persona p2 = new Persona("Maria", 25);

        p1.presentati();
        p2.presentati();
    }
}
}
}

