package tutor.d3_23.step2;

public class UnitStore <T extends BioUnit> {
    private T boxUnit;

    public void store(T boxUnit) {
        this.boxUnit = boxUnit;
    }

    public T release() {
        return boxUnit;
    }
    public void showInfo() {
        System.out.println("이름: " + boxUnit.getName() + ", HP: " + boxUnit.getHp());

    }
}
