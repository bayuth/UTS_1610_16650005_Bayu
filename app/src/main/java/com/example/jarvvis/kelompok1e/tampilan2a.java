package com.example.jarvvis.kelompok1e;

import android.graphics.Point;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;

public class tampilan2a extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan2a);
        FragmentManager mFragmentManager = getSupportFragmentManager();
        FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
        WindowManager wm = getWindowManager();
        Display d = wm.getDefaultDisplay();
        Point ukuran = new Point();
        d.getSize(ukuran);

        if(ukuran.x>ukuran.y){
            //mode landscape
            MenuFragment2 fragment2 = new MenuFragment2();

            //mengacu ke konten view activity
            mFragmentTransaction.replace(android.R.id.content, fragment2);
        }else{
            //mode portrait
            MenuFragment1 fragment1 = new MenuFragment1();
            mFragmentTransaction.replace(android.R.id.content, fragment1);

        }

        mFragmentTransaction.commit();
    }
}

