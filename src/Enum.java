public class Enum{
    enum Season {
        WINTER, SPRING, SUMMER, FALL, value;
    }

    public static void main(String[] args) {
        for (Season s : Season.values())
            System.out.println(s+ ""+s.value);
    }
}

