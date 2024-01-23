import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What month are we in? ");
        String month = scanner.next();
        String season = null;
        switch(month){
            case "December":
            case "January":
            case "February":
                season = "Winter";
                System.out.println("Our current season: " + season);
                break;
            case "March":
            case "April":
            case "May":
                season = "Spring";
                System.out.println("Our current season: " + season);
                break;
            case "June":
            case "July":
            case "August":
                season = "Summer";
                System.out.println("Our current season: " + season);
                break;
            case "September":
            case "October":
            case "November":
                season = "Fall";
                System.out.println("Our current season: " + season);
                break;
            default:
                System.out.println("This month doesn't exist, or rather I was too lazy to include lowercased months");
        }
        scanner.close();
    }
}