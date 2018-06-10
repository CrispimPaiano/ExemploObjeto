
import javax.swing.JOptionPane;

/**
 * @author Crispim Paiano dos Santos
 */
public class Principal02 {

    public static void main(String[] args) {

        //Macaco número#1
        Macaco macacoPrego = new Macaco();
        macacoPrego.nomeCientifico = "Sapajus nigritus";
        macacoPrego.idade = 40;
        macacoPrego.corPelo = "Escuro";
        macacoPrego.apelido = "Xitinha";
        macacoPrego.altura = 0.44f;
        macacoPrego.peso = 4.8f;
        macacoPrego.reino = "Animalia";
        macacoPrego.filo = "Chordata";
        macacoPrego.classe = "Mammalia";
        macacoPrego.ordem = "Primates";
        macacoPrego.familia = "Cebidae";
        macacoPrego.genero = "Sapajus";
        macacoPrego.especie = "Simia apella";

        //Macaco número#2
        Macaco macacoNarigudo = new Macaco();
        macacoNarigudo.nomeCientifico = "Nasalis larvatus";
        macacoNarigudo.idade = 30;
        macacoNarigudo.corPelo = "Laranja/Marrom";
        macacoNarigudo.apelido = "Transplante de orgao errada";
        macacoNarigudo.altura = 1.4f;
        macacoNarigudo.peso = 20.0f;
        macacoNarigudo.reino = "Animalia";
        macacoNarigudo.filo = "Chordata";
        macacoNarigudo.classe = "Mammalia";
        macacoNarigudo.ordem = "Primates";
        macacoNarigudo.familia = "Cercopithecidae";
        macacoNarigudo.genero = "Nasalis";
        macacoNarigudo.especie = "N. larvatus";

        //Macaco número#3
        Macaco mandril = new Macaco();
        mandril.nomeCientifico = "Mandrillus sphinx";
        mandril.idade = 20;
        mandril.corPelo = "Escuro";
        mandril.apelido = "Blindão";
        mandril.altura = 0.80f;
        mandril.peso = 37.0f;
        mandril.reino = "Animalia";
        mandril.filo = "Chordata";
        mandril.classe = "Mammalia";
        mandril.ordem = "Primates";
        mandril.familia = "Cercopithecidae";
        mandril.genero = "Mandrillus";
        mandril.especie = "M. sphinx";

        //Macaco número#4
        Macaco macacoUM = new Macaco();
        macacoUM.nomeCientifico = JOptionPane.showInputDialog("Nome Cientifico");
        macacoUM.idade = Byte.parseByte(JOptionPane.showInputDialog("Idade"));
        macacoUM.corPelo = JOptionPane.showInputDialog("Cor do pelo");
        macacoUM.apelido = JOptionPane.showInputDialog("apelido");
        macacoUM.altura = Float.parseFloat(JOptionPane.showInputDialog("altura"));
        macacoUM.peso = Float.parseFloat(JOptionPane.showInputDialog("peso"));
        macacoUM.reino = JOptionPane.showInputDialog("reino");
        macacoUM.filo = JOptionPane.showInputDialog("filo");
        macacoUM.classe = JOptionPane.showInputDialog("classe");
        macacoUM.ordem = JOptionPane.showInputDialog("ordem");
        macacoUM.familia = JOptionPane.showInputDialog("familia");
        macacoUM.genero = JOptionPane.showInputDialog("genero");
        macacoUM.especie = JOptionPane.showInputDialog("especie");

        //Macaco número#5
        Macaco macacoDois = new Macaco();
        macacoDois.nomeCientifico = JOptionPane.showInputDialog("Nome Cientifico");
        macacoDois.idade = Byte.parseByte(JOptionPane.showInputDialog("Idade"));
        macacoDois.corPelo = JOptionPane.showInputDialog("Cor do pelo");
        macacoDois.apelido = JOptionPane.showInputDialog("apelido");
        macacoDois.altura = Float.parseFloat(JOptionPane.showInputDialog("altura"));
        macacoDois.peso = Float.parseFloat(JOptionPane.showInputDialog("peso"));
        macacoDois.reino = JOptionPane.showInputDialog("reino");
        macacoDois.filo = JOptionPane.showInputDialog("filo");
        macacoDois.classe = JOptionPane.showInputDialog("classe");
        macacoDois.ordem = JOptionPane.showInputDialog("ordem");
        macacoDois.familia = JOptionPane.showInputDialog("familia");
        macacoDois.genero = JOptionPane.showInputDialog("genero");
        macacoDois.especie = JOptionPane.showInputDialog("especie");

    }

}
