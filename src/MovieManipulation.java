import java.io.*;

public class MovieManipulation {

    String line = "";

    public void findMovieInfosDic(String director) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/movie.csv"));
            int count = 1;
            while ((line = bufferedReader.readLine()) != null) {
                String[] holder = line.split(",");
                if (holder[1].contains(director)) {
                    System.out.println(count+" - Filmtitel: "+holder[11]+", Årstal: "+holder[23]+",IMDB-score: "+holder[25]+" , Intruktør: "+holder[1]+" , Skuespillere: "+holder[6]+", "+holder[10]+" country: "+holder[20]+" & "+holder[14]+".");
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void findMovieInfosCountry(String country) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/movie.csv"));
            int count = 1;
            while ((line = bufferedReader.readLine()) != null) {
                String[] holder = line.split(",");
                if (holder[20].contains(country.toUpperCase())) {
                    System.out.println(count+" - Filmtitel: "+holder[11]+", Årstal: "+holder[23]+",IMDB-score: "+holder[25]+" , Intruktør: "+holder[1]+" , Skuespillere: "+holder[6]+", "+holder[10]+" country: "+holder[20]+" & "+holder[14]+".");
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


