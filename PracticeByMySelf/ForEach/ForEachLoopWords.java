package ForEach;

public class ForEachLoopWords {
    public static void main(String[] args) {
        String [] word = {"Java Programing","Cydeo School","Wooden Spoon","Early Birds"};

        for (String each : word) {
            String result =each.charAt(0)+"."+each.charAt(each.length()-1);
            System.out.println(result);
        }

    }
}
