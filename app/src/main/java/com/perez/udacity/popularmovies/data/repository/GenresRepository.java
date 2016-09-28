
package com.perez.udacity.popularmovies.data.repository;

import com.perez.udacity.popularmovies.data.model.Genre;

import java.util.Map;

import rx.Observable;

public interface GenresRepository {

    Observable<Map<Integer, Genre>> genres();

}
