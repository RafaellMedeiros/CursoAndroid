package devandroid.rafael.appgazeta.model;

public class Pessoa {

    private String primeiroNome;
    private String sobreNome;
    private String cursoDesejado;
    private String telefone;

    public Pessoa() {

    }

    public Pessoa(String primeiroNome, String sobrenome, String curso, String telefone) {
        this.primeiroNome = primeiroNome;
        this.sobreNome = sobrenome;
        this.cursoDesejado = curso;
        this.telefone = telefone;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "primeiroNome='" + primeiroNome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", cursoDesejado='" + cursoDesejado + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
