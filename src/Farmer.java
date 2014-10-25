
public class Farmer {

	
	private String name;
	private String NIC;
	private int fid;
	private String address;
	private int contct;
	private String descriptio;
	
	
	public Farmer(String name, String NIC, int fid, String address, int contact, String desc)
	{
		this.name=name;
		this.NIC=NIC;
		this.fid=fid;
		this.address=address;
		this.contct=contact;
		this.descriptio=desc;
	}


	public String getName() {
		return name;
	}


	public String getNIC() {
		return NIC;
	}


	public int getFid() {
		return fid;
	}


	public String getAddress() {
		return address;
	}


	public int getContct() {
		return contct;
	}


	public String getDescriptio() {
		return descriptio;
	}
	
	
	
}
