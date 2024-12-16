public class Race {
    private String currentLeader = " ";
    private int maxDistance = 0;
    public void newLeader(Car car) {
        int distance = car.speed * 24;
        if( distance > maxDistance) {
            currentLeader = car.name;
            maxDistance = distance;
        }
        }
    public String getCurrentLeader() {
        return currentLeader;
    }
    }
