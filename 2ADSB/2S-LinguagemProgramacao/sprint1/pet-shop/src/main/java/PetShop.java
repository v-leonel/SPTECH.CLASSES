public class PetShop {
    private String nome;
    private Double faturamentoTotal;
    private Double valorBanho;

    public PetShop(String nome, Double faturamentoTotal){
        this.nome = nome;
        this.faturamentoTotal = faturamentoTotal;
        valorBanho = 40.0;
    }

    public void darBanho(Pet animal){
        faturamentoTotal += valorBanho;
        darBanho(animal, 0.0);
    }

    public void darBanho(Pet animal, Double desconto){
        Double valorComDesconto = (valorBanho - (valorBanho * desconto));
        faturamentoTotal += valorBanho;
        animal.setQtdIdasAoPetShop(animal.getQtdIdasAoPetShop() + 1);
        animal.setTotalGasto(animal.getTotalGasto() + valorComDesconto);
    }
    public void darBanho(){}
}
