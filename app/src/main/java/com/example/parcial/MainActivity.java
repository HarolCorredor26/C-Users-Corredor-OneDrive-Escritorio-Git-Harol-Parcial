package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button Pulse;
    private Button Botonpar;
    private Button BotonImpar;
    public TextView par;
    public TextView Impar;
    public TextView Mensaje;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Botonpar = findViewById(R.id.Par);
        BotonImpar = findViewById(R.id.Impar);
        Pulse = findViewById(R.id.Pulse);
        par = findViewById(R.id.TextPar);
        Impar = findViewById(R.id.TextImpar);
        Mensaje = findViewById(R.id.Mensaje);


    }

    public void FuncionPar (View view)
    {
        int P1=2;
        int P2=4;

        String TextoP = String.valueOf(P1);
        String TextoP2 = String.valueOf(P2);
        par.setText(TextoP);
        Impar.setText(TextoP2);


    }


    public void Impar (View view)
    {

        int I1= 3;
        int I2= 6;


        String TextoI = String.valueOf(I1);
        String TextoI2 = String.valueOf(I2);
        par.setText(TextoI);
        Impar.setText(TextoI2);

    }


    public void Mensaje (View view)
    {
        String Mensaje1 = "Gracias por usar la App";
        Mensaje.setText(Mensaje1);

    }
}