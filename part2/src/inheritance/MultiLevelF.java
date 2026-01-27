package inheritance;

public class MultiLevelF extends MultiLevelGF {

    String fName;

    public MultiLevelF(String gName, String fName) {
        super(gName);      
        this.fName = fName;
    }
}

