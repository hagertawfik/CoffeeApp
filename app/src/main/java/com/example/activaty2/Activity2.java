package com.example.activaty2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Activity2 extends AppCompatActivity {
    int count = 0;
    CheckBox checkBox1;
    CheckBox checkBox2;
    Button buton_order;
    TextView quintaty;
    Button btn_plus;
    Button btn_mince;
    TextView quintaty1;
    TextView cream;
    TextView choclate;
    TextView price;
    FloatingActionButton floting_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        checkBox1 = findViewById(R.id.checkbox1);
        checkBox2 = findViewById(R.id.checkbox2);
        cream = findViewById(R.id.cream);
        choclate = findViewById(R.id.choclate);
        buton_order = findViewById(R.id.buton_order);
        quintaty =  findViewById(R.id.quintaty);
        btn_plus = findViewById(R.id.btn_plus);
        btn_mince = findViewById(R.id.btn_mince);
        quintaty1 = findViewById(R.id.quantity1);
        price = findViewById(R.id.price);
        floting_btn = findViewById(R.id.floting_btn);
        floting_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String pric = price.getText().toString();
               String quin = quintaty.getText().toString();
               String choo = choclate.getText().toString();
               String creem = cream.getText().toString();
               String subject = choo+"   " +creem+"  "+" The"+quin+"    It is"+pric+"  pounds";
               Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, "hagertawfik2000@gmail.com");
                intent.putExtra(Intent.EXTRA_SUBJECT,subject);
             startActivity(intent);

            }
        });
    }

    public void pulse(View view) {
        count++;

        quintaty1.setText(""+count);
        quintaty.setText("Quantity:"+count);
        price.setText("Price:"+count*20);
    }

    public void mince(View view) {
        if (count <= 0) {
            count = 0;
        } else {
            count--;

            quintaty1.setText("" + count);
            quintaty.setText("Quantity:" + count);
            price.setText("Price:" + count * 20);
        }
        price.setText("Price:" + count * 20);
    }
    public void buttonOrder(View view) {
        if (checkBox1.isChecked() && !checkBox2.isChecked()) {
            cream.setText("Add Whippd Cream?" + "Yes");
            choclate.setText("Add Chocolate?" + "No");
        }
        if (checkBox2.isChecked() && !checkBox1.isChecked()) {
            choclate.setText("Add Chocolate?" + "Yes");
            cream.setText("Add Whippd Cream?" + "No");
        }
        if (checkBox1.isChecked() && checkBox2.isChecked()) {
            cream.setText("Add Whippd Cream?" + "Yes");
            choclate.setText("Add Chocolate?" + "Yes");
        }




    }






}