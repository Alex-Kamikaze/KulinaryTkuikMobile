package com.example.kulinaryanew.presentation.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kulinaryanew.R;
import com.example.kulinaryanew.databinding.FoodCardListItemBinding;
import com.example.kulinaryanew.domain.models.BludoModel;

import java.util.ArrayList;

public class FoodListAdapter extends RecyclerView.Adapter<FoodListAdapter.FoodListViewHolder> {
    FoodCardListItemBinding binding;
    ArrayList<BludoModel> foodList;
    Context innerContext;
    public FoodListAdapter(Context context, ArrayList<BludoModel> food) {
        foodList = food;
        innerContext = context;
    }

    @NonNull
    @Override
    public FoodListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = FoodCardListItemBinding.inflate(LayoutInflater.from(innerContext));
        return new FoodListViewHolder(binding.getRoot());
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    public void onBindViewHolder(@NonNull FoodListViewHolder holder, int position) {
        holder.foodName.setText(foodList.get(position).getBludoName());
        holder.categoryName.setText(foodList.get(position).getCategory());
        holder.price.setText(foodList.get(position).getBludoPrice());
        //holder.image.setImageDrawable(innerContext.getDrawable(foodList.get(position).get));
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public class FoodListViewHolder extends RecyclerView.ViewHolder {
        final ImageView image;
        final TextView foodName, categoryName, price;
        public FoodListViewHolder(@NonNull View itemView) {
            super(itemView);
            image = binding.bludoImage;
            foodName = binding.bludoName;
            categoryName = binding.categoryName;
            price = binding.price;
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    public void updateData(ArrayList<BludoModel> newFoodList) {
        foodList = newFoodList;
        this.notifyDataSetChanged();
    }
}
