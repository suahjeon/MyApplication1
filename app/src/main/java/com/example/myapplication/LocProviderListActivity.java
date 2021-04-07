package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class LocProviderListActivity extends AppCompatActivity {
    TextView mTextView;
    LocationManager locMgr;
    List<String> locProviders;
    Button mbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mTextView = findViewById(R.id.txtOutput);
        locMgr = (LocationManager) getSystemService(LOCATION_SERVICE);
        locProviders = locMgr.getAllProviders();//new LocationManager(); 가져오는거

        mbutton = findViewById(R.id.button);
        mbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String s = "";
                String[] array = new String[0];
                for(String i : array){
                    System.out.println(s);
                    System.out.println("Loc.Provider" + locProviders.get(0) + "\n"
                            + "Status : " + locMgr.isProviderEnabled(locProviders.get(0)) + "\n\n");
                }
                mTextView.setText(s);

                                       }
        });

    }

}
