public class Estudantes {

    private String nome;
    private String telefone;
    private String endereco;
    private String responsavel;


    public Estudantes(String nome, String telefone, String endereco, String responsavel) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.responsavel = responsavel;

    }


    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getResponsavel() {
        return responsavel;
    }
}




