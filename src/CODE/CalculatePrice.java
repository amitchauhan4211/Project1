package CODE;

public class CalculatePrice {
	/**
	 * Here we are trying to calculate pageview for web fonts their price.
	 * @param args
	 */
	public static void main(String[] args) {
		  
		  //Pageviews starts from 250K.
		  int webPageViews=250000, amount=35;
		  //loop will calculate pageviews and then price for those page views.
		  for(int i=1;i<=70;i++)
		  {
		   System.out.println("PageViews : "+webPageViews+"   Cost : $"+amount*i+"    times: "+i +" X");
		   webPageViews=webPageViews+750000; 
		  }
	 }
}
