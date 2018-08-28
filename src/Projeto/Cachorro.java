package Projeto;

public class Cachorro {
    
    private String cor;
    private String raca;
    public static int qntCachorro  = 0; //atributo da classe, compartilhado com todos os objetos

    public Cachorro(String cor, String raca) {
        this.cor = cor;
        this.raca = raca;
    }
    
    

    public Cachorro(String cor, String raca, String tamanho) {
        this.cor = cor;
        this.raca = raca;
        qntCachorro++; //quando é estatico não usa this
    }
    
    public Cachorro venderCachorro(){
        
        qntCachorro--;
        return null;
    }

    
}


//metodo estatico só consegue chamar metodo estatico //usado quando não é preciso saber os dados da classe 

//para contar objetos deve ser um atributo da classe e não do objeto

// fazer uma classe cachorro, petshopping, main 
// vender cachorro, comprar cachorro na clase pet 
// instanciar varios cachorros na main 
