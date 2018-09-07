package com.iteso.tarea1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

public class ActivityMain extends AppCompatActivity {

    Spinner spinner;
    AutoCompleteTextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.activity_main_spinner);
        textView = findViewById(R.id.activity_main_auto);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.escolaridad, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        String[] books = getResources().getStringArray(R.array.libros);
        ArrayAdapter<String> adapterA = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, books);
        textView.setAdapter(adapterA);


    }
}
