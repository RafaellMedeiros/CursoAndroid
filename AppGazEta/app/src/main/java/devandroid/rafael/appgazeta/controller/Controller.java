package devandroid.rafael.appgazeta.controller;

import android.content.SharedPreferences;

import devandroid.rafael.appgazeta.model.Calculo;
import devandroid.rafael.appgazeta.utils.Util;
import devandroid.rafael.appgazeta.view.MainActivity;

public class Controller {
    private static final String NOME_PREFERENCE = "pref_gasEta";
    SharedPreferences preferences;
    SharedPreferences.Editor listaGasolinaEtanol;

    public Controller(MainActivity mainActivity) {
        preferences = mainActivity.getSharedPreferences(NOME_PREFERENCE, 0);
        listaGasolinaEtanol = preferences.edit();
    }

    public void salvar(String gasolina, String etanol) {
        listaGasolinaEtanol.putString("gasolina", gasolina);
        listaGasolinaEtanol.putString("etanol", etanol);
        listaGasolinaEtanol.apply();
    }

    public String alterarTextoComBaseNosValoresGasolinaEEtanol(String gasolina, String etanol) {
        return Util.devolveMensagemUsarEtanolOuGasolina(
                Util.converteStringEmDouble(gasolina),
                Util.converteStringEmDouble(etanol));
    }

    public Calculo buscaCalculoSalvo() {
        String gasolina = preferences.getString("gasolina", "");
        String etanol = preferences.getString("etanol", "");
        if (gasolina.isEmpty() || etanol.isEmpty()) return null;
        return new Calculo(
                Util.converteStringEmDouble(gasolina),
                Util.converteStringEmDouble(etanol));
    }
}
