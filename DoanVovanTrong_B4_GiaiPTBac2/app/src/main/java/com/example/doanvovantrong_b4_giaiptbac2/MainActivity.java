package com.example.doanvovantrong_b4_giaiptbac2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtA, edtB, edtC, edtKQ;
    Button btnTiepTuc, btnGiaiPT, btnThoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ÁNh xạ id
        setContentView(R.layout.activity_main);
        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        edtC = findViewById(R.id.edtC);
        edtKQ = findViewById(R.id.edtKQ);

        btnTiepTuc = findViewById(R.id.btnTiepTuc);
        btnThoat = findViewById(R.id.btnThoat);
        btnGiaiPT = findViewById(R.id.btnGiaiPT);
        edtA.requestFocus();

        btnGiaiPT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                int c = Integer.parseInt(edtC.getText().toString());
                double x = 0;
                int delta = 0;
                if (a != 0) {
                    delta = b * b - 4 * a * c;
                    if (delta < 0) {
                        edtKQ.setText("Phương trình vô nghiệm");
                    } else if (delta == 0) {
                         x = (double)(-b / 2 * a);
                        edtKQ.setText("Phương trình có nghiệm kép x1 = x2 = " + String.format("%.3f",x));
                    } else {
                        double x1 =  (double)(-b + Math.sqrt(delta)) / 2 * a;
                        double x2 = (double)(-b - Math.sqrt(delta)) / 2 * a;
                        edtKQ.setText("Phương trình có 2 nghiệm : \n x1 = " + String.format("%.3f",x1) + " \n x2 = " + String.format("%.3f",x2));
                    }
                } else {
                    if (b == 0) {
                        if (c == 0) {
                            edtKQ.setText("Vô số nghiệm");
                        } else {
                            edtKQ.setText("Phương triình vô nghiệm");
                        }
                    } else {
                        if (c == 0 || c != 0) {
                            x = (double)(-c / b);
                            edtKQ.setText("Phương trình có nghiệm x = " + String.format("%.3f",x));
                        }
                    }
                }
            }
        });
    }
}