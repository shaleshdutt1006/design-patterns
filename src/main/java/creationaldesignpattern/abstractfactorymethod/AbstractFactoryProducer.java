package creationaldesignpattern.abstractfactorymethod;

//This class give which abstract factory to use. This is a factory of factory means
// it will give abstract factory of trainee and full-time Professional employees

public class AbstractFactoryProducer {
    public static AbstractFactory getProfession(boolean isTrainee) {
        if (isTrainee) {
            return new TraineeAbstractFactory();
        } else return new ProfessionalAbstractFactory();
    }
}
