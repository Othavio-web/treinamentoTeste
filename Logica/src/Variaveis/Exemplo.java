package Variaveis;

import java.math.BigDecimal;
import java.time.*;

public class Exemplo {
    public static void main(String[] args) {
        short pequeno = 5000;// nome, tipo, conteudo 2 bytes
        System.out.println(pequeno);
        int medio = 500000000;//4 bytes
        System.out.println(medio);
        long longo = 500000000;// 8 bytes
        System.out.println(longo);
        
        //grupoo dos reais
        float small = (float)5.55;
        System.out.println(small);
        double mediun = 9.8999;
        System.out.println(mediun);
        BigDecimal maximus = new BigDecimal("9.99999999999");
        System.out.println(maximus);
        
        //tipos logicos
        
        boolean logico = true;
        logico = false;
        System.out.println(logico);
        
        //tipos textos
        
        char letra = 'h';
        System.out.println(letra);
        String palavra = "teste";
        System.out.println(palavra);
        
        // grupos datas
        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora);
        LocalDate data = LocalDate.now();
        System.out.println(data);
        ZonedDateTime zona = ZonedDateTime.now();
        System.out.println(zona);
        OffsetDateTime horaZona = OffsetDateTime.now();
        System.out.println(horaZona);
    }
}
