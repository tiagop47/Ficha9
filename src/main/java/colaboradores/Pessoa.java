package colaboradores;

import java.time.LocalDate;

public abstract class Pessoa {
    private String name;
    private LocalDate birthDate;
    private String morada;
    private int citizenCard;
    private int vatNumber;
    private double baseSalary;

    public Pessoa(String name, LocalDate birthDate, String morada, int citizenCard, int vatNumber, double baseSalary) {

        this.name = name;
        this.birthDate = birthDate;
        this.morada = morada;
        this.citizenCard = citizenCard;
        this.vatNumber = vatNumber;
        this.baseSalary = baseSalary;
    }

    protected abstract double getSalary();

    public double getBaseSalary() {
        return this.baseSalary;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", morada='" + morada + '\'' +
                ", citizenCard=" + citizenCard +
                ", vatNumber=" + vatNumber +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
