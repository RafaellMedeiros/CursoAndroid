package devandroid.rafael.appgazeta.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.rafael.appgazeta.model.Curso;

public class CursoController {
    private List<Curso> cursos = new ArrayList<Curso>();

    public CursoController() {
        cursos.add(new Curso("Curso 1"));
        cursos.add(new Curso("Curso 2"));
        cursos.add(new Curso("Curso 3"));
        cursos.add(new Curso("Curso 4"));
        cursos.add(new Curso("Curso 5"));
        cursos.add(new Curso("Curso 6"));
        cursos.add(new Curso("Curso 7"));
        cursos.add(new Curso("Curso 8"));
    }

    public List<String> dadosCursos() {
        List<String> dados = new ArrayList<String>();
        for (int i = 0; i < cursos.size(); i++) dados.add(cursos.get(i).getNomeCurso());
        return dados;
    }

}
