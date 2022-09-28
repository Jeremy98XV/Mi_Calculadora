package org.iesch.mi_calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.iesch.mi_calculadora.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        EditText editNum1 = binding.num1Edit;
        EditText editNum2 = binding.num2Edit;
        Button btnSum = binding.sumarBtn;
        Button btnRest = binding.restarBtn;
        Button btnMult = binding.multiplicarBtn;
        Button btnDiv = binding.dividirBtn;
        TextView resultadoText = binding.resultadoEdit;


        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!editNum1.getText().toString().isEmpty() && !editNum2.getText().toString().isEmpty()) {

                    int num1 = Integer.parseInt(editNum1.getText().toString());
                    int num2 = Integer.parseInt(editNum2.getText().toString());

                    int resultado = num1 + num2;
                    resultadoText.setText(Integer.toString(resultado));

                } else {
                    Toast.makeText(MainActivity.this, "No puedes dejar un campo vacio", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!editNum1.getText().toString().isEmpty() && !editNum2.getText().toString().isEmpty()) {

                    int num1 = Integer.parseInt(editNum1.getText().toString());
                    int num2 = Integer.parseInt(editNum2.getText().toString());

                    int resultado = num1 - num2;
                    resultadoText.setText(Integer.toString(resultado));

                } else {
                    Toast.makeText(MainActivity.this, "No puedes dejar un campo vacio", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!editNum1.getText().toString().isEmpty() && !editNum2.getText().toString().isEmpty()) {

                    int num1 = Integer.parseInt(editNum1.getText().toString());
                    int num2 = Integer.parseInt(editNum2.getText().toString());

                    int resultado = num1 * num2;
                    resultadoText.setText(Integer.toString(resultado));

                } else {
                    Toast.makeText(MainActivity.this, "No puedes dejar un campo vacio", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!editNum1.getText().toString().isEmpty() && !editNum2.getText().toString().isEmpty()) {

                    double num1 = Double.parseDouble(editNum1.getText().toString());
                    double num2 = Double.parseDouble(editNum2.getText().toString());

                    double resultado = num1 / num2;
                    resultadoText.setText(Double.toString(resultado));

                } else {
                    Toast.makeText(MainActivity.this, "No puedes dejar un campo vacio", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}