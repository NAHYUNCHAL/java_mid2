package tutor.d4_03;

import java.util.HashSet;

public class HashSetMain {

    static void main(String[] args) {

        HashSet<Member> set = new HashSet<>();
        Member member1 = new Member("회원1");
        Member member2 = new Member("회원2");
        Member member3 = new Member("회원1");

        set.add(member1);
        set.add(member2);
        set.add(member3);

        boolean contains = set.contains(member3);
        System.out.println(contains);
        System.out.println(set);

    }


}
