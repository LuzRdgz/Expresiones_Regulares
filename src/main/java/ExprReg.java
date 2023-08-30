import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExprReg {

    public void fraseExacta(String cadena){

        Pattern pt = Pattern.compile("[hH][oO][lL][aA]\s[mM][uU][nN][dD][oO]");
        Matcher mt = pt.matcher(cadena);

        if (mt.matches()){
            System.out.println("EXPRESION VALIDA :)");
        }else{
            System.out.println("EXPRESION NO VALIDA :(");
        }

    }


}
