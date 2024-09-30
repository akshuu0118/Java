import java.util.Scanner;

class Player {
    int id;
    String name;
    int totalRuns;
    int inningsPlayed;

    // Constructor
    public Player(int id, String name, int totalRuns, int inningsPlayed) {
        this.id = id;
        this.name = name;
        this.totalRuns = totalRuns;
        this.inningsPlayed = inningsPlayed;
    }
}

public class CricketPlayerDetails {

    public static void main(String[] args) {
        // Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input the number of players
        System.out.print("Enter the number of players: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Array to store player details
        Player[] players = new Player[n];

        // Input details for each player
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for player " + (i + 1) + ":");
            System.out.print("Player ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            System.out.print("Player Name: ");
            String name = scanner.nextLine();

            System.out.print("Total Runs: ");
            int totalRuns = scanner.nextInt();

            System.out.print("Innings Played: ");
            int inningsPlayed = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            // Create a Player object and add it to the array
            players[i] = new Player(id, name, totalRuns, inningsPlayed);
        }

        // Close the scanner
        scanner.close();

        // Calculate the player with the maximum total runs
        Player maxRunsPlayer = players[0];
        int totalRunsSum = 0;

        for (Player player : players) {
            totalRunsSum += player.totalRuns;
            if (player.totalRuns > maxRunsPlayer.totalRuns) {
                maxRunsPlayer = player;
            }
        }

        // Calculate the average runs
        double averageRuns = (double) totalRunsSum / n;

        // Display the results
        System.out.println("\nPlayer with the maximum total runs:");
        System.out.println("ID: " + maxRunsPlayer.id);
        System.out.println("Name: " + maxRunsPlayer.name);
        System.out.println("Total Runs: " + maxRunsPlayer.totalRuns);
        System.out.println("Innings Played: " + maxRunsPlayer.inningsPlayed);

        System.out.println("\nAverage runs of all players: " + averageRuns);
    }
}
