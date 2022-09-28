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
        Button btnMult= binding.multiplicarBtn;
        Button btnDiv = binding.dividirBtn;
        TextView resultadoText = binding.resultadoEdit;
       // TextView resultadoText = findViewById(R.id.resultadoEdit);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                String num1=editNum1.getText().toString();
                String num2=editNum2.getText().toString();

                  if (!num1.isEmpty()||!num2.isEmpty()) {
                    int num1Integer = Integer.parseInt(num1);
                    int num2Integer = Integer.parseInt(num2);

                    int resultado = num1Integer + num2Integer;

                      //String resultadoTexto = getString(resultado);
                      //resultadoText.setText(getString(resultado));
                      binding.resultadoEdit.setText(resultado);
                  }else {

                      Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                  }
                */
                if(!editNum1.getText().toString().isEmpty() && !editNum2.getText().toString().isEmpty()){

                int num1 = Integer.parseInt(editNum1.getText().toString());
                int num2 = Integer.parseInt(editNum2.getText().toString());

                    int resultado = num1 + num2;
                    resultadoText.setText(Integer.toString(resultado));

                }else{
                    Toast.makeText(MainActivity.this, "No puedes dejar un campo vacio", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}