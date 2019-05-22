package com.univalle.examen;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    Button calcular,atras;
    EditText unit;
    TextView Resultado;
    Double Unidad,Res;
    String val,codigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Resultado=findViewById(R.id.textResultado);
        calcular=findViewById(R.id.Calcular);
        unit=findViewById(R.id.Unidad);
        atras=findViewById(R.id.Atras);

        codigo=getIntent().getStringExtra("codigo");
        //Resultado.setText(codigo);

        switch (codigo){
                //Temperatura
            case "1":
                this.setTitle(R.string.btnTemperatura1);
                break;
            case "2":
                this.setTitle(R.string.btnTemperatura2);
                break;
            case "3":
                this.setTitle(R.string.btnTemperatura3);
                break;
            case "4":
                this.setTitle(R.string.btnTemperatura4);
                break;
                //Area
            case "5":
                this.setTitle(R.string.btnArea1);
                break;
            case "6":
                this.setTitle(R.string.btnArea2);
                break;
            case "7":
                this.setTitle(R.string.btnArea3);
                break;
            case "8":
                this.setTitle(R.string.btnArea4);
                break;
                //Distancia
            case "9":
                this.setTitle(R.string.btnDistancia1);
                break;
            case "10":
                this.setTitle(R.string.btnDistancia2);
                break;
            case "11":
                this.setTitle(R.string.btnDistancia3);
                break;
            case "12":
                this.setTitle(R.string.btnDistancia4);
                break;
            default:
                this.setTitle(R.string.app_name);
                break;
        }
        cargarPreferencias();
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guardarPreferencias();
                try{
                    String aux=unit.getText().toString();
                    Unidad=Double.parseDouble(aux);
                }catch (NumberFormatException nfe){}

                switch (codigo){
                    case "1":
                        Res=(Unidad*1.8)+32;
                        val=String.valueOf(Res);
                        Resultado.setText(val+" Fº");
                        break;
                    case "2":
                        Res=(Unidad-32)/1.8;
                        val=String.valueOf(Res);
                        Resultado.setText(val+" Cº");
                        break;
                    case "3":
                        Res=273.15+Unidad;
                        val=String.valueOf(Res);
                        Resultado.setText(val+" Fº");
                        break;
                    case "4":
                        Res=Unidad-273.15;
                        val=String.valueOf(Res);
                        Resultado.setText(val+" Fº");
                        break;
                    case "5":
                        Res=Unidad*10000;
                        val=String.valueOf(Res);
                        Resultado.setText(val+" m^2");
                        break;
                    case "6":
                        Res=Unidad*0.0001;
                        val=String.valueOf(Res);
                        Resultado.setText(val+" Hect");
                        break;
                    case "7":
                        Res=Unidad*0.000001;
                        val=String.valueOf(Res);
                        Resultado.setText(val+" Km^2");
                        break;
                    case "8":
                        Res=Unidad*1000000;
                        val=String.valueOf(Res);
                        Resultado.setText(val+" m^2");
                        break;
                    //Distancia
                    case "9":
                        Res=Unidad*100;
                        val=String.valueOf(Res);
                        Resultado.setText(val+" cm");
                        break;
                    case "10":
                        Res=Unidad/100;
                        val=String.valueOf(Res);
                        Resultado.setText(val+" m");
                        break;
                    case "11":
                        Res=Unidad*0.39370;
                        val=String.valueOf(Res);
                        Resultado.setText(val+" inch");
                        break;
                    case "12":
                        Res=Unidad*2.54;
                        val=String.valueOf(Res);
                        Resultado.setText(val+" cm");
                        break;
                }
            }
        });
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
    private void guardarPreferencias() {
        //IMPORTAMOS LA LIBRERIA SHARED PREFERENCES
        SharedPreferences prefs =
                getSharedPreferences("MisDatos", Context.MODE_PRIVATE);

        String UltimoNumero=unit.getText().toString();

        SharedPreferences.Editor editor = prefs.edit();

        editor.putString("Nombre",UltimoNumero);

       unit.setText(UltimoNumero);

        editor.commit();

    }

    private  void cargarPreferencias(){

        SharedPreferences prefs =
                getSharedPreferences("MisDatos", Context.MODE_PRIVATE);
        String UltimoNumero = prefs.getString("Nombre","No Existe");

        unit.setText(UltimoNumero);
    }
}
