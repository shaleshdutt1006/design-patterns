package structuralpattern.adapterdesign;

//An Adapter Pattern says that just "converts the interface of a class into
// another interface that a client wants".
public class PenAdapter implements Pen {
    PilotPen pilotPen = new PilotPen();
    @Override
    public void write(String pen) {
        pilotPen.mark(pen);
    }
}
