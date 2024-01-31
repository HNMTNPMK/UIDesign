package com.example.uidesign;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainCustomerInfo extends AppCompatActivity {
    private EditText etName, etPhone, etAddress;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maincustomerinfo);
        setContentView(R.layout.activity_maincustomerinfo1);

        etName = findViewById(R.id.etName);
        etPhone = findViewById(R.id.etPhone);
        etAddress = findViewById(R.id.etAddress);
        btnSave = findViewById(R.id.btnSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();
                String phone = etPhone.getText().toString();
                String address = etAddress.getText().toString();

                // Xử lý logic lưu thông tin khách hàng vào cơ sở dữ liệu hoặc hệ thống khác

                Toast.makeText(MainCustomerInfo.this, "Saved successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}