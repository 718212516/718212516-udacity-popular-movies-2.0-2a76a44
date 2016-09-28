

package com.perez.udacity.popularmovies.ui.module;


import com.perez.udacity.popularmovies.ApplicationModule;
import com.perez.udacity.popularmovies.ui.fragment.FavoredMoviesFragment;
import com.perez.udacity.popularmovies.ui.fragment.MovieFragment;
import com.perez.udacity.popularmovies.ui.fragment.SortedMoviesFragment;

import dagger.Module;

@Module(
        injects = {
                SortedMoviesFragment.class,
                FavoredMoviesFragment.class,
                MovieFragment.class
        },
        addsTo = ApplicationModule.class
)
public final class MoviesModule {}
