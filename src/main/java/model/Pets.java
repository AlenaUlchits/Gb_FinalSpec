package model;

import java.time.LocalDate;

public abstract  class Pets extends Animal {
    public Pets(int id, String name, LocalDate birthDate, String commands) {
        super(id, name, birthDate, commands);
    }

    public Pets() {
    }
}
