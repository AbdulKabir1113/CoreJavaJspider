package inheritance;

public class MultiLevelC extends MultiLevelF {

    String cName;

    public MultiLevelC(String gName, String fName, String cName) {
        super(gName, fName);
        this.cName = cName;
    }
}

