package com.example.life_cyrcle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   Button btnCall ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Thông báo -> GÕ toast + Ctr + cách
        Toast.makeText(this, "CR_OnCreate", Toast.LENGTH_LONG).show(); //Chọn long 3.5s , short 2s
//        ánh xa id
        btnCall = findViewById(R.id.btn_call);

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Khai báo intent để gọi main_activity sang sub_activity
                Intent myIntent = new Intent(MainActivity.this, SubActivitie.class);//Truyền tham số thứ nhất đee gọi tham số thứ 2
                //Khởi động
                startActivity(myIntent); // Khởi động activity thứ 2 khi ấn vào button
            }
        });
    }
//    Chột phải -> generate -> override method

    public MainActivity() {
        super();
    }

    @Override
    protected void onStart() {
        super.onStart();
//        Đặt thông báo
        Toast.makeText(this, "CR_Onstart", Toast.LENGTH_LONG).show(); //Chọn long 3.5s , short 2s
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "CR_Onstop", Toast.LENGTH_LONG).show(); //Chọn long 3.5s , short 2s
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "CR_OnDestroy", Toast.LENGTH_LONG).show(); //Chọn long 3.5s , short 2s
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "CR_OnPause", Toast.LENGTH_LONG).show(); //Chọn long 3.5s , short 2s
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "CR_Resume", Toast.LENGTH_LONG).show(); //Chọn long 3.5s , short 2s
    }
}