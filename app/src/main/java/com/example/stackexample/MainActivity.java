package com.example.stackexample;

import static android.content.Intent.FLAG_ACTIVITY_PREVIOUS_IS_TOP;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.stackexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.to2nd.setOnClickListener(view -> {
            binding.back.setVisibility(View.VISIBLE);
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(intent);
        });

        binding.to3rd.setOnClickListener(view -> {
            binding.back.setVisibility(View.VISIBLE);
            Intent intent = new Intent(MainActivity.this, MainActivity3.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(intent);
        });

        binding.back.setOnClickListener(view -> {
            if (!isTaskRoot()) finish();
            else Toast.makeText(this, "Я запрещаю закрывать это приложение!", Toast.LENGTH_SHORT).show();
        });
    }

}