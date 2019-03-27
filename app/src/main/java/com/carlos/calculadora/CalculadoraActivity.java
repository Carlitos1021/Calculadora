package com.carlos.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

public class CalculadoraActivity extends AppCompatActivity implements OnClickListener{

    boolean decimal = false;
    boolean sum = false;
    boolean res = false;
    boolean mult = false;
    boolean divi = false;
    Double [] numero = new Double[20];
    Double dato;
    EditText Ejj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        Ejj =(EditText)findViewById(R.id.mostrar);


        Button uno = (Button)findViewById(R.id.Botonuno);
        uno.setOnClickListener(this);

        Button dos = (Button)findViewById(R.id.Botondos);
        dos.setOnClickListener(this);

        Button tres = (Button)findViewById(R.id.Botontres);
        tres.setOnClickListener(this);

        Button cuatro = (Button)findViewById(R.id.Botocuatro);
        cuatro.setOnClickListener(this);

        Button cinco = (Button)findViewById(R.id.Botoncinco);
        cinco.setOnClickListener(this);

        Button seis = (Button)findViewById(R.id.Botonseis);
        seis.setOnClickListener(this);

        Button siete = (Button)findViewById(R.id.Botosiete);
        siete.setOnClickListener(this);

        Button ocho = (Button)findViewById(R.id.Botonocho);
        ocho.setOnClickListener(this);

        Button nueve = (Button)findViewById(R.id.Botonnueve);
        nueve.setOnClickListener(this);

        Button cero = (Button)findViewById(R.id.Botocero);
        cero.setOnClickListener(this);

        Button division = (Button)findViewById(R.id.Botondivision);
        division.setOnClickListener(this);

        Button multiplicacion = (Button)findViewById(R.id.Botonmultiplicacion);
        multiplicacion.setOnClickListener(this);

        Button suma = (Button)findViewById(R.id.Botonmas);
        suma.setOnClickListener(this);

        Button resta = (Button)findViewById(R.id.Botonresta);
        resta.setOnClickListener(this);

        Button punto = (Button)findViewById(R.id.Botopunto);
        punto.setOnClickListener(this);

        Button limpiar = (Button)findViewById(R.id.Limpiar);
        uno.setOnClickListener(this);

        Button igual = (Button)findViewById(R.id.Botonigual);
        igual.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        EditText mostrar = (EditText)findViewById(R.id.mostrar);
        int selector = v.getId();
        String x = mostrar.getText().toString();

        try {

            switch(selector){

                case R.id.Botonuno:
                mostrar.setText(x+"1");
                break;

                case R.id.Botondos:
                    mostrar.setText(x+"2");
                    break;

                case R.id.Botontres:
                    mostrar.setText(x+"3");
                    break;

                case R.id.Botocuatro:
                    mostrar.setText(x+"4");
                    break;

                case R.id.Botoncinco:
                    mostrar.setText(x+"5");
                    break;

                case R.id.Botonseis:
                    mostrar.setText(x+"6");
                    break;

                case R.id.Botosiete:
                    mostrar.setText(x+"7");
                    break;

                case R.id.Botonocho:
                    mostrar.setText(x+"8");
                    break;

                case R.id.Botonnueve:
                    mostrar.setText(x+"9");
                    break;

                case R.id.Botocero:
                    mostrar.setText(x+"0");
                    break;

                case R.id.Botopunto:
                    if (decimal==false){
                        mostrar.setText(x+".");
                        decimal=true;
                    }else{return;}
                    break;

                case R.id.Botonmultiplicacion:
                    mult=true;
                    numero[0]=Double.parseDouble(x);
                    mostrar.setText("");
                    decimal=false;
                    break;

                case R.id.Botondivision:
                    divi=true;
                    numero[0]=Double.parseDouble(x);
                    mostrar.setText("");
                    decimal=false;
                    break;

                case R.id.Botonmas:
                    sum=true;
                    numero[0]=Double.parseDouble(x);
                    mostrar.setText("");
                    decimal=false;
                    break;

                case R.id.Botonresta:
                    res=true;
                    numero[0]=Double.parseDouble(x);
                    mostrar.setText("");
                    decimal=false;
                    break;

                case R.id.Limpiar:
                    /*mostrar.setText("");
                    decimal=false;*/
                    break;

                case R.id.Botonigual:
                    numero[1]=Double.parseDouble(x);
                    if(sum==true){
                        dato=numero[0] + numero[1];
                        mostrar.setText(String.valueOf(dato));
                    }else if (res==true){

                        dato=numero[0] - numero[1];
                        mostrar.setText(String.valueOf(dato));
                    }else if(mult==true){
                        dato=numero[0] * numero[1];
                        mostrar.setText(String.valueOf(dato));
                    }else if (divi==true){
                        dato=numero[0] / numero[1];
                        mostrar.setText(String.valueOf(dato));
                    }
                    decimal=false;
                    sum=false;
                    res=false;
                    mult=false;
                    divi=false;
                    break;
            }

        }catch (Exception e){

            mostrar.setText("ERROR");
        }

    }

    public void limpiar(View view){


        Ejj.setText("");

    }
}
