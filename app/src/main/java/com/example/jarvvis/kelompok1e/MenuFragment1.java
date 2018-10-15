package com.example.jarvvis.kelompok1e;



import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuFragment1 extends Fragment implements View.OnClickListener{


    public MenuFragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_menu, container, false);
        View view = inflater.inflate(R.layout.fragment_menu_fragment1, container, false);

        Button konversi = (Button) view.findViewById(R.id.konversi);
        Button konversi1 = (Button) view.findViewById(R.id.tentang);
        Button konversi2 = (Button) view.findViewById(R.id.keluar);
        konversi.setOnClickListener(this);
        konversi1.setOnClickListener(this);
        konversi2.setOnClickListener(this);
        return view;
        //return view;
        //return view3;
    }

    @Override
    public void onClick(View v) {
//        if (v.getId()== R.id.konversi){
//            KonversiFragment1 mcategoryFragment = new KonversiFragment1();
//            FragmentManager mfragmentManager = getFragmentManager();
//            FragmentTransaction mfragmentTransaction = mfragmentManager.beginTransaction();
//            mfragmentTransaction.replace(R.id.tampilan2a, mcategoryFragment, KonversiFragment1.class.getSimpleName());
//            mfragmentTransaction.addToBackStack(null);
//            mfragmentTransaction.commit();
//        }else if (v.getId()== R.id.tentang){
//            KonversiFragment1 mcategoryFragment = new KonversiFragment1();
//            FragmentManager mfragmentManager = getFragmentManager();
//            FragmentTransaction mfragmentTransaction = mfragmentManager.beginTransaction();
//            mfragmentTransaction.replace(R.id.tampilan2a, mcategoryFragment, KonversiFragment1.class.getSimpleName());
//            mfragmentTransaction.addToBackStack(null);
//            mfragmentTransaction.commit();
//        }else if(v.getId()== R.id.keluar){
//            KonversiFragment1 mcategoryFragment = new KonversiFragment1();
//            FragmentManager mfragmentManager = getFragmentManager();
//            FragmentTransaction mfragmentTransaction = mfragmentManager.beginTransaction();
//            mfragmentTransaction.replace(R.id.tampilan2a, mcategoryFragment, KonversiFragment1.class.getSimpleName());
//            mfragmentTransaction.addToBackStack(null);
//            mfragmentTransaction.commit();
//        }

        switch (v.getId()){
            case R.id.konversi:
                Intent mIntent = new Intent(getActivity(), tampilan3.class);
                startActivity(mIntent);
                break;
            case R.id.tentang:
                Intent nIntent = new Intent(getActivity(), tampilantentang.class);
                startActivity(nIntent);
                break;
            case R.id.keluar:
                Intent oIntent = new Intent(getActivity(), MainActivity.class);
                startActivity(oIntent);
                getActivity().closeContextMenu();
                // close();
                break;

            //break;

//                FragmentManager mfragmentManager = getChildFragmentManager();
//                mOptionDialogFragment.show(mfragmentManager, OptionDialogFragment.class.getSimpleName());
            //break;
        }

    }
}
