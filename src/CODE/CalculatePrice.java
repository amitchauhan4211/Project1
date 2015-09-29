package CODE;

public class CalculatePrice {
	public static void main(String[] args) {
		  
		  int webPageViews=250000, amount=35;
		  //loop will calculate pageviews and then price for those page views.
		  for(int i=1;i<=70;i++)
		  {
		   System.out.println("PageViews : "+webPageViews+"   Cost : $"+amount*i+"    times: "+i +" X");
		   webPageViews=webPageViews+750000; 
		  }
	 }
}
