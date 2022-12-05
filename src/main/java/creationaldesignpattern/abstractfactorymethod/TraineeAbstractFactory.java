package creationaldesignpattern.abstractfactorymethod;

public class TraineeAbstractFactory extends AbstractFactory{
    @Override
    public Profession getProfession(String typeOfProfession) {
        if (typeOfProfession == null) {
            return null;
        } else if (typeOfProfession.equalsIgnoreCase("Engineer")) {
            return new EngineerTrainee();
        } else if (typeOfProfession.equalsIgnoreCase("Teacher")) {
            return new TraineeTeacher();
        }
        return null;
    }
}
