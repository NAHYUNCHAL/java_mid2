package tutor.d3_23.step1;

public class Step1Main {
    static void main(String[] args) {
        Marine marine = new Marine("마린",100);
        Zealot zealot = new Zealot("질럿",200);
        UnitStore<Marine> marineUnitStore = new UnitStore<>();
        marineUnitStore.store(marine);
        marineUnitStore.showInfo();
        Marine release = marineUnitStore.release();
        System.out.println("release = " + release);
        UnitStore<Zealot> zealotUnitStore = new UnitStore<>();
        zealotUnitStore.store(zealot);
        zealotUnitStore.showInfo();
        Zealot release1 = zealotUnitStore.release();
        System.out.println("release1 = " + release1);


    }
}
