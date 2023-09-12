package com.example.ung_dung_chuyen_doi_nhiet_do;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtF, edtC;
    Button btnF, btnC, btn_Clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //biến nhận id
        edtF = findViewById(R.id.edt_Fahrenheit);
        edtC = findViewById(R.id.edt_Celsius);
        btnF = findViewById(R.id.btn_Fahrenheit);
        btnC = findViewById(R.id.btn_Celsius);
        btn_Clear = findViewById(R.id.btn_Clear);
        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                   int C = Integer.parseInt(edtC.getText().toString());
                   Double F = C * 1.8 + 32 ;
                   edtF.setText(F+"");
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 int F = Integer.parseInt(edtF.getText().toString());
                 Double C = (F-32)/1.8;
                 edtC.setText(C+"");
            }
        });

        btn_Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                     edtC.setText("");
                     edtF.setText("");
            }
        });
    }
}
