package com.example.parkingeye;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class openingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opening); // opening.xml 연결

        // 5초 후 login 화면으로 전환
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(openingActivity.this, loginActivity.class);
            startActivity(intent);
            finish(); // 현재 Activity를 종료하여 뒤로 가기 버튼으로 돌아가지 않도록 함
        }, 5000); // 5000ms = 5초
    }
}
