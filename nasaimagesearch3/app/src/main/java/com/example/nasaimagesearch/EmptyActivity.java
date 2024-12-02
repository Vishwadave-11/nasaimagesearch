package com.example.nasaimagesearch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class EmptyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);

        Bundle itemData = getIntent().getExtras();
        ItemFragment itemFragment = new ItemFragment();
        itemFragment.setArguments(itemData);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.emptyLayout, itemFragment)
                .commit();
    }
}

