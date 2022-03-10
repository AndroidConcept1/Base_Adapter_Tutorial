package com.abulkalam.base_adapter_tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    int books[] = {R.drawable.book1, R.drawable.book2,R.drawable.book3, R.drawable.book4,R.drawable.book5,
            R.drawable.book6,R.drawable.book7, R.drawable.book8 };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.simpleGridView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), books);
        gridView.setAdapter(customAdapter);
    }
}