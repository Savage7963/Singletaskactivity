package com.example.singletaskactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void gotosingletaskactivity(View view) {
        startActivity(new Intent(this, MainActivity2.class));
        Toast.makeText(this, "went to back", Toast.LENGTH_SHORT).show();
    }
}