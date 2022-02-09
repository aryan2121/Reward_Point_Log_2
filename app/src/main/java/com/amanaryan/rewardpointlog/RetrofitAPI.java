package com.amanaryan.rewardpointlog;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RetrofitAPI {
    //passing a parameter as users
    @POST("users")

    //creating a method to post our data.
    Call<model> createPost(@Body model dataModal);
}
