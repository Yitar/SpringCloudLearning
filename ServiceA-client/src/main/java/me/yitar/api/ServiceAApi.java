package me.yitar.api;

import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Yitar on 2016/7/27.
 */
public interface ServiceAApi {

    @GET("/ServiceA/hello/{userName}")
    public String greeting(@Path("userName") String userName);

}