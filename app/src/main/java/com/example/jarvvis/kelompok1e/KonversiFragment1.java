package com.example.jarvvis.kelompok1e;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class KonversiFragment1 extends Fragment implements View.OnClickListener{

    EditText edtUSD;
    TextView txtIDR;
    Button Conversi;


    public KonversiFragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_konversi_fragment1, container, false);
        edtUSD = (EditText) view.findViewById(R.id.editUSD);
        txtIDR = (TextView) view.findViewById(R.id.IDR1);
        Conversi = (Button) view.findViewById(R.id.hitung1);
        Conversi.setOnClickListener(this);
        return view;
    }

    //Conversi.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Konversi();

    }
    // });



    public void Konversi(){

        double angka=0;
        try{
            angka = Double.parseDouble(edtUSD.getText().toString());



        }catch (Exception e){
            //Toast.makeText(this, "Masukkan Angka", Toast.LENGTH_LONG).show();
        }
        String hasil1, hasil2;
        hasil1 = + (angka * 15000)+ " Rupiah";
        txtIDR.setText(hasil1);
    }

}
