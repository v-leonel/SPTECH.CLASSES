public class Main {
    public static void main(String[] args) {
        Pet pet01 = new Pet();
        pet01.setNome("Bob");
        pet01.setQtdIdasAoPetShop(0);
        pet01.setTotalGasto(0.0);

        Pet pet02 = new Pet("Lisa", 0, 0.0);
        PetShop petShop01 = new PetShop("ShopPet", 0.0);

        System.out.println(pet01.getNome());
        System.out.println(pet01.getTotalGasto());
        System.out.println(pet01.getQtdIdasAoPetShop());
        System.out.println("""
                Nome pet: %s
                Total gasto: %.2f
                Quantidade idas %d
                """.formatted(pet01.getNome(), pet01.getTotalGasto(), pet01.getQtdIdasAoPetShop()));

        petShop01.darBanho(pet01);
        petShop01.darBanho(pet01);
        petShop01.darBanho(pet01, 0.5);

        System.out.println(pet02.getNome());
        System.out.println(pet02.getTotalGasto());
        System.out.println(pet02.getQtdIdasAoPetShop());
        System.out.println("""
                Nome pet: %s
                Total gasto: %.2f
                Quantidade idas: %d
                """.formatted(pet02.getNome(), pet02.getTotalGasto(), pet02.getQtdIdasAoPetShop()));
    }
}
