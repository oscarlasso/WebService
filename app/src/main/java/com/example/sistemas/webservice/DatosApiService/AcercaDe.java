package com.example.sistemas.webservice.DatosApiService;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.sistemas.webservice.R;

/**
 * Created by OSCAR LASSO on 3/06/2017.
 */

public class AcercaDe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);
    }

    public void salir(View v) {

        finish();
    }
}
