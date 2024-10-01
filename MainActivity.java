package com.example.calculadoras;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declaração dos botões
    private Button btnIMC, btnPesoIdeal, btnAlturaIdeal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Configuração para tela cheia
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);  // Carrega a tela principal

        CarregarTelaPrincipal();
    }

    // Método para carregar a tela principal
    private void CarregarTelaPrincipal() {
        setContentView(R.layout.activity_main);

        // Mapeia os botões da tela principal
        btnIMC = findViewById(R.id.btnCalculadoraIMC);
        btnPesoIdeal = findViewById(R.id.btnCalculadoraPesoIdeal);
        btnAlturaIdeal = findViewById(R.id.btnCalculadoraAlturaIdeal);

        // Definição dos listeners dos botões
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

    // Método para carregar a calculadora de IMC
    private void CarregarCalculadoraIMC() {
        setContentView(R.layout.activity_calculadora_imc);

        // Mapeia os elementos da tela de IMC
        Button btnVoltar = findViewById(R.id.btnVoltar);

        // Define os listeners dos botões
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CarregarTelaPrincipal();
            }
        });

        // Código adicional para cálculo de IMC pode ser inserido aqui
    }

    // Método para carregar a calculadora de Peso Ideal
    private void CarregarCalculadoraPesoIdeal() {
        setContentView(R.layout.activity_calculadora_peso_ideal);

        // Mapeia os elementos da tela de Peso Ideal
        Button btnVoltar = findViewById(R.id.btnVoltar);

        // Define os listeners dos botões
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CarregarTelaPrincipal();
            }
        });

        // Código adicional para cálculo de Peso Ideal pode ser inserido aqui
    }

    // Método para carregar a calculadora de Altura Ideal
    private void CarregarCalculadoraAlturaIdeal() {
        setContentView(R.layout.activity_calculadora_altura_ideal);

        // Mapeia os elementos da tela de Altura Ideal
        Button btnVoltar = findViewById(R.id.btnVoltar);

        // Define os listeners dos botões
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CarregarTelaPrincipal();
            }
        });

        // Código adicional para cálculo de Altura Ideal pode ser inserido aqui
    }
}
