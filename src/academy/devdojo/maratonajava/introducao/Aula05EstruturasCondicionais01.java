package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    static void main() {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 20;
        /* ! */

        if (isAutorizadoComprarBebida != false){
            System.out.println("Autorizado a comprar bebida alcoolica");
        }else
            System.out.println("Nao autorizado a comprar bebida alcoolica");

        if (!isAutorizadoComprarBebida){
            System.out.println("Nao autorizado a comprar bebida alcoolica");
        }
        boolean c = false;
        if (c == true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
        System.out.println("Fora do IF");



    }
}
