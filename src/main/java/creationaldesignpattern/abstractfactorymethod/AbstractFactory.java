package creationaldesignpattern.abstractfactorymethod;

//this is the Abstract factory of TraineeAbstractFactory and EngineerAbstractFactory class we override the methods
//in these classes to get professions whether it is engineer or teacher

public abstract class AbstractFactory {
    abstract Profession getProfession(String typeOfProfession);
}
