package com.example.osama.tutrial005;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<String> selections = new ArrayList<String>();
    TextView finalText;

    AutoCompleteTextView autoCompleteTextView;
    String [] Country_names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoComplete);
        Country_names = getResources().getStringArray(R.array.country_names);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Country_names);
        autoCompleteTextView.setAdapter(arrayAdapter);
    }

    public void selectItem(View v){
        boolean checked = ((CheckBox) v).isChecked();
        switch (v.getId()){
            case R.id.fruit_banana:
                if(checked) selections.add("banana");
                else selections.remove("banana");
            break;
            case R.id.fruit_grapes:
                if(checked) selections.add("grapes");
                else selections.remove("grapes");
            break;
            case R.id.fruit_orange:
                if(checked) selections.add("orange");
                else selections.remove("orange");
            break;
        }
    }

    public void finalSelections(View v){
        finalText = (TextView) findViewById(R.id.final_result);
        String final_fruit_selection = "";
        for(String selection : selections){
            final_fruit_selection += selection+"\n";
        }
        finalText.setText(final_fruit_selection);
    }
}
