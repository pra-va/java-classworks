package lt.pra_va;

import lt.vtvpmc.sheep.Sheep;
import lt.vtvpmc.sheep.SheepColor;

public class SheepExtended extends Sheep {
    private String name;

    public SheepExtended(SheepColor color) {
        super(color);
        if (color.equals(SheepColor.BLACK)) {
            this.name = "Jack";
        } else {
            this.name = "Dolly";
        }
    }

    public String getName() {
        return name;
    }
}
