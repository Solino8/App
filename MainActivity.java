package com.example.suacalculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Definir os botões da tela principal
    private Button btnIMC, btnPesoIdeal, btnAlturaIdeal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Definir a tela em modo tela cheia
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

        // Carregar a tela principal
        CarregarTelaPrincipal();
    }

    // Método para carregar a tela principal
    private void CarregarTelaPrincipal() {
        // Carregar o arquivo XML correspondente à tela principal
        setContentView(R.layout.activity_main);

        // Mapear os elementos de tela do XML
        btnIMC = findViewById(R.id.btnIMC);
        btnPesoIdeal = findViewById(R.id.btnPesoIdeal);
        btnAlturaIdeal = findViewById(R.id.btnAlturaIdeal);

        // Definir listeners para os botões
        btnIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CarregarCalculadoraIMC();
            }
        });

        btnPesoIdeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CarregarCalculadoraPesoIdeal();
            }
        });

        btnAlturaIdeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CarregarCalculadoraAlturaIdeal();
            }
        });
    }

    // Métodos de navegação para as outras telas
    private void CarregarCalculadoraIMC() {
        setContentView(R.layout.activity_calculadora_imc);
        // Aqui você também pode mapear e definir os listeners específicos para esta tela
    }

    private void CarregarCalculadoraPesoIdeal() {
        setContentView(R.layout.activity_calculadora_peso_ideal);
        // Aqui você também pode mapear e definir os listeners específicos para esta tela
    }

    private void CarregarCalculadoraAlturaIdeal() {
        setContentView(R.layout.activity_calculadora_altura_ideal);
        // Aqui você também pode mapear e definir os listeners específicos para esta tela
    }
}
