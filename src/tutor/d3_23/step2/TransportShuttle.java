package tutor.d3_23.step2;

public class TransportShuttle<T extends BioUnit> {
    private T unit;

    public void in(T unit) {
        this.unit = unit;
    }

    public T out() {
        return unit;
    }
    public  void showInfo() {
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());

    }

    @Override
    public String toString() {
        return "TransportShuttle{" +
                "unit=" + unit +
                '}';
    }
}
