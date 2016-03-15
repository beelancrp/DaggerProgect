package com.beelancrp.daggerproject.DI.component;

import com.squareup.okhttp.OkHttpClient;

import retrofit.Endpoint;
import retrofit.RestAdapter;
import retrofit.converter.Converter;

/**
 * Created by beeLAN on 16.03.2016.
 */
public interface ApiComponent {

    RestAdapter restAdapter();
    OkHttpClient okHttpClient();
    Converter converter();
    Endpoint endpiEndpoint();

}
