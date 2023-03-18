package devandroid.rafael.appgazeta.controller;

import android.content.SharedPreferences;

import devandroid.rafael.appgazeta.model.Pessoa;
import devandroid.rafael.appgazeta.view.MainActivity;

public class PessoaController {

    public static final String TAG = PessoaController.class.getSimpleName();
    SharedPreferences preferences;
    SharedPreferences.Editor listaVip;

    public static final String NOME_PREFERENCE = "pref_pessoas";

    public PessoaController(MainActivity mainActivity) {
        preferences = mainActivity.getSharedPreferences(NOME_PREFERENCE, 0);
        listaVip = preferences.edit();
    }

    public void salvar(Pessoa pessoa) {
        listaVip.putString("primeiroNome", pessoa.getPrimeiroNome());
        listaVip.putString("sobrenome", pessoa.getSobreNome());
        listaVip.putString("curso", pessoa.getCursoDesejado());
        listaVip.putString("telefone", pessoa.getTelefone());
        listaVip.apply();
    }

    public void limpar() {
        listaVip.clear().apply();
    }

    public Pessoa buscar() {
        return new Pessoa(preferences.getString("primeiroNome", ""),
                preferences.getString("sobrenome", ""),
                preferences.getString("curso", ""),
                preferences.getString("telefone", ""));
    }
}
