package com.example.aulaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText valor1,valor2;
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultado=(TextView)findViewById(R.id.resultado);
        valor1=(EditText)findViewById(R.id.primeiroValor);
        valor2=(EditText)findViewById(R.id.segundoValor);
        Button calcular =(Button)findViewById(R.id.calcular);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcular(view);
            }
        });
        final Button limpar = (Button)findViewById(R.id.limpar);
        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                limpar(view);
            }
        });
    }
    protected void calcular(View view){
        int val1 = Integer.parseInt((valor1.getText().toString()));
        int val2 = Integer.parseInt((valor2.getText().toString()));
        resultado.setText(String.valueOf(val1*val2));
    }
    public void limpar(View view){
        valor1.setText("");
        valor2.setText("");
        resultado.setText("");
    }
}
