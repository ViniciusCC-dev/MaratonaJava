package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    //imprima os primeiros 25 numeros de um dado valor por ex 50
    static void main() {
        int valMax = 50;
        for (int i = 0; i <= valMax ; i++) {
            if(i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
