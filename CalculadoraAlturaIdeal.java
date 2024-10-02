package com.example.calculadoras;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalculadoraAlturaIdeal extends AppCompatActivity {

    EditText edtPeso;
    RadioButton rbMasculino, rbFeminino;
    Button btnCalcularAlturaIdeal, btnVoltar;
    TextView txtResultadoAlturaIdeal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CarregarCalculadoraAlturaIdeal();
    }

    private void CarregarCalculadoraAlturaIdeal() {
        // Carrega o arquivo XML correspondente
        setContentView(R.layout.activity_calculadora_altura_ideal);

        // Mapeia os elementos da tela
        edtPeso = findViewById(R.id.edtPeso);
        rbMasculino = findViewById(R.id.rbMasculino);
        rbFeminino = findViewById(R.id.rbFeminino);
        btnCalcularAlturaIdeal = findViewById(R.id.btnCalcularAlturaIdeal);
        btnVoltar = findViewById(R.id.btnVoltar);
        txtResultadoAlturaIdeal = findViewById(R.id.txtResultadoAlturaIdeal);

        // Define o listener do botão Calcular
        btnCalcularAlturaIdeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalcularAlturaIdeal();
            }
        });

        // Define o listener do botão Voltar
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Fecha a tela atual e volta para a anterior
            }
        });
    }

    private void CalcularAlturaIdeal() {
        // Obtem o valor do peso informado
        float peso = Float.parseFloat(edtPeso.getText().toString());

        // Definir a constante IMC Ideal dependendo do sexo
        float IMC_IDEAL;
        if (rbMasculino.isChecked()) {
            IMC_IDEAL = 21.7f; // IMC Ideal Masculino
        } else {
            IMC_IDEAL = 22.7f; // IMC Ideal Feminino
        }

        // Calcular a Altura Ideal
        float alturaIdeal = (float) Math.sqrt(peso / IMC_IDEAL);

        // Exibir o resultado
        txtResultadoAlturaIdeal.setText(String.format("Sua altura ideal é: %.2f metros", alturaIdeal));
    }
}
