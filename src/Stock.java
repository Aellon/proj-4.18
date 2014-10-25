
public class Stock {
	
	private int fid;
	private String garde;
	private float weight;
	private float cost;
	private String date;
	private int stocknum;
	private int sampleid;
	
	public Stock(int fid, String grade, float weight, float cost, String date, int stocknum, int sampleid)
	{
		this.fid=fid;
		this.garde=grade;
		this.weight=weight;
		this.cost=cost;
		this.date=date;
		this.stocknum=stocknum;
		this.sampleid=sampleid;
		
	}

	public int getFid() {
		return fid;
	}

	public String getGarde() {
		return garde;
	}

	public float getWeight() {
		return weight;
	}

	public float getCost() {
		return cost;
	}

	public String getDate() {
		return date;
	}

	public int getStocknum() {
		return stocknum;
	}

	public int getSampleid() {
		return sampleid;
	}

	
	
}
