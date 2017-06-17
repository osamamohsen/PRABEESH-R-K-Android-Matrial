package com.example.osama.tutrial010timepacker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog(View view){
        DialogHandler dialogHandler = new DialogHandler();
        dialogHandler.show(getSupportFragmentManager(),"Time_Picker");
    }

    public void  showDatePicker(View view){
        PickerDialog pickerDialog = new PickerDialog();
        pickerDialog.show(getSupportFragmentManager(),"Date_Picker");
    }
}
