package aula03;

import java.time.LocalDate;
import java.time.LocalTime;

public class Schedule {

    public String petName;
    public LocalDate date = LocalDate.now();
    public LocalTime time = LocalTime.now();

    public Schedule(String petName, LocalDate date, LocalTime time) {
        this.petName = petName;
        this.date = date;
        this.time = time;
    }

    public void print() {
        System.out.println(
                "AGENDAMENTO" +
                        "\nNome do Pet: " + petName +
                        "\nData da consulta: " + date +
                        "\nHorário da consulta: " + time +
                        "\n"
        );
    }


}
