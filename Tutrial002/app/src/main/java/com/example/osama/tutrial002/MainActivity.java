package com.example.osama.tutrial002;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.edt_txt_message);
    }

    public void sendMessage(View v){
        String text = editText.getText().toString();
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("message",text);
        startActivity(intent);
    }
}
