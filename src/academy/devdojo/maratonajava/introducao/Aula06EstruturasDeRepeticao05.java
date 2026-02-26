package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    //dado o valor de um carro, descubra de quantas vezes ele pode ser dividido
    //a condição que o valor da parcela tem quer ser maior ou igual 1000
    static void main() {
        double valorTotal = 50000;
        for (int parcela = (int)valorTotal; parcela >= 1 ; parcela--) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 3125) {
                continue;
            }
            System.out.println("Parcela: " + parcela+ " R$"+valorParcela);
        }

        }
    }
