package devandroid.rafael.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import devandroid.rafael.applistacurso.R;

public class SplashActivity extends AppCompatActivity {

    private static final int TEMPO_DE_ESPERA = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        tempoDeEspera();
    }

    private void tempoDeEspera() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent telaPrincipal = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(telaPrincipal);
                finish();
            }
        }, TEMPO_DE_ESPERA);
    }
}