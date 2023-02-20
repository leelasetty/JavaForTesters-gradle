package a_introduction;

public class Task6 {
    public static void main (String[] args) {
        double alcoholContent = 5.5;
        String beerType;

        if (alcoholContent >= 4) {
            beerType = "strong";
        }
        else {
            beerType = "normal";
        }
         alcoholContent >= 4 ? (beerType = "strong"): (beerType = "normal");
    }

}
