package com.example.osama.tutrial006;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView fruit_selected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fruit_selected = (TextView) findViewById(R.id.fruit_selected);
    }

    public void selectFruit(View v){
        boolean checked = ((RadioButton)v).isChecked();
        switch (v.getId()){
            case R.id.fruit_apple:
                if(checked)
                    fruit_selected.setText("apple");
                break;
            case R.id.fruit_grapes:
                if(checked)
                    fruit_selected.setText("grapes");
                break;
            case R.id.fruit_orange:
                if(checked)
                    fruit_selected.setText("orange");
                break;
        }
    }
}
