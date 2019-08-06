package com.example.macro_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Store extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
    }

    public void setUpdate(View view){

        Intent intent1 = new Intent(Store.this,Update_Items.class);

        startActivity(intent1);
    }

    public void setAddBtn(View view){

        Intent intent2 = new Intent(Store.this,Add_Items.class);

        startActivity(intent2);
    }
}
