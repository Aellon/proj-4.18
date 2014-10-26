import java.util.Scanner;


public class pop {
	
	
	public static void main(String args[])
	{
		Farmer fm;
		Stock st;
		Scanner input= new Scanner(System.in);
		int x;
	  DBConnector b=new DBConnector("root", "");
          
          /*CaneSample cs = new CaneSample();
          
          b.putCaneSample(cs);*/
          
          /*CaneSampleEntryWindow win = new CaneSampleEntryWindow(10001,"root","");
          win.setVisible(true);*/
          
          /*BoilerWaterTestEntry bwt = new BoilerWaterTestEntry(10001,"root","");
          bwt.setVisible(true);*/

          /*PANSampleEntryForm bwt2 = new PANSampleEntryForm(10001,"root","");
          bwt2.setVisible(true);*/

          
          JuiceSampleEntryForm win = new JuiceSampleEntryForm(10001,"root","");
          win.setVisible(true);
          
          
          
          
          //putStock(int fid, String grade, float weight, float cost, int stockid,  String date)
         // b.putStock(1, "A", 34, 34, 1, "dateee");
          
         // NewFarmerEntryWindow fe= new NewFarmerEntryWindow ("root","");
         // fe.setVisible(true);
          /*StockEntryWindow sew= new StockEntryWindow("root","");
          sew.setVisible(true);*/
         // fe.setVisible(true);
	  
	// b.putFarmer("BILLO", "912348846v", "Monaragala", 7788, "BALLO");
	// b.editFarmer("sathya","", 100, "", 99000, "");
	  
	//  float j=100;
	// float k=4999;
	// b.putStock(100, "a", j, k, 88, 45,"2014/09/09");
	// x=input.nextInt();
	// fm=b.getFarmer(x);
		//System.out.println (fm.getName()+"   "+fm.getContct()+"  "+fm.getDescriptio());
		
                  
	  
	/*  st=b.getStock(344);
	  System.out.println (st.getStocknum()+"   "+st.getFid()+"  "+st.getWeight());
	           System.out.println("visitha manujaya");*/
	}

}
