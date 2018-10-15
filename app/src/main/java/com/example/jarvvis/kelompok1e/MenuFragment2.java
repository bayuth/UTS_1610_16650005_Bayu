package com.example.jarvvis.kelompok1e;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuFragment2 extends Fragment implements View.OnClickListener{


    public MenuFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu_fragment2, container, false);
        Button konversi = (Button) view.findViewById(R.id.konversi2);
        Button konversi1 = (Button) view.findViewById(R.id.tentang2);
        Button konversi2 = (Button) view.findViewById(R.id.keluar2);
        konversi.setOnClickListener(this);
        konversi1.setOnClickListener(this);
        konversi2.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.konversi2:
                Intent mIntent = new Intent(getActivity(), tampilan3.class);
                startActivity(mIntent);
                break;
            case R.id.tentang2:
                Intent nIntent = new Intent(getActivity(), tampilantentang.class);
                startActivity(nIntent);
                break;
            case R.id.keluar2:
                Intent oIntent = new Intent(getActivity(), MainActivity.class);
                startActivity(oIntent);
                //getActivity().closeContextMenu();
                // close();
                break;
        }
    }

}
