package devandroid.rafael.appgazeta.utils;

import android.util.Log;
import android.widget.EditText;

public class Util {

    public static double converteStringEmDouble(String str) {
        return Double.valueOf(str).doubleValue();
    }

    public static String devolveMensagemUsarEtanolOuGasolina(double valorGasolina, double valorEtanol) {
        Log.i("valorGasolina", String.valueOf(valorGasolina));
        Log.i("valorEtanol", String.valueOf(valorEtanol));
        Log.i("Valor Ideal", String.valueOf(valorGasolina * 0.70));
        Log.i("Resultado", String.valueOf(valorEtanol <= valorGasolina * 0.70));
        return valorEtanol <= valorGasolina * 0.70 ? "Use Etanol" : "Use Gasolina";
    }

}
