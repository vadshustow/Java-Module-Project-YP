public class Race {

    String leader = "";
    int distance = 0;

    public void addRacer(String name, int speed) {
        int newDistance = speed * 24;
        if (distance < newDistance) {
            distance = newDistance;
            leader = name;
        }
    }
}