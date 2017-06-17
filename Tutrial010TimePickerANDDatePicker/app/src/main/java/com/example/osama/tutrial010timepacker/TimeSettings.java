package com.example.osama.tutrial010timepacker;

import android.app.TimePickerDialog;
import android.content.Context;
import android.widget.TimePicker;
import android.widget.Toast;

/**
 * Created by osama on 17/06/17.
 */

public class TimeSettings implements TimePickerDialog.OnTimeSetListener{
    Context context;

    public TimeSettings(Context context) {
        this.context = context;
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        Toast.makeText(context,"Time in Hour: "+hourOfDay+"Time in Minute: "+minute,Toast.LENGTH_LONG).show();
    }
}
