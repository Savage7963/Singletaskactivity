package com.example.singletaskactivity;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Toast.makeText(this, "on New intent method called", Toast.LENGTH_SHORT).show();

    }


    public void launchhome(View view) {
        startActivity(new Intent(this,MainActivity.class));
    }

    public void launchfirstandsecond(View view) {
        startActivity(new Intent(this,MainActivity3.class)); //first activity
        startActivity(new Intent(this,MainActivity4.class)); // activity 2

    }
}