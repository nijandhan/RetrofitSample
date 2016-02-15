package com.example.nijandhanl.retrofitsample;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;
import retrofit.Call;

/**
 * Created by NijandhanL on 2/15/2016.
 */

public interface StackOverflowAPI {
    @GET("/2.2/questions?order=desc&site=stackoverflow")
    Call<StackOverflowQuestions> loadQuestions(@Query("tagged") String tags,@Query("sort") String sort);
}
