import java.util.HashMap;
import java.util.Map;

class Day{
    String dayName;
    public Day(String today){
        this.dayName = today;
    }
}
public class MapTester {
    public static void main(String[] args) {
        Day day1 = new Day("Mon");
        Day day2 = new Day("");
        Day day3 = null;
        Day day4 = new Day("");
        Map<Day, String> planning = new HashMap<Day, String>();
        planning.put(day1, "");
        planning.put(day2, "Sessions");
        planning.put(day3, null);
        planning.put(day4, "Sessions");
        planning.put(day1, "");
        System.out.println("size of the map:" + planning.size());
        System.out.println("values are:" + planning.values());
    }
}

