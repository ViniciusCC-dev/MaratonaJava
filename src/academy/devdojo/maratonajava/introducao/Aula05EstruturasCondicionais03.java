package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    static void main() {
        double salario = 1000;
        String mesgDoar = "Eu vou doar 500 pra caridade";
        String msgNaoDoar = "Ainda nao tenho condicoes";
        //(condicao) ? verdadeiro : falso
        String resultado = (salario > 5000) ? mesgDoar : msgNaoDoar;

        System.out.println(resultado);
    }
}
