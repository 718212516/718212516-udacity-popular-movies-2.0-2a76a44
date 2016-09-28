

package com.perez.udacity.popularmovies.data.repository;


import com.perez.udacity.popularmovies.data.api.Sort;
import com.perez.udacity.popularmovies.data.model.Movie;
import com.perez.udacity.popularmovies.data.model.Review;
import com.perez.udacity.popularmovies.data.model.Video;

import java.util.List;
import java.util.Set;

import rx.Observable;

/**
 * Interface which hides network and database calls' implementation
 * and gives clear api for UI
 */
public interface MoviesRepository {

    Observable<List<Movie>> discoverMovies(Sort sort, int page);

    Observable<List<Movie>> savedMovies();

    Observable<Set<Long>> savedMovieIds();

    void saveMovie(Movie movie);

    void deleteMovie(Movie movie);

    Observable<List<Video>> videos(long movieId);

    Observable<List<Review>> reviews(long movieId);

}
