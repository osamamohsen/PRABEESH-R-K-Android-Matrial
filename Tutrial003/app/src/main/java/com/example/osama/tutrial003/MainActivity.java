package com.example.osama.tutrial003;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * add an new Second Activity
     * @param v
     */
    public void goToSecondActivity(View v){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
