// Desafios TQI - Java
// 3 / 5 - Distância Entre Dois Pontos

//  Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, conforme a fórmula: raiz de (x2-x1)^2+(y2-y1)^2

//  Entrada: O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

//  Saída: Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.

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