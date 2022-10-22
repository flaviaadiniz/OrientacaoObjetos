package aula03;

public class Clients {

    public String petName;
    public String petKind;
    public String ownerName;


    public void print() {
        System.out.println(
                "CLIENTE" +
                        "\nNome do Pet: " + petName +
                        "\nEspécie: " + petKind +
                        "\nDono: " + ownerName +
                        "\n"
        );
    }

}
