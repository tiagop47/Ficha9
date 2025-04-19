package enums;

public enum TipoProgramador {
    JUNIOR,
    SENIOR;

    public String TipoProgramadorToString(TipoProgramador tipoProgramador) {
        switch (tipoProgramador) {
            case JUNIOR:
                return "Tipo Programador Junior";
            case SENIOR:
                return "Tipo Programador Senior";
            default:
                return "Tipo Junior";
        }
    }
}
