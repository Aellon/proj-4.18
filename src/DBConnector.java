import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

//this is the class which connects entire software to the data base

public class DBConnector {
	
	Scanner scanner = new Scanner(System.in);
    Farmer famer;
    Stock stock;
	Connection con = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;
	String username="";
	String paswd="";
        private CaneSample smpl;
	
	
	 public DBConnector(String name, String pswd)
	{
		this.username=name;
		this.paswd=pswd;
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			//get the connection to the database using the jdbc 
			con = DriverManager.getConnection("jdbc:mysql://localhost/lsc?"+ "user="+username+"&password="+paswd);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}	
	}
	 
	//this method is to get a farmer form the db by his fid, then new farmer object will be created and if the farmer exist those infomations will be saved to the object
	 //if the given id is wrong a null farmer will be returened
	 public Farmer getFarmer(int id)  {
		 String ew="select * from farmer where Farmer_id=?";
		 try {
			preparedStatement = con.prepareStatement(ew);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			resultSet.next() ;
				
			famer= new Farmer(resultSet.getString("Name"), resultSet.getString("NIC"), resultSet.getInt("Farmer_id"), resultSet.getString("Address"), resultSet.getInt("Contact_number") , resultSet.getString("Description"));
			
			//System.out.println(resultSet.getInt("Contact_number") );
				return famer;
			
			
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println("No farmer found");
		}
		 
		 return null;// new Farmer("no name", "null",  000, "no", 000, " null");
	 }
	 
	 
	 
	  
	 //this method is to add new farmer to the database.
	 //you have to give all atributes for farme and you can create a new farmer in your databaase.
	public void putFarmerw(String name, String NIC, int fid, String address, int contact, String desc)
	{
		String insert="INSERT INTO farmer values('"+name+"', '"+NIC+"', "+fid+", '"+address+"'," +contact+", '"+desc+"')";
		try {
			preparedStatement = con.prepareStatement(insert);
			preparedStatement.execute();
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
	}
	 
	 public void putFarmer(String name, String NIC, String address, int contact, String desc)
	{
		String insert="INSERT INTO farmer(Name, NIC, Address, Contact_number, Description)  values('"+name+"', '"+NIC+"', '"+address+"'," +contact+", '"+desc+"')";
		try {
			preparedStatement = con.prepareStatement(insert);
			preparedStatement.execute();
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
	}
	 
	//this method is to delete a farmer from the data base 
public void deleteFamer(int id)
{
	String insert="DELETE FROM farmer where Farmer_id="+id;
	try {
		preparedStatement = con.prepareStatement(insert);
		preparedStatement.execute();
	} catch (SQLException e) {

		e.printStackTrace();
	}
}


//this method is for update the details of the farmers.......for the process of update you have to 
//enter details as follows......if you want to update name, enter a name "name", if you dant want to update name enter the name as "" it is an empty string.
//for an integer enter 0 for neglection....you have to hadr code these things in your casess
public void editFarmer(String name, String NIC, int fid, String address, int contact, String desc)
{
	if(!name.equalsIgnoreCase(""))
	try {
		preparedStatement = con.prepareStatement("UPDATE farmer SET Name='"+name+"' where Farmer_id="+fid);
		preparedStatement.execute();
		System.out.println("name updated");
	} catch (SQLException e) {

		e.printStackTrace();
	}
	
	if(!NIC.equalsIgnoreCase(""))
		try {
			preparedStatement = con.prepareStatement("UPDATE farmer SET NIC='"+NIC+"' where Farmer_id="+fid);
			preparedStatement.execute();
			System.out.println("NIC updated");
		} catch (SQLException e) {

			e.printStackTrace();
		}


if(!address.equalsIgnoreCase(""))
	try {
		preparedStatement = con.prepareStatement("UPDATE farmer SET Address='"+address+"' where Farmer_id="+fid);
		preparedStatement.execute();
		System.out.println("address updated");
	} catch (SQLException e) {

		e.printStackTrace();
	}


if(!desc.equalsIgnoreCase(""))
	try {
		preparedStatement = con.prepareStatement("UPDATE farmer SET Description='"+desc+"' where Farmer_id="+fid);
		preparedStatement.execute();
		System.out.println("desc updated");
	} catch (SQLException e) {

		e.printStackTrace();
	}

if(contact!=0)
	try {
		preparedStatement = con.prepareStatement("UPDATE farmer SET Contact_number='"+contact+"' where Farmer_id="+fid);
		preparedStatement.execute();
		System.out.println("desc updated");
	} catch (SQLException e) {

		e.printStackTrace();
	}

}


//this method is to insert a stock

public void putStock(int fid, String grade, float weight, float cost, int stockid,  String date)
{
	String insert="INSERT INTO stock (Farmer_id, Grade, Weight, Cost, Sample_id, date) values("+fid+", '"+grade+"', "+weight+", "+cost+", "+stockid+", '"+date+"')";
	try {
		preparedStatement = con.prepareStatement(insert);
		preparedStatement.execute();
	} catch (SQLException e) {

		e.printStackTrace();
	}
}
 

//by this method you can get a stock by giving stock id;
public Stock getStock(int id)  {
	 String ew="select * from stock where Stock_number=?";
	 try {
		preparedStatement = con.prepareStatement(ew);
		preparedStatement.setInt(1, id);
		resultSet = preparedStatement.executeQuery();
		resultSet.next() ;
			
		stock= new Stock(resultSet.getInt("Farmer_id"), resultSet.getString("Grade"), resultSet.getFloat("Weight"), resultSet.getFloat("Cost"),resultSet.getString("date"), resultSet.getInt("Stock_number") , resultSet.getInt("Sample_id"));
		
		//System.out.println(resultSet.getInt("Contact_number") );
			return stock;
		
		
	} catch (SQLException e) {
		//e.printStackTrace();
		System.out.println("No Stock found");
	}
	 
	 return null;// new Farmer("no name", "null",  000, "no", 000, " null");
}


public CaneSample getCSample(int id)  {
		 String ew="select * from cane_sample where Sample_id=?";
		 try {
			preparedStatement = con.prepareStatement(ew);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			resultSet.next() ;
                        Calendar cal = Calendar.getInstance();
                	cal.getTime();
			
                      /*  String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
                        String time =  new SimpleDateFormat("HH:mm:ss").format(cal.getTime());*/
			smpl= new CaneSample();
			
                        smpl.setDate(resultSet.getString("Date"));
                        smpl.setTime(resultSet.getString("Time"));
                        smpl.setGrade(resultSet.getString("Grade"));
                        smpl.setBrix(Float.parseFloat(resultSet.getString("Brix")));
			smpl.setRendament(resultSet.getFloat("Rendement"));
                        smpl.setSampleNo(resultSet.getInt("Sample_id"));
                        smpl.setFarmer_id(resultSet.getInt("Farmer_id"));
                        smpl.setBC_GC(resultSet.getString("BC/GC"));
                        smpl.setPol(resultSet.getFloat("pol"));
                        smpl.setPurity(resultSet.getInt("Purity"));








//System.out.println(resultSet.getInt("Contact_number") );
				return smpl;
			
			
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println("No farmer found");
		}
		 
		 return null;// new Farmer("no name", "null",  000, "no", 000, " null");
	 }
	 


// this method is used to insert a new cane sample to the system
public void updateCaneSample(int Sample_id,float Brix,float Polarity, float Purity,float Rendement,float IncorrectedBrix){
    
    
    
    
    String insert="UPDATE cane_sample Brix="+Brix+",Pol="+Polarity+",Purity="+Purity+",Rendement="+Rendement+" WHERE Sample_id="+Sample_id+"";
	try {
		preparedStatement = con.prepareStatement(insert);
		preparedStatement.execute();
	} catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Update Failed");
	}
    
    
}

public void putCaneSample(CaneSample cs){
    
    
    int farmer_id =cs.getFarmer_id();
    float brix = cs.getBrix();
    String type =cs.getBC_GC();
    float pol = cs.getPol();
    float purity = cs.getPurity();
    float rendement = cs.getRendament();
    String grade = cs.getGrade();
    String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());    
    String time =  new SimpleDateFormat("HH:mm").format(new Date());
    
    
    
    
String insert="INSERT INTO cane_sample (Farmer_id,Brix,BC/GC,Pol,Purity,Rendement,Grade,Date,Time) VALUES("+farmer_id+","+brix+","+type+","+pol+","+purity+","+rendement+","+grade+","+date+","+time+")";
              // String insert="INSERT INTO cane_sample (Farmer_id) values("+farmer_id+")"; 
        try {  
        preparedStatement = con.prepareStatement(insert);
        preparedStatement.execute();
        
	} catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Operation Unsuccessful");
	}
 
 
}

