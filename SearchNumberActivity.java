package com.security.parkingeye;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class SearchNumberActivity extends AppCompatActivity {

    private ImageView homelogo;
    private ImageView searchnumber;
    private ImageView searchnumber1;
    private ImageView numbersearchtext;
    private ImageView yes;
    private ImageView no;
    private ImageView state;
    private ImageView carimage;
    private ImageView button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchspace);

        homelogo = findViewById(R.id.homelogo);
        searchnumber = findViewById(R.id.searchnumber);
        searchnumber1 = findViewById(R.id.searchnumber1);
        numbersearchtext = findViewById(R.id.numbersearchtext);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        state = findViewById(R.id.state);
        carimage = findViewById(R.id.carimage);
        button = findViewById(R.id.button);
    }
}
