package generics.introduction.sortExercises;

import java.util.Comparator;

public class ReverseComparator<T> implements Comparator<T> {

    private Comparator<T> delegateComparator;

    public ReverseComparator(Comparator<T> comparator) {
        this.delegateComparator = comparator;
    }

    @Override
    public int compare(T left, T right) {

        return -1 * delegateComparator.compare(left, right);
    }
}
