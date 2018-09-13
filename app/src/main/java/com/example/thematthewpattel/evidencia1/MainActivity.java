package com.example.thematthewpattel.evidencia1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import com.example.thematthewpattel.evidencia1.cuenta.user;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner)findViewById(R.id.iEntidad);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.iEntidadLista, R.layout.support_simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        Button button = (Button) findViewById(R.id.iBuscarCURP);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        }
        );

    }

    public void openActivity2() {

        user curp = new user();

        curp.sApellidoP = ((EditText)findViewById(R.id.iApellidoP)).getText().toString();

        curp.sApellidoM = ((EditText)findViewById(R.id.iApellidoM)).getText().toString();

        curp.sNombres = ((EditText)findViewById(R.id.iNombres)).getText().toString();

        curp.sSexo = ((RadioButton)findViewById(((RadioGroup)findViewById(R.id.iSexo)).getCheckedRadioButtonId())).getText().toString();

        curp.sFecha = ((EditText)findViewById(R.id.iFecha)).getText().toString();

        curp.sEntidad = ((Spinner)findViewById(R.id.iEntidad)).getSelectedItem().toString();

        Intent Actividad = new Intent(this, Activity2.class);
        Actividad.putExtra("CURP", curp);
        startActivity(Actividad);
    }
}
