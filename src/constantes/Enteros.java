package constantes;

public enum Enteros {
    CERO(0),
    UNO(1),
    DOS(2),
    TRES(3),
    CUATRO(4),
    CINCO(5),
    SEIS(6),
    SIETE(7),
    OCHO(8),
    NUEVE(9),
    DIEZ(10),
    ONCE(11),
    DOCE(12),
    VEINTE(20),
    VEINTIUNO(21),
    VEINTIDOS(22),
    VEINTITRES(23),
    VEINTICUATRO(24),
    TREINTAYUNO(31),
    DIECINUEVE(19);

    private int valor;

    Enteros(int n) {
        this.valor=n;
    }

    public int getValor() {
        return valor;
    }
}
