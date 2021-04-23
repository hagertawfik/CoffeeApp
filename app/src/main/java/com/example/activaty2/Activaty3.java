package com.example.activaty2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Activaty3 extends AppCompatActivity {
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activaty3);

        rv =findViewById(R.id.recycle);
        ArrayList<dataclass> data = new ArrayList<>();
        data.add(new dataclass(R.drawable.donuts,"Cinnamon Twist Doughnut","32$"));
        data.add(new dataclass(R.drawable.donuts,"Strawberry Frosted Doughnut","5$"));
        data.add(new dataclass(R.drawable.donuts,"Old-fashioned Doughnut","10$"));
        data.add(new dataclass(R.drawable.donuts,"Chocolate Frosted Doughnut","20$"));
        data.add(new dataclass(R.drawable.donuts,"Glazed Doughnut","30$"));
        data.add(new dataclass(R.drawable.donuts,"Jelly Doughnut","15$"));
        data.add(new dataclass(R.drawable.donuts,"Blueberry Doughnut","17$"));
        data.add(new dataclass(R.drawable.donuts,"Cruller","19$"));
        data.add(new dataclass(R.drawable.donuts,"Glazed Doughnut","14$"));
        data.add(new dataclass(R.drawable.donuts,"Old-fashioned Doughnut","12$"));
        data.add(new dataclass(R.drawable.donuts,"Strawberry Frosted Doughnut","3$"));
        data.add(new dataclass(R.drawable.donuts,"Chocolate Frosted Doughnut","20$"));
        data.add(new dataclass(R.drawable.donuts,"Glazed Doughnut","30$"));
        data.add(new dataclass(R.drawable.donuts,"Jelly Doughnut","15$"));
        data.add(new dataclass(R.drawable.donuts,"Blueberry Doughnut","17$"));
        data.add(new dataclass(R.drawable.donuts,"Cruller","19$"));
        data.add(new dataclass(R.drawable.donuts,"Glazed Doughnut","14$"));
        adapter adapt = new adapter(data);
        rv.setAdapter(adapt);
        RecyclerView.LayoutManager im=new LinearLayoutManager(this);
        rv.setLayoutManager(im);
        rv.setHasFixedSize(true);





////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //ListView li_view ;
//ArrayList<String> list_to_do;
        //    li_view = findViewById(R.id.li_view);
        //  list_to_do = new ArrayList<>();
        //  list_to_do.add("1-Cinnamon Twist Doughnut.");
        //   list_to_do.add("2-Strawberry Frosted Doughnut.");
        //     list_to_do.add("3-Old-fashioned Doughnut.");
        // list_to_do.add("4-Chocolate Frosted Doughnut.");
        //   list_to_do.add("5-Glazed Doughnut.");
        // list_to_do.add("6-Jelly Doughnut.");
        // list_to_do.add("7-Blueberry Doughnut.");
        // list_to_do.add("8-Cruller");
        // ArrayAdapter<String> aary_Adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,list_to_do);
        // li_view.setAdapter(aary_Adapter);
        //////////////////////////////////////////////////////////////////////////////////////////////////////

    }
}