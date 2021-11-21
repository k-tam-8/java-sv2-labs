package algorithmsfilter.movie;

import java.util.ArrayList;
import java.util.List;

public class VideoTheque {
    private List<Movie> movieList = new ArrayList<>();

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void addMovie(Movie movie) {
        movieList.add(movie);
    }

    public List<Movie> testGetGoodMoviesWithCategoryGiven(Category category) {
        List<Movie> moviesWithLeastThree = new ArrayList<>();
        for (Movie movie : movieList) {
            if (movie.getCategory() == category && movie.getRating() > 3) {
                moviesWithLeastThree.add(movie);
            }
        }
        return moviesWithLeastThree;
    }
}
