/**
 *
 * @author Crispim Paiano dos Santos
 */
public class Pessoa {
    
    // atributos significa caracteristica
    public String nome, sobrenome, cpf;
    public byte idade;
    public float peso,altura;
    public char sexo;
    
    @Override
    
    public String toString(){
        return "Nome: "+nome
               +"\nIdade: "+idade
               +"\nSobrenome: "+sobrenome
               +"\nPeso: "+peso
               +"\nAltura: "+altura
               +"\nSexo: "+sexo
               +"\nCPF: "+cpf;
    }
    
}
