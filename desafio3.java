// Desafios TQI - Java
// 3 / 5 - Distância Entre Dois Pontos

import java.util.*;

public class Problema {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Formatter formato = new Formatter(Locale.ENGLISH);

        String valoresX;
        String valoresY;

        String primeiraLinha = entrada.nextLine(); // pega valores da 1º linha no caso -2.5 0.4
        String segundaLinha = entrada.nextLine();// pega valores da 2º linha no caso 12.1 7.3

        String[] eixosPrimeiraLinha = primeiraLinha.split(" ");
        double x1 = Double.parseDouble(eixosPrimeiraLinha[0]);
        double y1 = Double.parseDouble(eixosPrimeiraLinha[1]);

        String[] eixosSegundaLinha = segundaLinha.split(" "); 
        double x2 = Double.parseDouble(eixosSegundaLinha[0]); 
        double y2 = Double.parseDouble(eixosSegundaLinha[1]);
        
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        formato.format("%.4f", distancia);

        System.out.println(formato);

        entrada.close();
    }
}