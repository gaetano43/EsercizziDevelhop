public class Main {
    public static void main(String[] args) {
        // Metodo statico
        User.salutoStatico();

        // Singleton DropdownMenu
        DropdownMenu menu = DropdownMenu.getInstance();
        menu.mostraMenu();

        // Primo utente con costruttore di default
        User user1 = new User();  // "Gianni", 65
        user1.stampaInformazioni();

        // Secondo utente modificato
        User user2 = new User();
        user2.setNome("Franco");
        user2.setEta(45);
        user2.stampaInformazioni();
    }
}
