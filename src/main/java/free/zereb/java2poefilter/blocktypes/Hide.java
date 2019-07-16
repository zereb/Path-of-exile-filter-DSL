package free.zereb.java2poefilter.blocktypes;

public class Hide extends Block {

    public static Block block(){
        return new Block() {
            @Override
            protected String blockStrart() {
                return "Hide";
            }
        };
    }

    @Override
    protected String blockStrart() {
        return "Hide";
    }
}
