/**
 * La classe User rappresenta un utente con nome ed età.
 * Offre metodi per accedere, modificare e stampare le informazioni.
 */
public class User {
    private String nome;
    private int eta;

    /**
     * Costruttore di default che inizializza l'utente con valori predefiniti.
     */
    public User() {
        this.nome = "Gianni";
        this.eta = 65;
    }

    /**
     * Costruttore con parametri per nome ed età personalizzati.
     * @param nome Nome dell'utente.
     * @param eta Età dell'utente.
     */
    public User(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    /**
     * Stampa a video le informazioni dell'utente.
     */
    public void stampaInformazioni() {
        System.out.println("Nome: " + nome + ", Età: " + eta);
    }

    /**
     * Metodo statico che stampa un messaggio di benvenuto.
     */
    public static void salutoStatico() {
        System.out.println("Benvenuto nel sistema utenti!");
    }
}
