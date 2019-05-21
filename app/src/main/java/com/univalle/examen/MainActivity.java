package com.univalle.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCelciusFahren,btnFahrenCelcius,btnFahrenKelvin,btnCelciusKelvin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCelciusFahren=findViewById(R.id.btnCenFah);
        btnFahrenCelcius=findViewById(R.id.btnFahCen);
        btnFahrenKelvin=findViewById(R.id.btnFahKel);
        btnCelciusKelvin=findViewById(R.id.btnCenKel);



        btnCelciusKelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Main2Activity.class);
                intent.putExtra("codigo","4");
                startActivityForResult(intent, 0);
            }
        });
    }

}
