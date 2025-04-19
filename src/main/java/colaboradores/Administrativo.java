package colaboradores;

import java.time.LocalDate;

import enums.Habilitaçoes;
import enums.TipoContrato;

public class Administrativo extends Pessoa {

    private static final double SALARIO_PARCIAL = 1.1;
    private static final double SALARIO_INTEGRAL = 1.05;
    private static final double SALARIO_LICENCIATURA = 1.1;
    private static final double SALARIO_MESTRADO = 1.2;
    private static final double SALARIO_DOUTORAMENTO = 1.3;

    private String sigla;
    private TipoContrato tipocontrato;
    private Habilitaçoes habilitaçoes;
    private LocalDate beginContract;
        private LocalDate endContract;

    public Administrativo(String name, LocalDate birthDate, String morada, int citizenCard, int vatNumber,
            double baseSalary, String sigla, TipoContrato tipocontrato, Habilitaçoes habilitaçoes,
            LocalDate beginContract, LocalDate endContract) {
        super(name, birthDate, morada, citizenCard, vatNumber, baseSalary);

        this.sigla = sigla;
        this.tipocontrato = tipocontrato;
        this.habilitaçoes = habilitaçoes;
        this.beginContract = beginContract;
        this.endContract = endContract;
    }

    public Administrativo(String name, LocalDate birthDate, String morada, int citizenCard, int vatNumber,
            double baseSalary, String sigla, TipoContrato tipocontrato, Habilitaçoes habilitaçoes,
            LocalDate beginContract) {
        super(name, birthDate, morada, citizenCard, vatNumber, baseSalary);

        this.sigla = sigla;
        this.tipocontrato = TipoContrato.SEM_TERMO;
        this.habilitaçoes = habilitaçoes;
        this.beginContract = beginContract;
        this.endContract = null;
    }

    @Override
    protected double getSalary() {
        double baseSalary = super.getBaseSalary();

        if (this.tipocontrato == TipoContrato.INTEGRAL) {
            baseSalary *= SALARIO_INTEGRAL;
        } else {
            baseSalary *= SALARIO_PARCIAL;
        }

        if (this.habilitaçoes == Habilitaçoes.LICENCIATURA) {
            baseSalary *= SALARIO_LICENCIATURA;

        } else if (this.habilitaçoes == Habilitaçoes.MESTRADO) {
            baseSalary *= SALARIO_MESTRADO;

        } else if (this.habilitaçoes == Habilitaçoes.DOUTORAMENTO) {
            baseSalary *= SALARIO_DOUTORAMENTO;
        }

        return baseSalary * SALARIO_LICENCIATURA;
    }

    public String getSigla() {
        return sigla;
    }

    public TipoContrato getTipocontrato() {
        return tipocontrato;
    }

    public Habilitaçoes getHabilitaçoes() {
        return habilitaçoes;
    }

    public LocalDate getBeginContract() {
        return beginContract;
    }

    public LocalDate getEndContract() {
        return endContract;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "sigla='" + getSigla() + '\'' +
                ", Tipo de Contrato=" + getTipocontrato() +
                ", habilitaçoes= " + getHabilitaçoes() +
                ", beginContract= " + getBeginContract() +
                ", endContract=" + getEndContract() +
                ", Salario Base: " + getSalary() +
                "euros" +
                '}';
    }
}
