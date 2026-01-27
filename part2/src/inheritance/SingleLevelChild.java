package inheritance;

public class SingleLevelChild extends SingleLevelFather {

	String name1;
	
	public SingleLevelChild(String fName,String cName) {
		super(fName);
		this.name1=cName;		
	}
}
