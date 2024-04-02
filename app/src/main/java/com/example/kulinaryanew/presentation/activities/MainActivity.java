package com.example.kulinaryanew.presentation.activities;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

import com.example.kulinaryanew.R;
import com.example.kulinaryanew.databinding.ActivityMainBinding;
import com.example.kulinaryanew.presentation.viewmodels.FoodListViewModel;

public class MainActivity extends AppCompatActivity {
    FoodListViewModel foodListViewModel;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        foodListViewModel = new ViewModelProvider(this).get(FoodListViewModel.class);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}