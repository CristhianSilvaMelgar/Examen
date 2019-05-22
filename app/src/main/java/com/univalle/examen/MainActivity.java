package com.univalle.examen;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCelciusFahren,btnFahrenCelcius,btnFahrenKelvin,btnCelciusKelvin;
    Button btnHectMet2,btnMet2Hect,btnMet2Kil2,btnKil2Met2;
    Button btnMetCen,btnCenMet,btnCenInch,btnInchCen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCelciusFahren=findViewById(R.id.btnCenFah);
        btnFahrenCelcius=findViewById(R.id.btnFahCen);
        btnFahrenKelvin=findViewById(R.id.btnFahKel);
        btnCelciusKelvin=findViewById(R.id.btnCenKel);

        btnHectMet2=findViewById(R.id.btnHectMet);
        btnMet2Hect=findViewById(R.id.btnMetHect);
        btnMet2Kil2=findViewById(R.id.btnmetKil);
        btnKil2Met2=findViewById(R.id.btnKilMet);

        btnMetCen=findViewById(R.id.btnMetCen);
        btnCenMet=findViewById(R.id.btnCenMet);
        btnCenInch=findViewById(R.id.btnCenInch);
        btnInchCen=findViewById(R.id.btnInchCen);


        //Temp
        btnCelciusFahren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("codigo","1");
                startActivity(intent);
                finish();
            }
        });
        btnFahrenCelcius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("codigo","2");
                startActivity(intent);
                finish();
            }
        });
        btnFahrenKelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("codigo","3");
                startActivity(intent);
                finish();
            }
        });

        btnCelciusKelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("codigo","4");
                startActivity(intent);
                finish();
            }
        });

        //Area

        btnHectMet2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("codigo","5");
                startActivity(intent);
                finish();
            }
        });
        btnMet2Hect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("codigo","6");
                startActivity(intent);
                finish();
            }
        });
        btnMet2Kil2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("codigo","7");
                startActivity(intent);
                finish();
            }
        });
        btnKil2Met2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("codigo","8");
                startActivity(intent);
                finish();
            }
        });

        //Distancia

        btnMetCen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("codigo","9");
                startActivity(intent);
                finish();
            }
        });

        btnCenMet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("codigo","10");
                startActivity(intent);
                finish();
            }
        });

        btnCenInch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("codigo","11");
                startActivity(intent);
                finish();
            }
        });

        btnInchCen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("codigo","12");
                startActivity(intent);
                finish();
            }
        });
    }


}
