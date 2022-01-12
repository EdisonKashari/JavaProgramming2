package day_34_GarbageColletion_AccessModifiers;

public class Constractor_vs_StatickBlock {
    static {
        System.out.println("Static Block");
    }

    public  Constractor_vs_StatickBlock (){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        new Constractor_vs_StatickBlock();
        new Constractor_vs_StatickBlock();
        new Constractor_vs_StatickBlock();
        new Constractor_vs_StatickBlock();
        new Constractor_vs_StatickBlock();
        new Constractor_vs_StatickBlock();

    }
}
