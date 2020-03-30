import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MovieManipulation mp = new MovieManipulation();

        Scanner scan = new Scanner(System.in);
        System.out.println("Tryk 1 for at søge på instruktør");
        System.out.println("Tryk 2 for at søge på land");

        switch (scan.nextInt()){
            case 1:
                System.out.println("Skriv navnet på instruktør");
                mp.findMovieInfosDic(scan.next());
                break;

            case 2:
                System.out.println("Skriv navnet på land");
                mp.findMovieInfosCountry(scan.next());
                break;

        }
    }
}
