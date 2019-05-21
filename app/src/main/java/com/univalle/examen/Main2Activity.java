package com.univalle.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    Button calcular;
    EditText Resultado,unit;
    Double Unidad,Res;
    String val,codigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();
        Resultado=findViewById(R.id.textResultado);
        calcular=findViewById(R.id.Calcular);
        unit=findViewById(R.id.Unidad);
        Unidad=Double.parseDouble(unit.getText().toString());
        //codigo=bundle.getString("codigo");
        /*switch (codigo){
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
            default:
                this.setTitle(R.string.app_name);
                break;
        }
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (codigo){
                    case "1":
                        Res=Unidad*2-Unidad/5;
                        val=String.valueOf(Res);
                        Resultado.setText(val+" Fº");
                        break;
                    case "2":
                        Res=Unidad*2-Unidad/5;
                        val=String.valueOf(Res);
                        Resultado.setText(val+" Fº");
                        break;
                    case "3":
                        Res=Unidad*2-Unidad/5;
                        val=String.valueOf(Res);
                        Resultado.setText(val+" Fº");
                        break;
                    case "4":
                        Res=Unidad*2-Unidad/5;
                        val=String.valueOf(Res);
                        Resultado.setText(val+" Fº");
                        break;
                }
            }
        });*/
    }
}
