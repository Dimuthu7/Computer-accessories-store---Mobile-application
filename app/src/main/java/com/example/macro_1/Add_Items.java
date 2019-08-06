package com.example.macro_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Add_Items extends AppCompatActivity {

    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_items);

        submit = findViewById(R.id.submit);
    }

    public void pressSubmit(View v){
        Intent intent1 = new Intent(Add_Items.this,Store.class);

        startActivity(intent1);
    }

}

