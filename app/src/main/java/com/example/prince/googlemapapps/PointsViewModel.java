package com.example.prince.googlemapapps;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PointsViewModel{

    public PointsViewModel() {

    }

    public void mapAllPoints(final GoogleMap mMap){

        Retrofit retrofit  = new Retrofit.Builder()
                .baseUrl(APIInterface.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APIInterface seriesInterfaceJSON = retrofit.create(APIInterface.class);
        Call<List<Points>> call = seriesInterfaceJSON.getData();
        call.enqueue(new Callback<List<Points>>() {
            @Override
            public void onResponse(Call<List<Points>> call, Response<List<Points>> response) {

                List<Points> allPoints = response.body();//response.body() => list of points from API
                for (Points points : allPoints) {
                    LatLng point = new LatLng(Double.parseDouble(points.getLat()), Double.parseDouble(points.getLng()));
                    mMap.addMarker(new MarkerOptions().position(point).title(points.getName()));

                }

            }

            @Override
            public void onFailure(Call<List<Points>> call, Throwable t) {

            }
        });

    }

}
