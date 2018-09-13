package com.example.thematthewpattel.evidencia1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.example.thematthewpattel.evidencia1.cuenta.user;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        user curp = intent.getParcelableExtra("CURP");

        ((TextView)findViewById(R.id.iiApellidoP)).setText(curp.sApellidoP);
        ((TextView)findViewById(R.id.iiApellidoM)).setText(curp.sApellidoM);
        ((TextView)findViewById(R.id.iiNombres)).setText(curp.sNombres);
        ((TextView)findViewById(R.id.iiSexo)).setText(curp.sSexo);
        ((TextView)findViewById(R.id.iiFecha)).setText(curp.sFecha);
        ((TextView)findViewById(R.id.iiEntidad)).setText(curp.sEntidad);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.imCerrarSesion:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
