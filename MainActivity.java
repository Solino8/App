package br.uniceub.cc.pdm.fitcalcapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnCalculadoraIMC;
    private Button btnCalculadoraPesoIdeal;
    private Button btnCalculadoraAlturaIdeal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CarregarTelaPrincipal();
    }

    private void CarregarTelaPrincipal() {
        setContentView(R.layout.tela_principal);

        btnCalculadoraIMC = findViewById(R.id.buttonCalculadoraIMC);
        btnCalculadoraPesoIdeal = findViewById(R.id.buttonCalculadoraPesoIdeal);
        btnCalculadoraAlturaIdeal = findViewById(R.id.buttonCalculadoraAlturaIdeal);

        btnCalculadoraIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarCalculadoraIMC();
            }
        });

        btnCalculadoraPesoIdeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarCalculadoraPesoIdeal();
            }
        });

        btnCalculadoraAlturaIdeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarCalculadoraAlturaIdeal();
            }
        });
    }

    private void CarregarCalculadoraIMC() {
        setContentView(R.layout.calculadora_imc);
    }

    private void CarregarCalculadoraPesoIdeal() {
        setContentView(R.layout.calculadora_peso_ideal);
    }

    private void CarregarCalculadoraAlturaIdeal() {
        setContentView(R.layout.calculadora_altura_ideal);
    }
}
