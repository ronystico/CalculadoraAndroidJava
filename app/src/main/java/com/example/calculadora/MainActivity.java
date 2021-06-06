package com.example.calculadora;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

// importar la clase de los cálculos
import com.example.calculadora.Calcular;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Crear el Dialog que pide el usuario
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        View view = getLayoutInflater().inflate(R.layout.dialog_usuario, null);
        final EditText text = (EditText) view.findViewById(R.id.editTextTextPersonName);

        builder.setTitle("Ingrese su nombre");
        builder.setView(view);
        builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.append(" " + text.getText().toString());
            }
        });
        builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                System.exit(0);
            }
        });
        builder.setCancelable(false);
        builder.show();
        // Fin del dialog


        // Declarando objetos lol
        TextView textview3 = (TextView) findViewById(R.id.textView3);
        TextView textview2 = (TextView) findViewById(R.id.textView2);
        Button buttonlimpiartodo = findViewById(R.id.buttonlimpiartodo);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button buttonpunto = findViewById(R.id.buttonpunto);
        Button button0 = findViewById(R.id.button0);
        Button buttonsuma = findViewById(R.id.buttonsuma);
        Button buttonresta = findViewById(R.id.buttonresta);
        Button buttonmultiplicacion = findViewById(R.id.buttonmultiplicacion);
        Button buttondivision = findViewById(R.id.buttondivision);
        Button buttonigual = findViewById(R.id.buttonigual);

        // Declarando variables
        final float[] numero1 = {0};
        final float[] numero2 = {0};
        final String[] tipo = {""};

        // Escucha de buttonborrar
        final Button buttonborrar = findViewById(R.id.buttonborrar);
        buttonborrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pantalla = textview3.getText().toString();
                if (!TextUtils.isEmpty(pantalla) && pantalla.length() != 1) {
                    pantalla = pantalla.substring(0, pantalla.length() - 1);
                    textview3.setText(pantalla);
                } else if (pantalla.length() == 1) {
                    textview3.setText("0");
                }
            }
        });

        // Escucha de buttonlimpiartodo
        buttonlimpiartodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1[0] = 0;
                numero2[0] = 0;
                tipo[0] = "";
                textview3.setText("0");
                textview2.setText("");
            }
        });

        // Escucha de button7
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textview3.getText().toString().equals("0")) {
                    textview3.setText("7");
                }
                else {
                    textview3.append("7");
                }
            }
        });

        // Escucha de button8
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textview3.getText().toString().equals("0")) {
                    textview3.setText("8");
                }
                else {
                    textview3.append("8");
                }
            }
        });

        // Escucha de button9
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textview3.getText().toString().equals("0")) {
                    textview3.setText("9");
                }
                else {
                    textview3.append("9");
                }
            }
        });

        // Escucha de button4
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textview3.getText().toString().equals("0")) {
                    textview3.setText("4");
                }
                else {
                    textview3.append("4");
                }
            }
        });

        // Escucha de button5
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textview3.getText().toString().equals("0")) {
                    textview3.setText("5");
                }
                else {
                    textview3.append("5");
                }
            }
        });

        // Escucha de button6
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textview3.getText().toString().equals("0")) {
                    textview3.setText("6");
                }
                else {
                    textview3.append("6");
                }
            }
        });

        // Escucha de button1
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textview3.getText().toString().equals("0")) {
                    textview3.setText("1");
                }
                else {
                    textview3.append("1");
                }
            }
        });

        // Escucha de button2
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textview3.getText().toString().equals("0")) {
                    textview3.setText("2");
                }
                else {
                    textview3.append("2");
                }
            }
        });

        // Escucha de button3
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textview3.getText().toString().equals("0")) {
                    textview3.setText("3");
                }
                else {
                    textview3.append("3");
                }
            }
        });

        // Escucha de buttonpunto
        buttonpunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textview3.getText().toString().equals("0") ||
                        !textview3.getText().toString().contains(".")) {
                    textview3.append(".");
                } else {
                    // do you expect setText? hahaha
                }
            }
        });

        // Escucha de button0
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textview3.getText().toString().equals("0")) {
                    textview3.setText("0");
                } else {
                    textview3.append("0");
                }
            }
        });

        // Escucha de buttonsuma
        buttonsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tipo[0] = "+";
                if (numero1[0] == 0 || textview2.getText().toString().equals("")) {
                    numero1[0] = Float.parseFloat(textview3.getText().toString());
                    textview2.append(String.valueOf(numero1[0]) + " " + tipo[0]);
                    textview3.setText("0");
                };
            }
        });

        // Escucha de buttonresta
        buttonresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tipo[0] = "-";
                if (numero1[0] == 0 || textview2.getText().toString().equals("")) {
                    numero1[0] = Float.parseFloat(textview3.getText().toString());
                    textview2.append(String.valueOf(numero1[0]) + " " + tipo[0]);
                    textview3.setText("0");
                };
            }
        });

        // Escucha de buttonmultiplicacion
        buttonmultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tipo[0] = "*";
                if (numero1[0] == 0 || textview2.getText().toString().equals("")) {
                    numero1[0] = Float.parseFloat(textview3.getText().toString());
                    textview2.append(String.valueOf(numero1[0]) + " " + tipo[0]);
                    textview3.setText("0");
                };
            }
        });

        // Escucha de buttondivision
        buttondivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tipo[0] = "/";
                if (numero1[0] == 0 || textview2.getText().toString().equals("")) {
                    numero1[0] = Float.parseFloat(textview3.getText().toString());
                    textview2.append(String.valueOf(numero1[0]) + " " + tipo[0]);
                    textview3.setText("0");
                };
            }
        });

        // Escucha de buttonigual
        buttonigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero2[0] = Float.parseFloat(textview3.getText().toString());
                textview2.setText("");
                textview3.setText(String.valueOf(Calcular.hacerCalculo(numero1[0],numero2[0],tipo[0])));
            }
        });
    }
}