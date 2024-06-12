public class Whatsapp {
    public static void main(String[] args) {
        Contato contato01 = new Contato("Kikuti", "(11) 9898198");
        Contato contato02 = new Contato("Gustavão", "(11) 8981968");
        Contato contato03 = new Contato("Miniguiti", "(11) 98989876");

        Grupo grupo01 = new Grupo("Trabalho");
        Grupo grupo02 = new Grupo("Amigos");

        grupo01.adiciona(contato01);
        grupo01.adiciona(contato02);

        grupo02.adiciona(contato03);
        grupo02.adiciona(contato01);

        System.out.println(" ");
        System.out.println("Exibindo os grupos");
        System.out.println(" ");
        System.out.println(grupo01);
        System.out.println(grupo02);

        System.out.println(contato01);
    }
}
