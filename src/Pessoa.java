
public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;

    @Override
    public String toString() {
        return "Nome=" + nome + "- Idade=" + idade + "- Sexo=" + sexo + "\n";
    }

    public Pessoa(){
        
    }
    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public int compareTo(Object outro) {  
        Pessoa al = (Pessoa)outro;
        if(getNome().compareToIgnoreCase(al.getNome()) < 0)return -1;
        else if (getNome().compareToIgnoreCase(al.getNome()) == 0)return 0;
        else return 1;
    }
    
}
