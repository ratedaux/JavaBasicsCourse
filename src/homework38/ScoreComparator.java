package homework38;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Sportsman> {
    @Override
    public int compare(Sportsman o1, Sportsman o2) {
        return o1.getScore()- o2.getScore();
    }
}
