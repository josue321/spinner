package com.example.spinner;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String[] valores = {"uno","dos","tres","cuatro","cinco","seis", "siete", "ocho"};

        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores));
        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
            {
                Toast.makeText(adapterView.getContext(), (String) adapterView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                // vacio

            }
        });

    }
}