package me.yitar.api;

import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Yitar on 2016/7/27.
 */
@Deprecated
public interface ServiceAApi {

    @GET("/ServiceA/hello/{userName}")
    String greeting(@Path("userName") String userName);

}
