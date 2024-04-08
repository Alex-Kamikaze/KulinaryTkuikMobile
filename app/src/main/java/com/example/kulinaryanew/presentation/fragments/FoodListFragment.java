package com.example.kulinaryanew.presentation.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kulinaryanew.R;
import com.example.kulinaryanew.databinding.FragmentFoodListBinding;

public class FoodListFragment extends Fragment {
    FragmentFoodListBinding viewBinding;
    NavController navController;
    public FoodListFragment() {}

    public static FoodListFragment newInstance() {
        return new FoodListFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        viewBinding = FragmentFoodListBinding.inflate(inflater);
        viewBinding.addFoodButton.setOnClickListener(v -> {
            Navigation.findNavController(viewBinding.getRoot()).navigate(R.id.action_foodListFragment_to_addFoodFragment);
        });
        return viewBinding.getRoot();
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        viewBinding = null;
    }
}