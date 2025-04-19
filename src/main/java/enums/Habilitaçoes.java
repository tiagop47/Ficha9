package enums;

public enum Habilitaçoes {
    LICENCIATURA,
    MESTRADO,
    DOUTORAMENTO;

    public String habilitaçoesToString(Habilitaçoes habilitaçoes) {
        switch(habilitaçoes) {
            case LICENCIATURA:
                return "Habilitações nível Licenciatura";
            case MESTRADO:
                return "Habilitações tipo Mestrado";
            case DOUTORAMENTO:
                return "Habilitações tipo Doutoramento";
            default:
                return "tipo licenciatura";
        }
    }
}
