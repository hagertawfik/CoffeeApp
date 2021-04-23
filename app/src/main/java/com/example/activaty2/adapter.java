package com.example.activaty2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<veiwholder> {
    ArrayList<dataclass> datalist = new ArrayList<>();

    public adapter(ArrayList<dataclass> datalist) {
        this.datalist = datalist;
    }

    @NonNull
    @Override
    public veiwholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,null,false);
        veiwholder veiw = new veiwholder(v);
        return veiw;
    }

    @Override
    public void onBindViewHolder(@NonNull veiwholder holder, int position) {

dataclass data_class = datalist.get(position);
        holder.dont_image.setImageResource(data_class.getImage());
        holder.dont_name.setText(data_class.getName());
        holder.dont_price.setText(data_class.getPrice());
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }
}
