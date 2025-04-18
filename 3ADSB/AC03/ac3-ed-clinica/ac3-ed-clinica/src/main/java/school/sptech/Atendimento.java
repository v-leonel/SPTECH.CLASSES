package school.sptech;

import school.sptech.estruturas.FilaObj;

//Classe completa (não é necessário alterar)
public class Atendimento {

    private FilaObj<Pet> filaPrioritaria;
    private FilaObj<Pet> filaNormal;

    public Atendimento() {
        this.filaPrioritaria = new FilaObj(10);
        this.filaNormal = new FilaObj(10);
    }

    public void triagem(Pet p) {
        if ("Envenenamento".equals(p.getMotivo()) || "Hemorragia".equals(p.getMotivo())) {
            filaPrioritaria.insert(p);
        } else {
            filaNormal.insert(p);
        }
    }

    public Pet[] atender(int qtdPacienteChamado) {
        if (filaPrioritaria.isEmpty() && filaNormal.isEmpty()) {
            throw new IllegalStateException("As filas estão vazias");
        }
        if (qtdPacienteChamado <= 0 || qtdPacienteChamado > (filaPrioritaria.getTamanho() + filaNormal.getTamanho())) {
            throw new IllegalArgumentException("Quantidade de pets é inválida");
        }

        Pet[] petsAtendidos = new Pet[qtdPacienteChamado];
        int count = 0;

        while (count < qtdPacienteChamado && !filaPrioritaria.isEmpty()) {
            petsAtendidos[count++] = filaPrioritaria.poll();
        }
        while (count < qtdPacienteChamado && !filaNormal.isEmpty()) {
            petsAtendidos[count++] = filaNormal.poll();
        }

        return petsAtendidos;
    }


    // Getters - Não remover
    public FilaObj<Pet> getFilaPrioritaria() {
        return filaPrioritaria;
    }

    public FilaObj<Pet> getFilaNormal() {
        return filaNormal;
    }

}
