package devandroid.rafael.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.rafael.applistacurso.R;
import devandroid.rafael.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();

        pessoa.setPrimeiroNome("Rafael");
        pessoa.setSobreNome("Medeiros");
        pessoa.setCursoDesejado("ADM");
        pessoa.setTelefone("83 9999 - 9999");

        int parada = 0;

    }
}