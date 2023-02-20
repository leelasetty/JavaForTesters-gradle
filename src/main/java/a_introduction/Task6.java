package a_introduction;

public class Task6 {
    public static void main (String[] args) {
        double alcoholContent = 3;
        String beerType;

        if (alcoholContent >= 4) {
            beerType = "strong";
        }
        else {
            beerType = "normal";
        }
         beerType = alcoholContent >= 4 ?  "strong": "normal";
        System.out.println("Beer is " + beerType);
    }

}
