package datasjava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DatasJava {

    
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        
        //Data/Hora, Ano, Mês, Dia atual
        System.out.println("Data/Hora atual: " + c.getTime());
        System.out.println("Ano: " + c.get(Calendar.YEAR));
        System.out.println("Mês: " + (c.get(Calendar.MONTH)+1));
        System.out.println("Dia: " + c.get(Calendar.DAY_OF_MONTH));
        
        //Hora do Dia
        int hora = c.get(Calendar.HOUR_OF_DAY);
        if (hora >= 6 && hora < 12) {
            System.out.println("Bom dia!");        
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }
        
        //Formatar Data de String para Date e vice-versa
        Date dataNascimento = null;
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        formatoData.setLenient(false);
        System.out.println("Informe a data de nascimento no formato dd/MM/yyyy: ");
        Scanner s = new Scanner(System.in);
        String teclado = s.next();
        try {
            dataNascimento = formatoData.parse(teclado);
            System.out.println("Data Informada sem formatação: " + dataNascimento);
            System.out.println("Data Informada com formatação: " + formatoData.format(dataNascimento));
        } catch (Exception e) {
            System.out.println("Data Inválida!");
        }
        
        //Calcular Idade
        Calendar hoje = Calendar.getInstance();
        hoje.getTime();
        
        Calendar dataNasc = Calendar.getInstance();
        dataNasc.setTime(dataNascimento);
        
        int idade = hoje.get(Calendar.YEAR) - dataNasc.get(Calendar.YEAR);
        
        if (hoje.get(Calendar.MONTH) < dataNasc.get(Calendar.MONTH)) {
            idade--;
        }
        System.out.println("Idade: " + idade);

    }
  
    
}
