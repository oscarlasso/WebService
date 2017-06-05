package com.example.sistemas.webservice.DatosApiService;

import com.example.sistemas.webservice.Casos;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by sistemas on 2/06/17.
 */

public interface DatosOpen {

    @GET("955r-736d.json")
    Call<ArrayList<Casos>> obtenerListaCasos();
}
