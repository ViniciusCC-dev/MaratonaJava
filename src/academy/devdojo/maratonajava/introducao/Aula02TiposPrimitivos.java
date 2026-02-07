package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    static void main() {
        // int,double,floar,char,short,long,boolean,byte
        int idade = (int)1000000000000000000L;//da pra forçar um valor (casting)
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = -128;
        short idadeShort = 20;
        boolean verdadeiro = true;
        boolean falso = false;
        char caracter = 65;
        String nome = "Vinicius";
        System.out.println("A idade é "+idade+" anos");
        System.out.println(falso);
        System.out.println(caracter);
        System.out.println("Ola meu nome é "+nome);
    }
}
