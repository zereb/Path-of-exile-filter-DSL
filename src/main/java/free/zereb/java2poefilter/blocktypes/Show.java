package free.zereb.java2poefilter.blocktypes;

public class Show extends Block {

    @Override
    protected String blockStrart() {
        return "Show";
    }

    public static Block block(){
        return new Block() {
            @Override
            protected String blockStrart() {
                return "Show";
            }
        };
    }

}
