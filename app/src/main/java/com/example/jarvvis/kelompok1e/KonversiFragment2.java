package com.example.jarvvis.kelompok1e;



import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class KonversiFragment2 extends Fragment implements View.OnClickListener{

    EditText edtUSD2;
    TextView txtIDR2;
    Button Conversi2, tentang, keluar;

    public KonversiFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_konversi_fragment2, container, false);
        edtUSD2 = (EditText) view.findViewById(R.id.editUSD2);
        txtIDR2 = (TextView) view.findViewById(R.id.IDR2);
        Conversi2 = (Button) view.findViewById(R.id.hitung2);
        tentang = (Button) view.findViewById(R.id.mTentang);
        keluar = (Button) view.findViewById(R.id.mKeluar);
        Conversi2.setOnClickListener(this);
        tentang.setOnClickListener(this);
        keluar.setOnClickListener(this);
        return view;
    }

    //Conversi.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Konversi();
        switch (view.getId()) {
//            case R.id.konversi2:
//                Intent mIntent = new Intent(getActivity(), tampilan3.class);
//                startActivity(mIntent);
//                break;
            case R.id.mTentang:
                Intent nIntent = new Intent(getActivity(), tampilantentang.class);
                startActivity(nIntent);
                break;
            case R.id.mKeluar:
                Intent oIntent = new Intent(getActivity(), MainActivity.class);
                startActivity(oIntent);
                //getActivity().closeContextMenu();
                // close();
                break;
        }
    }
    // });



    public void Konversi(){

        double angka=0;
        try{
            angka = Double.parseDouble(edtUSD2.getText().toString());



        }catch (Exception e){
            //Toast.makeText(this, "Masukkan Angka", Toast.LENGTH_LONG).show();
        }
        String hasil1, hasil2;
        hasil1 = + (angka * 15000)+ " Rupiah";
        txtIDR2.setText(hasil1);
    }

}
