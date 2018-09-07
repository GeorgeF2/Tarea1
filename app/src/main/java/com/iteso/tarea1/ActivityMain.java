package com.iteso.tarea1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class ActivityMain extends AppCompatActivity {

    EditText name;
    EditText phone;
    Spinner degree;
    RadioGroup gender;
    AutoCompleteTextView book;
    CheckBox sport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.activity_main_nombre);
        phone = findViewById(R.id.activity_main_telefono);
        degree = findViewById(R.id.activity_main_spinner);
        gender = findViewById(R.id.activity_main_rg);
        book = findViewById(R.id.activity_main_auto);
        sport = findViewById(R.id.activity_main_check);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.escolaridad, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        degree.setAdapter(adapter);

        String[] books = getResources().getStringArray(R.array.libros);
        ArrayAdapter<String> adapterA = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, books);
        book.setAdapter(adapterA);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu m){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_main, m);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.new_menu:
                saveData();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void limpiar(View v){
        name.setText("");
        phone.setText("");
        gender.check(0);
        degree.setSelection(0);
        book.setText("");
        sport.setChecked(false);
    }

    public void saveData(){
        Alumno alumno = new Alumno(name.getText().toString(),phone.getText().toString(),degree.getSelectedItem().toString(), String.valueOf(gender.getCheckedRadioButtonId()), book.getText().toString(),String.valueOf(sport.isChecked()));
        Toast.makeText(this, alumno.toString(), Toast.LENGTH_LONG).show();
    }
}
