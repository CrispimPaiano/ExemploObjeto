
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class Filmes {
    
    private String titulo,tituloOriginal, genero, diretor;
    private short anoLancamento, anoProducao;
    private double valorFarutamento, valorOrcamento;
    private int espectadores;
    private String classificacao;
    private double mediaPreco;
    private LocalDate dataLancamentoBrasil;
    private String idioma;
    
    public void setTitulo (String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTituloOriginal (String tituloOriginal){
        this.tituloOriginal = tituloOriginal;
    }
    
    public String getTituloOriginal (){
        return tituloOriginal;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public void setDiretor (String diretor){
        this.diretor = diretor;
    }
    
    public String getDiretor(){
        return diretor;
    }
    
    public void setAnoLancamento (short anoLancamento){
        this.anoLancamento = anoLancamento;
    }
    
    public short getAnoLancamento(){
        return anoLancamento;
    }
    
    public void setAnoProducao (short anoProducao){
        this.anoProducao = anoProducao;
    } 
    
    public short getAnoProducao(){
        return anoProducao;
    }
    
    public void setValorFaturamento (double valorFaturamento){
        this.valorFarutamento = valorFaturamento;
    }
    
    public double getValorFaturamento(){
        return valorFarutamento;
    }
    
    public void setValorOrcamento (double valorOrcamento){
        this.valorOrcamento = valorOrcamento;
    }
    
    public double getValorOrcamento (){
        return valorOrcamento;
    }
    
    public void setEspectadores(int espectadores){
        this.espectadores = espectadores;
    }
    
    public int getEspectadores(){
        return espectadores;
    }
    
    public void setClassificacao(String classificacao){
        this.classificacao = classificacao;
    }
    
    public String getClassificacao(){
        return classificacao;
    }
    
    public void setMediaPreco(double mediaPreco){
        this.mediaPreco = mediaPreco;
    }
    
    public double getMedia(){
        return mediaPreco;
    }
    
    public void setDataLancamento(LocalDate dataLacamentoBrasil){
        this.dataLancamentoBrasil = dataLacamentoBrasil;
    }
    
    public LocalDate getDataLancaento(){
        return dataLancamentoBrasil;
    }
    
    public void setIdioma (String idioma){
        this.idioma = idioma;
    }

    public String getIdioma (){
        return idioma;
    }
    
}
