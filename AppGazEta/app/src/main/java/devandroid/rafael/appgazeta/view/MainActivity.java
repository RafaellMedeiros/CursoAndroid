package devandroid.rafael.appgazeta.view;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import devandroid.rafael.appgazeta.R;
import devandroid.rafael.appgazeta.controller.Controller;
import devandroid.rafael.appgazeta.model.Calculo;

public class MainActivity extends AppCompatActivity {

    Controller controller;

    Calculo calculo;

    EditText editGasolina;
    EditText editEtanol;
    TextView txtResultado;

    Button btn_calcular;
    Button btn_limpar;
    Button btn_salvar;
    Button btn_finalizar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controller = new Controller(MainActivity.this);

        editGasolina = findViewById(R.id.editGasolina);
        editEtanol = findViewById(R.id.editEtanol);
        txtResultado = findViewById(R.id.txt_resultado);

        btn_calcular = findViewById(R.id.btn_calcular);
        btn_limpar = findViewById(R.id.btn_limpar);
        btn_salvar = findViewById(R.id.btn_salvar);
        btn_finalizar = findViewById(R.id.btn_finalizar);

        calculo = controller.buscaCalculoSalvo();
        if (calculo != null) {
            editGasolina.setText(String.valueOf(calculo.getGasolina()));
            editEtanol.setText(String.valueOf(calculo.getEtanol()));
        }

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable gasolina = editGasolina.getText();
                Editable etanol = editGasolina.getText();
                boolean isDadosOk = true;


                if (TextUtils.isEmpty(gasolina)) {
                    editGasolina.setError("Atributo Obrigatorio");
                    editGasolina.requestFocus();
                    isDadosOk = false;
                }


                txtResultado.setText(controller.
                        alterarTextoComBaseNosValoresGasolinaEEtanol(
                                editGasolina.getText().toString(),
                                editEtanol.getText().toString()));
            }
        });

        btn_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editEtanol.setText("");
                editGasolina.setText("");
            }
        });

        btn_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Dado Salvo com Sucesso", Toast.LENGTH_LONG)
                        .show();
                controller.salvar(editGasolina.getText().toString(), editEtanol.getText().toString());
            }
        });

        btn_finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Volta Sempre", Toast.LENGTH_LONG)
                        .show();
                finish();
            }
        });
    }
}