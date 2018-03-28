package programa1;

public class Pessoa {
    
    public String nome;
    public int idade;
    
    public void fazAniversario(){
        idade +=1;        
    }
    
    public void imprimir(){
        System.out.println("---------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: "+ idade);
        System.out.println("---------------");
    }
    
}
