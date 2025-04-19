package colaboradores;

import java.time.LocalDate;

public class GestorProjeto extends Pessoa {

    private static int nextId = 0;

    private static final double SALARIO_INICIAL = 1.15;
    private static final double SALARIO_INCREMENTO_ANO = 1.015;
    private static final double SALARIO_INCREMENTO_PROJETO = 1.01;

    private int numProjetos;
    private LocalDate contractDate;

    public GestorProjeto(String name, LocalDate birthDate, String morada, int citizenCard, int vatNumber,
            double baseSalary, int numProjetos, LocalDate contractDate) {
        super(name, birthDate, morada, citizenCard, vatNumber, baseSalary);

        this.nextId++;
        this.numProjetos = numProjetos;
        this.contractDate = contractDate;
    }

    public int calcularAnos(LocalDate contractDate) {
       
        LocalDate numAnos = LocalDate.now().minusYears(contractDate.getYear());
        
        // return java.time.Period.between(contractDate, LocalDate.now()).getYears();
        return numAnos.getYear();
    }

    public int getData() {
        return calcularAnos(this.contractDate);
    }

    public int getNumProjetos() {
        return numProjetos;
    }

    @Override
    protected double getSalary() {
        double baseSalary = super.getBaseSalary() * SALARIO_INICIAL;

        int numeroAnos = calcularAnos(this.contractDate);

        for (int i = 0; i < numeroAnos; i++) {
            baseSalary *= SALARIO_INCREMENTO_ANO;
        }

        for (int i = 0; i < numProjetos; i++) {
            baseSalary *= SALARIO_INCREMENTO_PROJETO;
        }

        return baseSalary;
    }

    @Override
    public String toString() {
        return "GestorProjeto{" +
                "ID: " + nextId +
                "\tnumProjetos= " + numProjetos +
                "\tNumero Anos: " + this.getData() +
                "\tSalario: " + getSalary() +
                " euros" +
                '}';
    }
}
