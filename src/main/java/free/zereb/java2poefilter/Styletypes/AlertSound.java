package free.zereb.java2poefilter.Styletypes;

import free.zereb.java2poefilter.Utils;

public class AlertSound {
    private final String id;
    private final String volume;

    public AlertSound(int id, int volume){
        this.id = String.valueOf(id);
        this.volume = String.valueOf(Utils.clamp(volume, 0, 300));
    }

    @Override
    public String toString() {
        return id + " " + volume;
    }
}
