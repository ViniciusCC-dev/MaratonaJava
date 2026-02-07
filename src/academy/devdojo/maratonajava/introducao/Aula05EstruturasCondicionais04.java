package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    static void main() {
        double salarioAnual = 1000;
        double taxa;
        if (salarioAnual <= 34712) {
            taxa = 9.70;
        } else if (salarioAnual <= 68507) {
            taxa = 37.35;
        } else{
            taxa = 49.50;
        }
        double imposto = (salarioAnual * taxa) / 100;
        double ajuste = salarioAnual - imposto;
        System.out.println("A taxa de imposto para seu salario é: "+ imposto);
        System.out.println("Seu salario ajustado para seu imposto é de: " +ajuste);
    }

}
