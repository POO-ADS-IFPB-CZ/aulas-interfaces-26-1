import model.AreaCalculavel;
import model.Circulo;
import model.Quadrado;

void main() {

    AreaCalculavel.teste2();

    Quadrado quadrado = new Quadrado(2);
    quadrado.teste();
    Circulo circulo = new Circulo(2);
    circulo.teste();

    teste(new Circulo(3));
    teste(new Quadrado(2));

}

void teste(Serializable s){

}
