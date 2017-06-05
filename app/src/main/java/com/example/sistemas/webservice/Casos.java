package com.example.sistemas.webservice;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sistemas on 2/06/17.
 */

public class Casos {

    @SerializedName("municipios")
    @Expose
    private String municipios;
    @SerializedName("max_casos_2015")

    @Expose
    private String maxCasos2015;

    public String getMunicipios() {
        return municipios;
    }

    public void setMunicipios(String municipios) {
        this.municipios = municipios;
    }

    public String getMaxCasos2015() {
        return maxCasos2015;
    }

    public void setMaxCasos2015(String maxCasos2015) {
        this.maxCasos2015 = maxCasos2015;
    }
}
