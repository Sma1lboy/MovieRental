public class Movie {
    public String movieNumber;
    public String title;
    public String genre;

    public Movie(String movieNumber, String title, String genre) {
        this.movieNumber = movieNumber;
        this.title = title;
        this.genre = genre;
    }

    public String getNumber() {
        return movieNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public void setMovieNumber(String movieNumber) {
        this.movieNumber = movieNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "[" + getNumber() + ", " + getTitle() + ", " + getGenre() + "]";
    }
}
