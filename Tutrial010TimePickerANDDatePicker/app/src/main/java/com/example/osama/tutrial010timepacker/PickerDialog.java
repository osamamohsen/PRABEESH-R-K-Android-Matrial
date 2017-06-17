package com.example.osama.tutrial010timepacker;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;

import java.util.Calendar;

/**
 * Created by osama on 17/06/17.
 */

public class PickerDialog extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int week = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog dialog;
        DateSettings dateSettings = new DateSettings(getActivity());
        dialog = new DatePickerDialog(getActivity(),dateSettings,year,week,day);
        return  dialog;
//        return super.onCreateDialog(savedInstanceState);
    }
}
