package com.example.prince.googlemapapps;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    final String BASE_URL="http://ridecellparking.herokuapp.com/api/v1/parkinglocations/";
    @GET("search?format=json&lat=51.5074&lng=0.1278")
    Call<List<Points>> getData();
}
