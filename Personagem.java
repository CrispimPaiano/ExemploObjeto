
import java.util.ArrayList;

/**
 * @author Alunos
 */
public class Personagem {
    
    private String nome, cla, aldeia;
    private long nivelChakra;
    
    //permitir guardar a informação
    public void setNome(String nome){
        if (nome.equals("")) {
            throw new IllegalArgumentException("Nome não pode ser vazio!!!");
        }
        if (nome.trim().length()<3) {
            throw new IllegalArgumentException("Nome tem que conter no mínimo 3 caracteres");
        }
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
}
