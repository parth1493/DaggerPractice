package com.example.daggerpractice.ui.main;

import android.os.Bundle;
import android.widget.Toast;

import com.example.daggerpractice.BaseActivity;
import com.example.daggerpractice.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Hello Sir I am in",Toast.LENGTH_LONG).show();
    }
}
