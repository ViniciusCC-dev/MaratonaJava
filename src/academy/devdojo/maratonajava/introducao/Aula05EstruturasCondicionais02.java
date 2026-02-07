package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    static void main() {
        int idade = 10;
        String categoria;
        if(idade < 15){
            categoria = "Categoria infantil";
        }else if(idade < 18){
            categoria = "Categoria Juvenil";
        }else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
