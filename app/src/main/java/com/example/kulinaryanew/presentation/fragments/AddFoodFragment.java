package com.example.kulinaryanew.presentation.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.kulinaryanew.databinding.FragmentAddFoodBinding;

public class AddFoodFragment extends Fragment {
    FragmentAddFoodBinding viewBinding;
    public AddFoodFragment() {
        // Required empty public constructor
    }
    public static AddFoodFragment newInstance(String param1, String param2) {
        return new AddFoodFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        viewBinding = FragmentAddFoodBinding.inflate(inflater);
        return viewBinding.getRoot();
    }
}