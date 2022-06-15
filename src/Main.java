import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * The Movie Rental project to mimic a relative file.
 * @author Jackson Chen
 * @date 05/16/2022
 *
 */
public class Main {
    /**
     * The length defined in question context.
     */
    static int maxLength = 53;
    /**
     * The giving text file to test our project.
     */
    static  String file = "Movies.txt";
    /**
     * The movie array to showing relative file in java.
     */
    static Movie[] movieArr = new Movie[maxLength];
    public static void main(String[] args) {
        readingMovie(file);
        /*
        Out pur the file nicely
         */
        System.out.println(Arrays.toString(movieArr));
    }

    /**
     * Put all the movies into the array.
     * @param file the giving file address
     */
    public static void readingMovie(String file) {
        Scanner snd;
        try {
            snd = new Scanner(new FileReader(file));
        } catch (IOException e) {
            //TODO error manager
            e.printStackTrace();
            return;
        }
        while(snd.hasNextLine()) {
            String[] tempMovie = snd.nextLine().split(",");
            /*
            Make an assumption that all movie format text are follow the rule
             */
            Movie movie = new Movie(tempMovie[0], tempMovie[1], tempMovie[2]);
            int hashIndex = hashString(tempMovie[0]);
            putIn(hashIndex, movie);
        }
    }

    /**
     *  Check if the index in the movie array is null or not.
     * @param index the place of index has to check
     * @return return true if it is null, otherwise false
     */
    public static boolean isValid(int index) {
        return movieArr[index] == null;
    }

    /**
     * Put the movie object into the movies array.
     * @param hashIndex the index in [1,53]
     * @param movie the movie we have to put in
     */
    public static void putIn(int hashIndex, Movie movie){
        if(hashIndex > maxLength) {
            hashIndex = 1;
        }
        if(isValid(hashIndex - 1)) {
            movieArr[hashIndex - 1] = movie;
        } else {
            putIn(hashIndex + 1, movie);
        }
    }

    /**
     * Return the hash number of the giving movie number.
     * @param s giving String
     * @return return a hash number
     */
    public static int hashString(String s) {
        int hash = 0;
        for (int i = 0; i < s.length(); i++) {
            /*
            31 that Java uses
             */
            hash = (31 * hash + s.charAt(i)) % maxLength + 1;
        }
        return hash;
    }


}
