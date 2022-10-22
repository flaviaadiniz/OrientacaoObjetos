package aula03;
// Abstraia animais para o sistema de petshop
// Os seguintes atributos devem ser considerados
//---- nome da especie do animal
//---- nome do pet
//---- nome do dono
// 2 animais utilizando o construtor vazio

// Abstraia agendamento para o sistema de petshop
// Os seguintes atributos devem ser considerados
//---- animal
//---- data do agendamento
//---- hora do agendamento
// Crie agendamento para os animais criados utilizando um construtor

import java.time.LocalDate;
import java.time.LocalTime;

public class PetShop {

    public static void main(String[] args) {

        Clients brooklyn = new Clients();
        brooklyn.petName = "Brooklyn";
        brooklyn.petKind = "Cachorro - Boxer";
        brooklyn.ownerName = "Flávia Diniz";
        brooklyn.print();

        Clients cacau = new Clients();
        cacau.petName = "Cacau";
        cacau.petKind = "Cachorro - Labrador";
        cacau.ownerName = "Diego Serafini";
        cacau.print();

        Schedule client1 = new Schedule("Brooklyn", LocalDate.now(), LocalTime.now());
        client1.print();


    }

}
