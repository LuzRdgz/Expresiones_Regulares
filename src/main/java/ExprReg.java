import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExprReg {

    public void fraseExacta(String cadena1){

        Pattern pt = Pattern.compile("Hola Mundo");
        Matcher mt = pt.matcher(cadena1);

        if (mt.matches()){
            System.out.println("EXPRESION VALIDA :)");
        }else{
            System.out.println("EXPRESION NO VALIDA :(");
        }

    }
    public void fraseMayusMin(String cadena2){

        Pattern pt = Pattern.compile("[hH][oO][lL][aA]\s[mM][uU][nN][dD][oO]");
        Matcher mt = pt.matcher(cadena2);

        if (mt.matches()){
            System.out.println("EXPRESION VALIDA :)");
        }else{
            System.out.println("EXPRESION NO VALIDA :(");
        }

    }

    public void buscarPalabra(String cadena3){

        Pattern pt = Pattern.compile("Java|Python|Go|Pascal|Perl");
        Matcher mt = pt.matcher(cadena3);

        if (mt.matches()){
            System.out.println("EXPRESION VALIDA :)");
        }else{
            System.out.println("EXPRESION NO VALIDA :(");
        }

    }
    public void validarCorreo(String cadena4){

        Pattern pt = Pattern.compile(".*@unison[.]mx|.*@uson[.]mx");
        Matcher mt = pt.matcher(cadena4);

        if (mt.matches()){
            System.out.println("EXPRESION VALIDA :)");
        }else{
            System.out.println("EXPRESION NO VALIDA :(");
        }

    }

    public void validarNombreArchivo(String cadena5){

        Pattern pt = Pattern.compile("^ISI[0-9]{4}-[12][.]");
        Matcher mt = pt.matcher(cadena5);

        if (mt.matches()){
            System.out.println("EXPRESION VALIDA :)");
        }else{
            System.out.println("EXPRESION NO VALIDA :(");
        }

    }




}
