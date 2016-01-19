package com.example.test4.date;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

/**
 * Created by bridgelabz4 on 18/12/15.
 */
public class Dated extends DialogFragment implements DatePickerDialog.OnDateSetListener
{

    EditText editText;
    public Dated(View view)
    {

        editText=(EditText)view;
            }
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        final Calendar cal=Calendar.getInstance();
        int year=cal.get(Calendar.YEAR);
        int month=cal.get(Calendar.MONTH);
        int day=cal.get(Calendar.DATE);
        return new DatePickerDialog(getActivity(),this,year,month,day);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int day) {
        String datee=day+"-"+(month+1)+"-"+year;
        editText.setText(datee);

    }
}
