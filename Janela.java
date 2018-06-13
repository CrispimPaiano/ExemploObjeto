/**
 * @author Alunos
 */
public class Janela {
    
    private float comprimento, largura, altura;
    private double preco;
    private String marca;
    private char possuiInsulfilm;
    
    public void setComprimento (float comprimento){
        this.comprimento = comprimento;
    }
    
    public float getComprimento(){
        return comprimento;
    }
    
    public void setLargura (float largura){
        this.largura = largura;
    }
    
    public float getLargura(){
        return largura;
    }
    
    public void setAltura (float altura){
        this.altura = altura;
    }
    
    public float getAltura(){
        return altura;
    }
    
    public void setPreco (double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void setMarca (String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setPossuiInsulfilm(char possuiInsulfim){
        this.possuiInsulfilm = possuiInsulfim;
    }
    
    public char getPossuiInsulfilm(){
        return possuiInsulfilm;
    }
    
}
