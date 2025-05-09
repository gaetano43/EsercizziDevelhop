/**
 * La classe DropdownMenu rappresenta un menu a tendina
 * implementato con il design pattern Singleton.
 */
public class DropdownMenu {
    private static DropdownMenu instance;

    /**
     * Costruttore privato per evitare l'istanziazione diretta.
     */
    private DropdownMenu() {}

    /**
     * Restituisce l'unica istanza di DropdownMenu (Singleton).
     * @return Istanza Singleton di DropdownMenu.
     */
    public static DropdownMenu getInstance() {
        if (instance == null) {
            instance = new DropdownMenu();
        }
        return instance;
    }

    /**
     * Mostra le opzioni del menu a tendina a video.
     */
    public void mostraMenu() {
        System.out.println("=== Dropdown Menu ===");
        System.out.println("1. Mostra informazioni utente 1");
        System.out.println("2. Mostra informazioni utente 2");
    }
}
