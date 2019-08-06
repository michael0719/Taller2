package constantes;

public enum Strings {

    MENSAJE_MENU("MENU"),
    MENSAJE_MENU1("1.Calcular Indice de masa corporal"),
    MENSAJE_MENU2("2.Signo zodiacal"),
    MENSAJE_MENU3("3.Ingresar salarios"),
    MENSAJE_MENU4("4.Ingresar numeros a vector"),
    MENSAJE_MENU5("0.Salir"),
    MENSAJE_IMC_PESO("Ingrese peso en kilogramos (kg)"),
    MENSAJE_IMC_ALTURA("Ingrese altura en centimentros(cm)"),
    MENSAJE_OPCION_NO_VALIDA("Opcion no valida,ingrese un valor entre 0 y 4"),
    MENSAJE_PESO_BAJO("Bajo peso"),
    MENSAJE_PESO_NORMAL("Peso normal"),
    MENSAJE_PESO_SOBREPESO("Sobre peso"),
    MENSAJE_OBECIDAD1("Obecidad 1"),
    MENSAJE_OBECIDAD2("Obecidad 2"),
    MENSAJE_OBECIDAD3("Obecidad 3"),
    MENSAJE_OBECIDAD4("Obecidad 4"),
    MENSAJE_IMC(" IMC="),
    MENSAJE_DATOS_EMPLEADO("Ingrese cantidad de salarios a pagar"),
    MENSAJE_EMPLEADO("Ingrese salario"),
    MENSAJE_PROMEDIO("El promedio de salarios: "),
    MENSAJE_SALARIO_MAXIMO("El salario maximo pagado fue: "),
    MENSAJE_TOTAL_SALARIOS("El total de salarios pagados: "),
    MENSAJE_VECTOR_VALORES("Cantidad de numeros a ingresar"),
    MENSAJE_PEDIR_NUMERO("Ingrese un numero"),
    MENSAJE_PROMEDIO_POSITIVOS("El promedio del vector positivo fue:  "),
    MENSAJE_PROMEDIO_NEGATIVOS("El promedio del vector negativo fue:  "),
    MENSAJE_DIAS("Ingrese dia de nacimiento"),
    MENSAJE_MES("Ingrese mes de nacimiento \n" +
            "1.Enero\n"+
            "2.Febrero\n"+
            "3.Marzo\n"+
            "4.Abril\n"+
            "5.Mayo\n"+
            "6.Junio\n"+
            "7.Julio\n"+
            "8.Agosto\n"+
            "9.Septiembre\n"+
            "10.Octubre\n"+
            "11.Noviembre\n"+
            "12.Diciembre"),
    MENSAJE_ERROR_DIAS("Los dias es un valor entre 1 y 30"),
    MENSAJE_ERROR_MES("Los meses es un valor entre 1 y 12"),
    MENSAJE_ARIES("Su signo es aries"),
    MENSAJE_TAURO("Su signo es tauro"),
    MENSAJE_GEMINIS("Su signo es geminis"),
    MENSAJE_CANCER("Su signo es cancer"),
    MENSAJE_LEO("Su signo es leo"),
    MENSAJE_VIRGO("Su signo es virgo"),
    MENSAJE_LIBRA("Su signo es libra"),
    MENSAJE_ESCORPIO("Su signo es escorpio"),
    MENSAJE_SAGITARIO("Su signo es sagitario"),
    MENSAJE_CAPRICORNIO("Su signo es capricornio"),
    MENSAJE_ACUARIO("Su signo es acuario"),
    MENSAJE_PISCIS("Su signo es piscis"),;

    private String mensaje;

    Strings(String s) {
        this.mensaje=s;
    }

    public String getMensaje() {
        return mensaje;
    }
}
