package AdventureGame;

public class AdventureGame {
    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);
        System.out.println("Welcome AdventureGame");
        System.out.print("Enter the name: ");
        String playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "! Everything you see here is real!");

        System.out.println("\nChoose a character: ");
        System.out.println("1 - Samurai (Damage: 5, Health: 21, Money: 15)");
        System.out.println("2 - Knight (Damage: 7, Health: 18, Money: 20)");
        System.out.println("3 - Archer (Damage: 6, Health: 24, Money: 10)");

        Player player = null;
        while (player == null) {
            System.out.print("Make your choice (1-3): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> player = new Player(1, "Samurai", 5, 21,15);
                case 2 -> player = new Player(2, "Knight", 7, 18, 20);
                case 3 -> player = new Player(3, "Archer",6, 24,10);
                default -> System.out.println("Wrong choice. Please try again.");
            }
        }
        System.out.println("Your chosen character: " + player.getName());
    }
}
