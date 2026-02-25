package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    //dado o valor de um carro, descubra de quantas vezes ele pode ser dividido
    //a condição que o valor da parcela tem quer ser maior ou igual 1000
    static void main() {
        double valorTotal = 50000;
        //parcela vai ser de 1500
        for (int parcela = 1; parcela <= valorTotal ; parcela ++) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 3125) {
                break;
            }
             System.out.println("Parcela: " + parcela+ " R$"+valorParcela);
        }
    }
}
