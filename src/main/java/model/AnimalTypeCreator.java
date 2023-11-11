package model;


public class AnimalTypeCreator {
    public static model.Animal FindOutTypeOfAnimal (model.AnimalType animalType) {
        return switch (animalType) {
            case Cat -> new model.Cat();
            case Dog -> new model.Dog();
            case Hamster -> new model.Hamster();
            case Camel -> new model.Camel();
            case Horse -> new model.Horse();
            case Donkey -> new model.Donkey();
        };
    }
}
