package com.example.mobile_bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //khai báo các biến giao diện
    EditText A, B, KQ;
    Button btnUndo, btnRS, btnCong, btnTru, btnNhan, btnChia;

    public static int previousA, previousB, previousKQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ánh xạ id và chức năng
        A = findViewById(R.id.edtA);
        B = findViewById(R.id.edtB);
        KQ = findViewById(R.id.edt_KetQua);

        //bắt btn
        btnRS = findViewById(R.id.btn_Reset);
        btnUndo = findViewById(R.id.btn_Undo);
        btnCong = findViewById(R.id.btn_Cong);
        btnTru = findViewById(R.id.btn_Tru);
        btnNhan = findViewById(R.id.btn_Nhan);
        btnChia = findViewById(R.id.btn_Chia);

        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(A.getText().toString());
                int b = Integer.parseInt(B.getText().toString());
                int c = a + b;
                KQ.setText(c + "");
            }
        });
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(A.getText().toString());
                int b = Integer.parseInt(B.getText().toString());
                double c = a / b;
                KQ.setText(c + "");
            }
        });
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(A.getText().toString());
                int b = Integer.parseInt(B.getText().toString());
                int c = a - b;
                KQ.setText(c + "");
            }
        });
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(A.getText().toString());
                int b = Integer.parseInt(B.getText().toString());
                int c = a * b;
                KQ.setText(c + "");
            }
        });


        btnRS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A.setText("");
                B.setText("");
                KQ.setText("");
            }
        });

        btnUndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A.setText(previousA + "");
                B.setText(previousB + "");
                KQ.setText(previousKQ + "");
            }
        });
    }
}