public class Main {
    public static void main(String[] args) {
        System.out.println(walk(23,-2));
        System.out.println(walk(18,15));
        System.out.println(walk(66,40));
        System.out.println(walk(28,-15));
        System.out.println(walk(54,-80));
    }
    public static String walk(int age, int temperature){
        if (age >20 && age <45 && temperature > -20 && temperature <30){
            return "Можно идти гулять";
        } else if (age < 20 && temperature > 0 && temperature <28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }

    }

}