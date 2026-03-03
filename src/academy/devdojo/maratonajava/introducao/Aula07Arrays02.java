package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    static void main() {
        //byte, short, int, long, double, float é 0
        //char '\0000' imprime ' '
        //boolean é false
        //String é null

        String [] nomes = new String [4];

        nomes[0] = "Goku";
        nomes[1] = "ichigo";
        nomes[2] = "luffy";
//        nomes[3] = "Naruto";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        nomes = new String[5];
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
