
public class Main {

    public static void main(String[] args) {

        String cadena1 = "Hola Mundo";
        String cadena2 = "HOla muNdO";
        String cadena3 = "Go";
        String cadena4 = "a215632511@uson.mx";
        String cadena5 = "ISI2021-1.txt";


        ExprReg er = new ExprReg();

        System.out.print("1: ");
        er.fraseExacta(cadena1);
        System.out.print("2: ");
        er.fraseMayusMin(cadena2);
        System.out.print("3: ");
        er.buscarPalabra(cadena3);
        System.out.print("4: ");
        er.validarCorreo(cadena4);
        System.out.print("5: ");
        er.validarNombreArchivo(cadena5);

        System.out.println("==================================");

        // Con argumentos
         //Los que tienen espacios no los pude poner desde Modify Run Configuration

        System.out.print("3: ");
        er.buscarPalabra(args[0]);
        System.out.print("4: ");
        er.validarCorreo(args[1]);
        System.out.print("5: ");
        er.validarNombreArchivo(args[2]);

    }

}
