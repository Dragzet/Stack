package com.example.stackexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.stackexample.databinding.ActivityMain3Binding;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMain3Binding binding = ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.to1nd.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity3.this, MainActivity.class);
            //intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(intent);
        });

        binding.to2rd.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity2.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(intent);
        });

        binding.back.setOnClickListener(view -> {
            finish();
        });
    }
}