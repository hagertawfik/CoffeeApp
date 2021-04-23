package com.example.activaty2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;


public class veiwholder extends RecyclerView.ViewHolder {
    ImageView dont_image ;
    TextView dont_name;
    TextView dont_price;


    public veiwholder(@NonNull View item) {
        super(item);
        dont_image = item.findViewById(R.id.image);
        dont_name = item.findViewById(R.id.name);
        dont_price = item.findViewById(R.id.price);
    }
}
