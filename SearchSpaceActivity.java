package com.security.parkingeye;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class SearchSpaceActivity extends AppCompatActivity {

    // ImageView 선언
    private ImageView homelogo;
    private ImageView searchemptyspace;
    private ImageView searchspace;
    private ImageView floor;
    private ImageView state;
    private ImageView emptyfull;
    private ImageView button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchspace);

        homelogo = findViewById(R.id.homelogo);
        searchemptyspace = findViewById(R.id.searchemptyspace);
        searchspace = findViewById(R.id.searchspace);
        floor = findViewById(R.id.floor);
        state = findViewById(R.id.state);
        emptyfull = findViewById(R.id.emptyfull);
        button = findViewById(R.id.button);

    }
}
