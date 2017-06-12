package com.example.osama.tutrial001;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_msg = (TextView) findViewById(R.id.txt_view);
    }

    public void showGreetings(View v){
        Intent intent;
        switch (v.getId()) {

            case R.id.btn_show_greeting:
                text_msg.setText("Welcome in Greetings");
                break;

            case R.id.btn_second_activity:
                intent = new Intent(this,SecondActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_third_activity:
                intent = new Intent(this, ThirdActivity.class);
                startActivity(intent);
                break;

            default:
                break;
        }
    }
}
