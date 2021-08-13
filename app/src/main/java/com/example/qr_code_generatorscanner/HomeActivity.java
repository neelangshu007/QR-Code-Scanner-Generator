package com.example.qr_code_generatorscanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private Button generateQRButton;
    private Button scanQRButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        generateQRButton = findViewById(R.id.QRCodeGeneratorBtn);
        scanQRButton = findViewById(R.id.QRCodeScannerBtn);

        generateQRButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, GenerateQRCodeActivity.class);
                startActivity(intent);
            }
        });

        scanQRButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ScanQRCodeActivity.class);
                startActivity(intent);
            }
        });

    }
}