import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luan Ramalho
 */
public class Data_Hora_Local
{
 
    public static void main(String[] args) throws ParseException 
    {
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();
         
        DateFormat f = DateFormat.getDateInstance(DateFormat.FULL); //Data COmpleta
        System.out.println("Data brasileira: "+f.format(data));
 
        f = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("Data sem o dia descrito: "+f.format(data));
         
        f = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("Data resumida 1: "+f.format(data));
         
        f = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("Data resumida 2: "+f.format(data));
        
        System.out.println("");
             
        DateFormat hora = DateFormat.getTimeInstance();
        System.out.println("Hora formatada: "+hora.format(data));
            
        //Formata Data e Hora
        DateFormat dtHora = DateFormat.getDateTimeInstance();
        System.out.println(dtHora.format(data));
    }
}
