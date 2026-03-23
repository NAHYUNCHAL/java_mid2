package tutor.d3_23.step2;

public class ShuttleReporter {
    ;
    static <T extends BioUnit> void printByGeneric(TransportShuttle<T> transportShuttle) {
        System.out.println("탑승 유닛: " + transportShuttle.out());
    }
    static void printByWildcard(TransportShuttle<?> transportShuttle) {
        System.out.println("탑승 유닛: " + transportShuttle.out());
    }

}
