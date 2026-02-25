package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais06 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Dado os valores de 1 a 7, imprima se é dia util ou final de semana
        //Considerando 1 como domingo
        System.out.println("Digite o valor do dia da semana (ex: 1 - Domingo)");
        byte val= sc.nextByte();
        String sis;
            if ( val > 1 && val < 7){
             sis = "é dia util";
            }else {
             sis ="é final de semana";
            }
            switch (val) {
                case 1:
                    System.out.println("Domingo " + sis);
                    break;
                case 2:
                    System.out.println("Segunda "+sis);
                    break;
                case 3:
                    System.out.println("Terça "+sis);
                    break;
                case 4:
                    System.out.println("Quarta "+sis);
                    break;
                case 5:
                    System.out.println("Quinta " +sis);
                    break;
                case 6:
                    System.out.println("Sexta " + sis);
                    break;
                case 7:
                    System.out.println("Sábado " + sis);
                    break;
            }
    }
}
