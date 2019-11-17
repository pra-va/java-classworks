package lt.pra_va;

import lt.vtvpmc.sheep.AbstractSheepIteratorTest;
import lt.vtvpmc.sheep.Sheep;
import lt.vtvpmc.sheep.SheepColor;
import lt.vtvpmc.sheep.SheepIterator;
import java.util.ArrayList;
import java.util.List;

public class SheepExerciseSolution extends AbstractSheepIteratorTest implements SheepIterator {
    private List<Sheep> sheeps = new ArrayList<>();
    private int pointer = 0;


    private void createSheeps (int number) {
        for (int i = 0; i < number; i++) {
            if (sheeps.size() % 2 == 1) {
                this.sheeps.add(new SheepExtended(SheepColor.BLACK));
            } else {
                this.sheeps.add(new SheepExtended(SheepColor.WHITE));
            }
        }
    }

    @Override
    public SheepIterator getSheepIterator(int i) {
        createSheeps(i);
        return this;
    }

    @Override
    public boolean hasNext() {
        if (sheeps.size() > 0) {
            return this.sheeps.size() > this.pointer;
        }
        return false;
    }

    @Override
    public Sheep next() {
        if (hasNext()) {
            return this.sheeps.get(this.pointer++);
        }
        return null;
    }
}
