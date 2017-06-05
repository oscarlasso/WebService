package com.example.sistemas.webservice;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by OSCAR LASSO on 3/06/2017.
 */

public class AdapterCasos extends RecyclerView.Adapter<AdapterCasos.ViewHolder> {
    private ArrayList<Casos> dataset;

    private Context context;

    public AdapterCasos(Context context) {
        this.context = context;
        dataset = new ArrayList<>();

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_casos, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Casos c= dataset.get(position);
        holder.municipios.setText(c.getMunicipios().toString());
        holder.maxCasos2015.setText(c.getMaxCasos2015().toString());



    }

    @Override
    public int getItemCount() {

        return dataset.size();
    }

    public void ListaCasos(ArrayList<Casos> listaCasos) {
        dataset.addAll(listaCasos);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        private TextView municipios;
        private TextView maxCasos2015;


        public ViewHolder(View itemView) {
            super(itemView);


            municipios= (TextView) itemView.findViewById(R.id.municipios);
            maxCasos2015= (TextView) itemView.findViewById(R.id.maxCasos2015);

        }
    }
}
