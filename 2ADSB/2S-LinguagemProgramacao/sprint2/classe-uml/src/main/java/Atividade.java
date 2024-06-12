import javax.lang.model.util.SimpleElementVisitor14;

public class Atividade {
    private String nomeAtividade;
    private String responsavel;
    private Integer diasEstimados;
    private Integer diasUsados;

    public Atividade(String nomeAtividade, String responsavel, Integer diasEstimados, Integer diasUsados) {
        this.nomeAtividade = nomeAtividade;
        this.responsavel = responsavel;
        this.diasEstimados = diasEstimados;
        this.diasUsados = diasUsados;
    }

    public Atividade(String nomeAtividade, String responsavel, Integer diasEstimados) {
        this.nomeAtividade = nomeAtividade;
        this.responsavel = responsavel;
        this.diasEstimados = diasEstimados;
    }

    public void terminarAtividade(Integer diasUsados) {
        this.diasUsados = diasUsados;
    }

    public void exibirRelatorio() {
        if (diasEstimados < diasUsados) {
            System.out.println(
                    """
                            Você estimou %d dias, mas a tarefa foi feita em %d dias (%d dias a mais do que o estimado).
                            Melhore a estimativa
                            """.formatted(diasEstimados, diasUsados, (diasUsados - diasEstimados)));
        } else if (diasEstimados > diasUsados) {
            System.out.println(
                    """
                            Você estimou %d dias, mas a tarefa foi feita em %d dias (%d dias a menos do que o estimado).
                            Melhore a estimativa
                            """.formatted(diasEstimados, diasUsados, (diasUsados - diasEstimados)));
        } else {
            System.out.println(
                    """
                            Você estimou %d dias, mas a tarefa foi feita em %d dias (atendendo a estimativa com precisão).
                            Melhore a estimativa
                            """.formatted(diasEstimados, diasUsados));
        }
    }

    @Override
    public String toString() {
        return """
               Nome atividade: %s
               Responsavel: %s
               Dias estimados: %d
               Dias usados: %s 
               """.formatted(nomeAtividade,responsavel,diasEstimados,diasUsados);
    }

    public String getNomeAtividade() {
        return nomeAtividade;
    }

    public void setNomeAtividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Integer getDiasEstimados() {
        return diasEstimados;
    }

    public void setDiasEstimados(Integer diasEstimados) {
        this.diasEstimados = diasEstimados;
    }

    public Integer getDiasUsados() {
        return diasUsados;
    }

    public void setDiasUsados(Integer diasUsados) {
        this.diasUsados = diasUsados;
    }
}
