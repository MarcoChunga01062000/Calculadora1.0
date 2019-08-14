package com.example.learning2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText t2;
    private EditText t3;
    private TextView tx1;
    private RadioButton rd1, rd2, rd3, rd4, rd5, rd6, rd7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t2 = (EditText)findViewById(R.id.txtnota2);
        t3 = (EditText)findViewById(R.id.txtnota3);
        tx1 = (TextView)findViewById(R.id.txtresultado);
        rd1 = (RadioButton)findViewById(R.id.rbsumar);
        rd2 = (RadioButton)findViewById(R.id.rbrestar);
        rd3 = (RadioButton)findViewById(R.id.rbmultiplicar);
        rd4 = (RadioButton)findViewById(R.id.rbdividir);
        rd5 = (RadioButton)findViewById(R.id.rbcuadrado);
        rd6 = (RadioButton)findViewById(R.id.rbraiz);
        rd7 = (RadioButton)findViewById(R.id.rbfactorial);
    }
    public void Calcular(View view){
        String t2string = t2.getText().toString();
        String t3String = t3.getText().toString();
        int t2int = Integer.parseInt(t2string);
        int t3int = Integer.parseInt(t3String);

        if (rd1.isChecked() == true){
            int suma = t2int + t3int;
            String resultado = String.valueOf(suma);
            tx1.setText(resultado);
        }
        if (rd2.isChecked() == true){
            int resta = t2int - t3int;
            String resultado = String.valueOf(resta);
            tx1.setText(resultado);
        }
        if (rd3.isChecked() == true){
            int multiplicacion = t2int * t3int;
            String resultado = String.valueOf(multiplicacion);
            tx1.setText(resultado);
        }
        if (rd4.isChecked() == true){
            if (t3int!=0){
                int division = t2int / t3int;
                String resultado = String.valueOf(division);
                tx1.setText(resultado);
            } else {
                Toast.makeText(this,"No se puede dividir entre 0", Toast.LENGTH_LONG).show();
            }
        }
        if (rd5.isChecked() == true){
            int cuadrado = t2int * t2int;
            String resultado = String.valueOf(cuadrado);
            tx1.setText(resultado);
        }
        if (rd6.isChecked() == true){
            double raiz = Math.sqrt(Double.parseDouble(t2string));
            String resultado = String.valueOf(raiz);
            tx1.setText(resultado);
        }
        if (rd7.isChecked() == true){
            double factorial = 1;
            while ( t2int!=0) {
                factorial=factorial*t2int;
                t2int--;
            }
            String resultado = String.valueOf(factorial);
            tx1.setText(resultado);
        }
    }
}
