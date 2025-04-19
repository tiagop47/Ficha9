package colaboradores;

import enums.TipoProgramador;

import java.time.LocalDate;

public class Programador extends Pessoa {

    private static int nextId = 0;

    private static final double SALARIO_INICIAL = 1.05;
    private static final double SALARIO_JUNIOR = 1.05;
    private static final double SALARIO_SENIOR = 1.15;

    private int numAnos;
    private String projectName;
    private TipoProgramador tipoProgramador;

    public Programador(String name, LocalDate birthDate, String morada, int citizenCard, int vatNumber, double baseSalary, int numAnos, String projectName, TipoProgramador tipoProgramador) {
        super(name, birthDate, morada, citizenCard, vatNumber, baseSalary);

        this.nextId = nextId++;
        this.numAnos = numAnos;
        this.projectName = projectName;
        this.tipoProgramador = tipoProgramador;
    }

    @Override
    protected double getSalary() {
        double baseSalary = super.getBaseSalary() * SALARIO_INICIAL;

        if (this.tipoProgramador == TipoProgramador.JUNIOR) {
            baseSalary *= SALARIO_JUNIOR;
        } else {
            baseSalary *= SALARIO_SENIOR;
        }

        for (int i = 0; i < numAnos; i++) {
            baseSalary *= 1.015;
        }

        return baseSalary;
    }

    public static int getNextId() {
        return nextId;
    }

    public int getNumAnos() {
        return numAnos;
    }

    public String getProjectName() {
        return projectName;
    }

    public TipoProgramador getTipoProgramador() {
        return tipoProgramador;
    }

    @Override
    public String toString() {
        return super.toString()+"Programador{" +
                "numAnos= " + numAnos +
                ", projectName='" + projectName + '\'' +
                ", tipoProgramador=" + tipoProgramador +
                "\tSalario: "+ getSalary() +
                ", euros"+
                '}';
    }
}

