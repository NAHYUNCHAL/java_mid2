package tutor.d3_23.step2;

public class Step2Main1 {
    static void main(String[] args) {
        Marine marine = new Marine("마린", 100);
        TransportShuttle<Marine> transportShuttle = new TransportShuttle<>();
        transportShuttle.in(marine);

        ShuttleReporter.printByGeneric(transportShuttle);
        ShuttleReporter.printByWildcard(transportShuttle);
    }
}