public void putWaterSample(double ph,double tds,double hydrazine,double sugarTrace,double alkalinityP,double alkalinityO,double phosphate){
    
    String insert="INSERT INTO boiler_water_sample (ph,TDS,hardness,hydrazine,alkalinity_p,alkalinity_o,Phosphate) VALUES("+ph+","+tds+","+hydrazine+","+sugarTrace+","+alkalinityP+","+alkalinityO+","+phosphate+")";
    
    try {  
        preparedStatement = con.prepareStatement(insert);
        preparedStatement.execute();
        
	} catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Operation Unsuccessful");
	}
    
    
}

    public void putPANSample( float volume, float brix,float polarity,float purity){
        
         String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());    
         String time =  new SimpleDateFormat("HH:mm").format(new Date());
        
        String input = "INSERT INTO pan_sample (date,time,brix,polarity,purity,volume)VALUES ("+date+","+time+","+brix+","+polarity+","+purity+")";
        
        try {  
        preparedStatement = con.prepareStatement(input);
        preparedStatement.execute();
        JOptionPane.showMessageDialog(null,"Operation Successful");

        
	} catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Operation Unsuccessful");
	}
        
    }
    
   public void putJuiceSample(CaneJuiceSample js){
       
      // sample_idF XJBrix FXJPol FXJPty MXJBrix MXJPol MXJPty LMJBrix LMJPol LMJPty CLJBrix CLJPol CLJPty SBrix SPol SPty FILBrix FILPol FILPty
       
       //String input = "INSERT INTO juice_sample (sample_id,FXJBrix, FXJPol, FXJPty ,MXJBrix, MXJPol, MXJPty ,LMJBrix, LMJPol ,LMJPty ,CLJBrix ,CLJPol ,CLJPty ,SBrix, SPol ,SPty ,FILBrix ,FILPol ,FILPty)VALUES ()";
        
       String input = "INSERT INTO juice_sample(sample_id) values (63985)";
        try {  
        preparedStatement = con.prepareStatement(input);
        preparedStatement.execute();
        JOptionPane.showMessageDialog(null,"Operation Successful");

        
	} catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Operation Unsuccessful");
	}
       
       
   }





}
