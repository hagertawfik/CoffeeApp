package com.example.activaty2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.activaty2.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

  //  Button btn_donut ;
  //  Button btn_coffee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_main);
       // btn_donut = findViewById(R.id.btn_donut);
    //    btn_coffee = findViewById(R.id.btn_coffee);

        ActivityMainBinding bind = ActivityMainBinding.inflate(getLayoutInflater());
        View v = bind.getRoot();
        setContentView(v);

           bind.btnDonut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intten = new Intent(MainActivity.this,Activaty3.class);
                startActivity(intten);

            }
        });
      bind.btnCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,Activity2.class);
                startActivity(intent1);
            }
        });

    }
}