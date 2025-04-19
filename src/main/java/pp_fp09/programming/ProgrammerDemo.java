package pp_fp09.programming;

import colaboradores.Administrativo;
import colaboradores.GestorProjeto;
import colaboradores.Programador;
import enums.Habilitaçoes;
import enums.TipoContrato;
import enums.TipoProgramador;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ProgrammerDemo {

    public static void main(String[] args) {

        LocalDate nascimento = LocalDate.of(2002, 03, 21);
        LocalDate nascimentoFim = LocalDate.of(2001, 02, 15);

        LocalDate dataContratoInicio = LocalDate.of(2020, 05, 21);
        LocalDate dataContratoFim = LocalDate.of(2024, 05, 21);

        // Administrativos
        Administrativo administrativo1 = new Administrativo("Tiago", nascimento, "Lousada", 267214090, 211555222,
                800.50, "JTP", TipoContrato.PARCIAL, Habilitaçoes.MESTRADO, dataContratoInicio, dataContratoFim);

        // Programadores
        Programador programador1 = new Programador("Tiago", nascimento, "Porto", 123123123, 231231231, 850, 12,
                "Paradigmas", TipoProgramador.JUNIOR);

        // Gestores Projeto
        GestorProjeto gestor1 = new GestorProjeto("José", nascimento, "Felgueiras", 123123123, 231231222, 950, 5,
                dataContratoInicio);

        // Management
        Management gestao = new Management();

        gestao.addColaborador(gestor1);
        gestao.addColaborador(administrativo1);
        gestao.addColaborador(programador1);

        gestao.listarColaboradores();

    }
}