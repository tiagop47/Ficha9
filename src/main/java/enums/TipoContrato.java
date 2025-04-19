package enums;

public enum TipoContrato {
    SEM_TERMO,
    PARCIAL,
    INTEGRAL;

    public String tipoContratoToString(TipoContrato tipoContrato) {
        switch (tipoContrato) {
            case PARCIAL:
                return "Contrato tipo Parcial";
            case INTEGRAL:
                return "Contrato tipo Integral";
            default:
                return "Contrato tipo Integral";
        }
    }
}

