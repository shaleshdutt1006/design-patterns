package creationaldesignpattern.abstractfactorymethod;

import creationaldesignpattern.abstractfactorymethod.AbstractFactory;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        System.out.println("Which type of Professionals you want Yes for trainee else No for fullTime Professionals");
        Scanner scanner = new Scanner(System.in);
        boolean isTrainee = scanner.hasNext();

        //Get instance from factory of factory AbstractFactoryProducer class if yes it will give trainees
        AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(isTrainee);

        //AbstractFactoryProducer.getProfession gives new trainees object if true and in this we want
        // trainees which are engineer by profession

        System.out.println("Do you want engineer or teacher");
        Scanner input = new Scanner(System.in);
        String typeOfProfession = input.nextLine();

        Profession engg = abstractFactory.getProfession(typeOfProfession);
        engg.print();
    }
}
