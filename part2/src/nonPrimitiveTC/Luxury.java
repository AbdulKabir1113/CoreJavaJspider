package nonPrimitiveTC;

public class Luxury extends Cab {

	    private String driver;
	    private String carNo;
	    private String model;
	    private long ph;
	    private double ratings;
	    private double fare;

	    public Luxury(String pl, String dl, String driver, String carNo,
	                  String model, long ph, double ratings, double fare) {
	        super(pl, dl);
	        this.driver = driver;
	        this.carNo = carNo;
	        this.model = model;
	        this.ph = ph;
	        this.ratings = ratings;
	        this.fare = fare;
	    }

	    public String getDriver() { return driver; }
	    public String getCarNo() { return carNo; }
	    public String getModel() { return model; }
	    public long getPh() { return ph; }
	    public double getRatings() { return ratings; }
	    public double getFare() { return fare; }
	
}
