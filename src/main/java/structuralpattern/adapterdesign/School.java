package structuralpattern.adapterdesign;

public class School {

   // An Adapter Pattern says that just "converts the interface of a class into another interface that a
   // client wants
    //An Adapter pattern acts as a connector between two incompatible interfaces that otherwise
   // cannot be connected directly
    public static void main(String[] args) {

        Pen p = new PenAdapter();
        AssignmentWork assignmentWork = new AssignmentWork();
        assignmentWork.setP(p);
        assignmentWork.writeAssignment("I am writing assignment");


    }}
