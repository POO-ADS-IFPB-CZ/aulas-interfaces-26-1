import model.Aluno;
import model.Autenticavel;
import model.Coordenador;
import model.Professor;

void main() {
    entrar(new Aluno("123","João", "joao@gmail.com",
            "123"));
    entrar(new Coordenador("312","Maria", "maria@gmail.com",
            "321"));
}

void entrar(Autenticavel autenticavel){
    if(autenticavel.autenticar("123","123")){
        System.out.println("Bem vindo");
        return;
    }
    System.out.println("Falha");
}