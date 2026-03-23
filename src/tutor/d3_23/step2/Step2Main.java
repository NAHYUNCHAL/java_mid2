package tutor.d3_23.step2;

public class Step2Main {
    static void main(String[] args) {
        Marine marine = new Marine("마린",100);
        Zealot zealot = new Zealot("질럿",200);
        Zergling zergling = new Zergling("저글링",50);




        BioUnit bioUnit = UnitUtil.maxHp(marine, zealot);
        System.out.println("더 체력이 높은 유닛: " + bioUnit);
        BioUnit bioUnit1 = UnitUtil.maxHp(zealot,zergling);
        System.out.println("더 체력이 높은 유닛: " + bioUnit1);



    }
}
