package IPL_Draft_System;

import java.util.*;

public class IPLDraft {
    private static final List<String> TEAM_NAMES = Arrays.asList(
            "Chennai Super Kings",
            "Mumbai Indians",
            "Royal Challengers Bangalore",
            "Kolkata Knight Riders",
            "Rajasthan Royals"
    );

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n╔════════════════════════════════════════════╗");
        System.out.println("║      INDIAN PREMIER LEAGUE - DRAFT 2026    ║");
        System.out.println("╚════════════════════════════════════════════╝\n");

        List<Player> indianPlayers = createIndianPlayers();
        List<Player> foreignPlayers = createForeignPlayers();

        Collections.shuffle(indianPlayers);
        Collections.shuffle(foreignPlayers);

        List<List<Player>> teams = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            teams.add(new ArrayList<>());
        }

        draftPlayers(teams, indianPlayers, foreignPlayers);
        displayFinalResults(teams);
    }

    private static void draftPlayers(List<List<Player>> teams,
                                     List<Player> indianPlayers,
                                     List<Player> foreignPlayers) {
        // Draft 7 Indian players per team (35 total)
        for (int round = 0; round < 7; round++) {
            System.out.println("\n════════════════════════════════════");
            System.out.println("     INDIAN PLAYERS DRAFT ROUND " + (round + 1));
            System.out.println("════════════════════════════════════");

            for (int teamIndex = 0; teamIndex < 5; teamIndex++) {
                Player selectedPlayer = indianPlayers.remove(0);
                teams.get(teamIndex).add(selectedPlayer);

                System.out.println("\n┌────────────────────────────────────┐");
                System.out.printf("│ %-34s │\n", TEAM_NAMES.get(teamIndex) + " selected:");
                System.out.println("├────────────────────────────────────┤");
                System.out.printf("│ %-15s: %-15s   │\n", "Player", selectedPlayer.getName());
                System.out.printf("│ %-15s: %-15s   │\n", "Jersey", selectedPlayer.getJerseyNumber());
                System.out.println("└────────────────────────────────────┘");

                System.out.println("\nPress Enter to continue...");
                scanner.nextLine();
            }
        }

        // Draft 5 Foreign players per team (25 total)
        for (int round = 0; round < 5; round++) {
            System.out.println("\n════════════════════════════════════");
            System.out.println("     FOREIGN PLAYERS DRAFT ROUND " + (round + 1));
            System.out.println("════════════════════════════════════");

            for (int teamIndex = 0; teamIndex < 5; teamIndex++) {
                Player selectedPlayer = foreignPlayers.remove(0);
                teams.get(teamIndex).add(selectedPlayer);

                System.out.println("\n┌────────────────────────────────────┐");
                System.out.printf("│ %-34s │\n", TEAM_NAMES.get(teamIndex) + " selected:");
                System.out.println("├────────────────────────────────────┤");
                System.out.printf("│ %-15s: %-15s │\n", "Player", selectedPlayer.getName());
                System.out.printf("│ %-15s: %-15s │\n", "Country", selectedPlayer.getCountry());
                System.out.printf("│ %-15s: %-15s │\n", "Jersey", selectedPlayer.getJerseyNumber());
                System.out.println("└────────────────────────────────────┘");

                System.out.println("\nPress Enter to continue...");
                scanner.nextLine();
            }
        }
    }

    private static List<Player> createIndianPlayers() {
        return new ArrayList<>(Arrays.asList(
                new Player("Virat Kohli", "India", 18),
                new Player("Rohit Sharma", "India", 45),
                new Player("Jasprit Bumrah", "India", 93),
                new Player("Hardik Pandya", "India", 33),
                new Player("KL Rahul", "India", 1),
                new Player("Rishabh Pant", "India", 17),
                new Player("Ravindra Jadeja", "India", 8),
                new Player("Mohammed Shami", "India", 11),
                new Player("Shreyas Iyer", "India", 41),
                new Player("Ishan Kishan", "India", 32),
                new Player("Suryakumar Yadav", "India", 63),
                new Player("Yuzvendra Chahal", "India", 3),
                new Player("Bhuvneshwar Kumar", "India", 15),
                new Player("Shikhar Dhawan", "India", 25),
                new Player("Ruturaj Gaikwad", "India", 31),
                new Player("Deepak Chahar", "India", 90),
                new Player("Washington Sundar", "India", 5),
                new Player("Shardul Thakur", "India", 54),
                new Player("Axar Patel", "India", 20),
                new Player("Sanju Samson", "India", 9),
                new Player("Ravichandran Ashwin", "India", 99),
                new Player("Dinesh Karthik", "India", 21),
                new Player("Mohammed Siraj", "India", 13),
                new Player("Arshdeep Singh", "India", 2),
                new Player("Prithvi Shaw", "India", 100),
                new Player("Shubman Gill", "India", 77),
                new Player("Venkatesh Iyer", "India", 26),
                new Player("Avesh Khan", "India", 16),
                new Player("Harshal Patel", "India", 12),
                new Player("Yashasvi Jaiswal", "India", 64),
                new Player("Rinku Singh", "India", 35),
                new Player("Umran Malik", "India", 22),
                new Player("Tilak Varma", "India", 23),
                new Player("Mukesh Kumar", "India", 29),
                new Player("Shivam Mavi", "India", 19)
        ));
    }

    private static List<Player> createForeignPlayers() {
        return new ArrayList<>(Arrays.asList(
                new Player("Shakib Al Hasan", "Bangladesh", 75),
                new Player("Tamim Iqbal", "Bangladesh", 28),
                new Player("Mustafizur Rahman", "Bangladesh", 90),
                new Player("Liton Das", "Bangladesh", 16),
                new Player("Mushfiqur Rahim", "Bangladesh", 15),
                new Player("Mahmudullah Riyad", "Bangladesh", 30),
                new Player("Mehidy Hasan", "Bangladesh", 66),
                new Player("Taskin Ahmed", "Bangladesh", 3),
                new Player("Najmul Hossain", "Bangladesh", 1),
                new Player("Afif Hossain", "Bangladesh", 5),

                new Player("David Warner", "Australia", 31),
                new Player("Jos Buttler", "England", 63),
                new Player("Glenn Maxwell", "Australia", 32),
                new Player("Rashid Khan", "Afghanistan", 19),
                new Player("Kagiso Rabada", "South Africa", 25),
                new Player("Quinton de Kock", "South Africa", 12),
                new Player("Kieron Pollard", "West Indies", 55),
                new Player("Trent Boult", "New Zealand", 18),
                new Player("Faf du Plessis", "South Africa", 17),
                new Player("Sunil Narine", "West Indies", 6),
                new Player("Andre Russell", "West Indies", 12),
                new Player("Pat Cummins", "Australia", 30),
                new Player("Jonny Bairstow", "England", 51),
                new Player("Liam Livingstone", "England", 23),
                new Player("Lockie Ferguson", "New Zealand", 11)
        ));
    }

    private static void displayFinalResults(List<List<Player>> teams) {
        System.out.println("\n╔════════════════════════════════════════════╗");
        System.out.println("║           DRAFT RESULTS - IPL 2024          ║");
        System.out.println("╚════════════════════════════════════════════╝");

        for (int i = 0; i < teams.size(); i++) {
            System.out.println("\n╔════════════════════════════════════════════╗");
            System.out.printf("║ %-42s ║\n", TEAM_NAMES.get(i) + " Squad");
            System.out.println("╠════════════════════════════════════════════╣");

            List<Player> team = teams.get(i);
            List<Player> indians = new ArrayList<>();
            List<Player> foreigners = new ArrayList<>();

            for (Player p : team) {
                if (p.getCountry().equals("India")) {
                    indians.add(p);
                } else {
                    foreigners.add(p);
                }
            }

            System.out.println("║            INDIAN PLAYERS (7)             ║");
            System.out.println("╠════════════════════════════════════════════╣");
            for (int j = 0; j < 7; j++) {
                System.out.printf("║ %-2d. %-35s ║\n", j+1, indians.get(j));
            }

            System.out.println("║           FOREIGN PLAYERS (5)            ║");
            System.out.println("╠════════════════════════════════════════════╣");
            for (int j = 0; j < 5; j++) {
                System.out.printf("║ %-2d. %-35s ║\n", j+8, foreigners.get(j));
            }
            System.out.println("╚════════════════════════════════════════════╝");
        }
    }
}
