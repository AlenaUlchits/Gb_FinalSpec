package model;

import java.time.LocalDate;

public abstract class Animal implements Comparable<Animal>{
    private int id;
    private String name;
    private LocalDate birthDate;
    private String commands;

    public Animal(int id, String name, LocalDate birthDate, String commands) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.commands = commands;
    }

    public Animal() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    @Override
    public String toString() {
        return String.format("%-4d%-12s%-8s%-12s%-15s", getId(),
                getName(),
                getClass().getSimpleName(),
                getBirthDate().toString(),
                getCommands());

    }

    @Override
    public int compareTo(Animal animal) {
        return this.getBirthDate().compareTo(animal.getBirthDate());
    }
}
