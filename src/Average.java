public class Average implements IIntSequence {

    //From book
    private int i;

    @Override
    public boolean hasNext() {
        return i >= 0;
    }

    @Override
    public int next() {
        i++;
        return i % 2 == 0 ? i * i : 0;
    }

    //Training
}
