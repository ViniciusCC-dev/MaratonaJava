package academy.devdojo.maratonajava.introducao;

public class Aula04Operates {
    static void main() {
        // + - / *     aritmeticos
        int numero1 = 10;
        int numero2 = 20;
        double resultado = numero1 / (double)numero2;
        System.out.println(resultado);

        // %  resto da divisao
        int resto = 20 % 7;
        System.out.println(resto);

        // <  >  <=    >=    ==   !=    relacionais
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezDiferenteVinte "+ isDezDiferenteVinte);

        // &&(AND - E)   || (OU - or)   ! (Nao - not)   logicos
        // && and e
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaisTrinta = idade >= 30 && salario > 4612;
        boolean isDentroDaLeiMenosTrinta = idade < 30 && salario > 3381;
        System.out.println("isDentroDaLeiMaisTrinta " +isDentroDaLeiMaisTrinta);
        System.out.println("isDentroDaLeiMenosTrinta " + isDentroDaLeiMenosTrinta);
        // || ou or
        double valTotCorr = 200;
        double valTotContPoup = 10000;
        float valPS5 = 5000f;
        boolean isPlaysStation5Compravel = valTotCorr > valTotContPoup || valTotContPoup > valPS5;
        System.out.println("isPlaysStation5Compravel " +isPlaysStation5Compravel);


        // =  +=  -=   *=  /=   %=    atribuição
        double bonus = 1800; //1800
        //bonus = bonus + 1000;
        bonus += 1000;//2800
        bonus -= 1000;//1800
        bonus *= 2;//3600
        bonus /= 2;//1800
        bonus %= 2;//0
        System.out.println(bonus);

        //++  --  unarios
        int contador = 0;
        contador = contador + 1; // contador = 1
        contador ++; //contador = 2
        contador --; // contador = 1
        System.out.println(contador);
        int contador2 = 0;
        System.out.println(contador2++);//imprime 0 e depois soma
        System.out.println(contador2); //imprime 1 por ja ter somado
        System.out.println(++contador2); // imprime 2 por ter pedido a soma do antigo valor do contador
    }
}
