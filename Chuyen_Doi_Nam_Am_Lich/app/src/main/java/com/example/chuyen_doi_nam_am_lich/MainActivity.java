package com.example.chuyen_doi_nam_am_lich;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText edt_DL , edt_AL ;
Button btn_ChuyenDoi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_DL = findViewById(R.id.edt_DuongLich);
        edt_AL = findViewById(R.id.edt_AmLich);
        btn_ChuyenDoi = findViewById(R.id.btn_ChuyenDoi);
        btn_ChuyenDoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String can ="", chi = "";
                int namDuong = Integer.parseInt( edt_DL.getText().toString());
                switch (namDuong%10){
                    case 0 : can = "Canh" ; break;
                    case 1 : can = "Tân" ; break;
                    case 2 : can = "Nhân" ; break;
                    case 3 : can = "Quý" ; break;
                    case 4 : can = "Giáp" ; break;
                    case 5 : can = "Ất" ; break;
                    case 6 : can = "Bình" ; break;
                    case 7 : can = "Đinh" ; break;
                    case 8 : can = "Mậu" ; break;
                    case 9 : can = "Kỷ" ; break;
                }

                switch (namDuong % 12){
                    case 0 : chi = "Thân"; break;
                    case 1 : chi = "Dậu"; break;
                    case 2 : chi = "Tất"; break;
                    case 3 : chi = "Hợi"; break;
                    case 4 : chi = "Tí"; break;
                    case 5 : chi = "Sửu"; break;
                    case 6 : chi = "Dần"; break;
                    case 7 : chi = "Mẹo"; break;
                    case 8 : chi = "Thìn"; break;
                    case 9 : chi = "Tị"; break;
                    case 10 : chi = "Ngọ"; break;
                    case 11 : chi = "Mùi"; break;
                }

                edt_AL.setText(can + " " + chi);
            }
        });

    }
}