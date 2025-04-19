package pp_fp09.programming;

import colaboradores.Pessoa;

import java.util.Arrays;
import java.util.Objects;

public class Management {
    private static final int MAX_PESSOAS = 10;
    private static final int INCREMENTAR_ARRAY = 2;

    private Pessoa[] pessoas = new Pessoa[MAX_PESSOAS];
    private int numPessoas;

    public void expandColaboradores() {
        
        Pessoa[] novoArray = new Pessoa[MAX_PESSOAS * INCREMENTAR_ARRAY];

        for (int i = 0; i < numPessoas; i++) {
            novoArray[i] = pessoas[i];
        }

        pessoas = novoArray;

    }

    public int findColaborador(Pessoa pessoa) {

        for (int i = 0; i < numPessoas; i++) {
            
            if (pessoas[i] != null && pessoas[i].equals(pessoa)) {
                return i;
            }
        }

        return -1;
    }

    public boolean addColaborador(Pessoa pessoa) {

        if (findColaborador(pessoa) != -1) {
            return false;
        }
        if (numPessoas == pessoas.length) {
            expandColaboradores();
        }

        pessoas[numPessoas++] = pessoa;

        return true;
    }


    public boolean removeColaborador(Pessoa pessoa) {

        if (findColaborador(pessoa) == -1) {
            return false;
        }

        for (int i = findColaborador(pessoa); i < numPessoas - 1; i++) {
            pessoas[i] = pessoas[i + 1];
        }

        pessoas[--numPessoas] = null;

        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Management that = (Management) o;
        return numPessoas == that.numPessoas && Objects.deepEquals(pessoas, that.pessoas);
    }

    public void listarColaboradores() {

        for (int i = 0; i < numPessoas; i++) {

            if (pessoas[i] != null) {
                System.out.println(pessoas[i]);
            }
        }
    }

}
