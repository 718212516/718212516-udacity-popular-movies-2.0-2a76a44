
package com.perez.udacity.popularmovies.data.api;


import com.perez.udacity.popularmovies.data.model.Genre;
import com.perez.udacity.popularmovies.data.model.Movie;
import com.perez.udacity.popularmovies.data.model.Review;
import com.perez.udacity.popularmovies.data.model.Video;

import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;
import rx.Observable;

@SuppressWarnings("ALL")
public interface MoviesApi {

    @GET("/genre/movie/list") Observable<Genre.Response> genres();

    @GET("/movie/popular") Observable<Movie.Response> moviePopular(
            @Query("sort_by") Sort sort,
            @Query("page") int page);

    @GET("/movie/popular") Observable<Movie.Response> moviePopular(
            @Query("sort_by") Sort sort,
            @Query("page") int page,
            @Query("include_adult") boolean includeAdult);

    @GET("/movie/{id}/videos") Observable<Video.Response> videos(
            @Path("id") long movieId);

    @GET("/movie/{id}/reviews") Observable<Review.Response> reviews(
            @Path("id") long movieId,
            @Query("page") int page);

}
