package com.example.osama.tutrial006;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView fruit_selected,result_toggle;
    Switch aSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fruit_selected = (TextView) findViewById(R.id.fruit_selected);
        result_toggle = (TextView) findViewById(R.id.result);
        aSwitch = (Switch) findViewById(R.id.toggle_button_2);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                 if(isChecked)
                     result_toggle.setText("Wifi On");
                else
                    result_toggle.setText("Wifi Off");
            }
        });
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

    public void changeVibrateState(View view){
        boolean checked = ((ToggleButton)view).isChecked();
        if(checked){
            result_toggle.setText("Vibrate On");
        }else{
            result_toggle.setText("Vibrate Off");
        }
    }
}
