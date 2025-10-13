package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Queue;

public class Main extends AppCompatActivity {
    private double primernumero, segundonumero, resultado;
    private String operacion = null;
    private TextView Result;
    private Button Suma,Resta,Multiplicacion,Division,Igual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.design);
        Result = findViewById(R.id.resultado);
    }




    public void calcular(View view) {
        segundonumero = Integer.parseInt(Result.getText().toString());
        if (segundonumero !=0.0 && primernumero != 0 && operacion != null) {
            switch (operacion) {
                case "+":
                    resultado= primernumero + segundonumero;
                    Result.setText(String.valueOf(resultado));
                    break;
                case "-":
                    resultado= primernumero - segundonumero;
                    Result.setText(String.valueOf(resultado));
                    break;
                case "*":
                    resultado= primernumero * segundonumero;
                    Result.setText(String.valueOf(resultado));
                    break;
                case "/":
                    resultado= primernumero / segundonumero;
                    break;
            }
            Result.setText(String.valueOf(resultado));
            primernumero = 0; // Limpiar para nueva operación
            operacion = null;
        }
    }
    public void numeroClick(View view) {
        Button boton = (Button) view;
        String textoActual= Result.getText().toString();
        String Nuevotexto = boton.getText().toString();
        Result.setText(textoActual + Nuevotexto);
    }

    public void suma(View view) {
        Button boton = (Button) view;
        primernumero = Integer.parseInt(Result.getText().toString());
        Result.setText("");
        operacion = boton.getText().toString();
    }

    public void resta(View view) {
        Button boton = (Button) view;
        primernumero = Integer.parseInt(Result.getText().toString());
        Result.setText("");
        operacion = boton.getText().toString();
    }

    public void multiplicacion(View view) {
        Button boton = (Button) view;
        primernumero = Integer.parseInt(Result.getText().toString());
        Result.setText("");
        operacion = boton.getText().toString();
    }

    public void division(View view) {
        Button boton = (Button) view;
        primernumero = Integer.parseInt(Result.getText().toString());
        Result.setText("");
        operacion = boton.getText().toString();
    }

    public void Clear(View view) {
        Button boton = (Button) view;
        Result.setText("");
        primernumero = 0;
        segundonumero = 0;
        operacion = null;
    }

}
