package main.java.data;

import model.Animal;

import java.util.List;

public interface DataProviderI {
    public void save(String commandString);
    public List<Animal> load();
}
