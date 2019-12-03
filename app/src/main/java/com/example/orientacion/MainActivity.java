package com.example.orientacion;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    // false -> vertical ,  true -> horizontal
    private boolean estadoOrientacion = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean("orientacion", !this.estadoOrientacion);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        this.estadoOrientacion = savedInstanceState.getBoolean("orientacion");
        if(this.estadoOrientacion){
            setContentView(R.layout.layout);
        }else{
            setContentView(R.layout.activity_main);
        }

    }

    private int num =0;

}
