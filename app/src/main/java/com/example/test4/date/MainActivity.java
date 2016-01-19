package com.example.test4.date;


import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity implements View.OnFocusChangeListener{
Dated dated;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText txt=(EditText)findViewById(R.id.Textdata);
        txt.setOnFocusChangeListener(this);

    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        if(hasFocus){
                  Dated dated= new Dated(v);
               FragmentTransaction ft=getFragmentManager().beginTransaction();
             dated.show(ft, "TimePicker");
    }}

//  public  void onStart(){
  //  super.onStart();
    //    EditText txt=(EditText)findViewById(R.id.Textdata);
      //  txt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
        //    @Override
          //  public void onFocusChange(View v, boolean hasFocus) {
            //    if(hasFocus){
              //      Dated dated= new Dated(v);
                //    FragmentTransaction ft=getFragmentManager().beginTransaction();
                  //  dated.show(ft, "DatePicker");
               // }
           // }
      //  });
   // }


}
