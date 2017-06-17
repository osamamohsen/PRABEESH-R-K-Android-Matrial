package com.example.osama.tutrial010timepacker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;
import android.widget.Toast;

/**
 * Created by osama on 17/06/17.
 */

public class DateSettings implements DatePickerDialog.OnDateSetListener {
    Context context;

    public DateSettings(Context context) {
        this.context = context;
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Toast.makeText(context,"Date is year: "+year+", Month: "+month+", Day: "+dayOfMonth,Toast.LENGTH_LONG).show();
    }
}
