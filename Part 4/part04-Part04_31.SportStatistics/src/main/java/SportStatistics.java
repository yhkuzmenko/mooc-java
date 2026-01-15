import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();
        scan.close();

        int games = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner sc = new Scanner(Paths.get(file))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(",");

                String homeTeam = parts[0];
                String visitorTeam = parts[1];
                int homeTeamScore = Integer.valueOf(parts[2]);
                int visitorTeamScore = Integer.valueOf(parts[3]);

                // If chosen team will be in the first column of the csv
                if (homeTeam.equals(team)) {
                    games++;
                    if (homeTeamScore > visitorTeamScore) wins++;
                    if (homeTeamScore < visitorTeamScore) losses++;
                }

                // If chosen team will be in the second column of the csv
                if (visitorTeam.equals(team)) {
                    games++;
                    if (homeTeamScore < visitorTeamScore) wins++;
                    if (homeTeamScore > visitorTeamScore) losses++;
                }
            }

            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }

}
