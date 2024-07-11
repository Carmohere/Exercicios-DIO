package List.OperacoesBasicas;

public class Tarefa {


    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = String.valueOf(descricao);
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
