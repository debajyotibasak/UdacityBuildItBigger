package com.udacity.gradle.builditbigger.backend;

import com.example.android.joke_provider.JokeProvider;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    @ApiMethod(name = "getJokeFromBackend")
    public MyBean getJokeFromBackend() {
        MyBean response = new MyBean();
        JokeProvider joker = new JokeProvider();
        response.setData(joker.getRandomJoke());

        return response;
    }

}
