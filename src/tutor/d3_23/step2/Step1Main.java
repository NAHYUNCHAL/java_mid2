package tutor.d3_23.step2;

public class Step1Main {
    static void main(String[] args) {
        Marine marine1 = new Marine("마린",100);
        Zealot zealot = new Zealot("질럿",200);
        UnitStore<Marine> marineUnitStore1 = new UnitStore<>();

        marineUnitStore1.store(marine1);


        marineUnitStore1.showInfo();
        Marine release = marineUnitStore1.release();
        System.out.println("release = " + release);
        UnitStore<Zealot> zealotUnitStore = new UnitStore<>();
        zealotUnitStore.store(zealot);
        zealotUnitStore.showInfo();
        Zealot release1 = zealotUnitStore.release();
        System.out.println("release1 = " + release1);



    }
}
