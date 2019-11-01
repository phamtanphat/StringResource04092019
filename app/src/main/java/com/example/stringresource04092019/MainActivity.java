package com.example.stringresource04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtUser,edtPassword;
    Button btnLogin;
    TextView txtInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // tao branch : git branch tennhanh
        // chuyen branch : git checkout tennhanh
        edtPassword = findViewById(R.id.edittextMatkhau);
        edtUser = findViewById(R.id.edittextTaikhoan);
        btnLogin = findViewById(R.id.buttonDangnhap);
        txtInfo = findViewById(R.id.textviewThongtin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String tk = edtUser.getText().toString();
                String mk = edtPassword.getText().toString();

                String tkResource = getResources().getString(R.string.label_info_taikhoan);
                String mkResource = getResources().getString(R.string.label_info_matkhau);
                txtInfo.setText(tkResource + tk + "\n" + mkResource + mk);
            }
        });
    }
}
