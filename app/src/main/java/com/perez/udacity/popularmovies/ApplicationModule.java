

package com.perez.udacity.popularmovies;

import android.app.Application;

import com.perez.udacity.popularmovies.data.DataModule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        includes = DataModule.class,
        injects = {
                MoviesApplication.class
        },
        library = true
)
public final class ApplicationModule {
    private final MoviesApplication application;

    public ApplicationModule(MoviesApplication application) {
        this.application = application;
    }

    @Provides @Singleton Application provideApplication() {
        return application;
    }

}

