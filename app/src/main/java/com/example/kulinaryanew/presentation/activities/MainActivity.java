package com.example.kulinaryanew.presentation.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.kulinaryanew.R;
import com.example.kulinaryanew.databinding.ActivityMainBinding;
import com.example.kulinaryanew.domain.models.BludoModel;
import com.example.kulinaryanew.presentation.adapters.FoodListAdapter;
import com.example.kulinaryanew.presentation.viewmodels.FoodListViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    FoodListViewModel foodListViewModel;
    FoodListAdapter adapter;
    ActivityMainBinding binding;
    ArrayList<BludoModel> foodList;

    @Override
    public boolean onSupportNavigateUp() {
        return Navigation.findNavController(this, R.id.navigation_host_fragment).navigateUp();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        foodListViewModel = new ViewModelProvider(this).get(FoodListViewModel.class);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        foodList = (ArrayList<BludoModel>) foodListViewModel.bludos.getValue();
        if(foodList == null) {
            foodList = new ArrayList<>();
        }
        adapter = new FoodListAdapter(this, foodList);
        foodListViewModel.bludos.observe(this, bludoModels -> {
            foodList = (ArrayList<BludoModel>) bludoModels;
            adapter.updateData((ArrayList<BludoModel>) bludoModels);
        });
    }
}