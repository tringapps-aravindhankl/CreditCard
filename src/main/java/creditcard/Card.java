package creditcard;
import java.util.*;
class Credit implements Cloneable{
	String cardholder;
	Long cardnumber;
	String expirydate;
	Long card;
	Credit(String cardholder,Long cardnumber,String expirydate,Long card)
	{
		this.cardholder=cardholder;
		this.cardnumber=cardnumber;
		this.expirydate=expirydate;
		this.card=card;
	}
	Credit active() {
		try{
			return (Credit) super.clone();
		}
		catch(Exception e) {
			System.out.println("error");
			return this;
		}
	}
	void welcome() {
		Boolean ans=cardnumber.equals(card);
		if(ans==true) {
			System.out.println("CardHolder:" +cardholder+ "     cardnumber:" +cardnumber+ "    expirydate:" +expirydate);
		}
		else {
			System.out.println("Failed");
		}
	}
}
public class Card
{
    private static Scanner scan;

	public static void main( String[] args )
    {
        scan = new Scanner(System.in);
        System.out.println("Enter CardHolder Name");
        String a=scan.next();
        System.out.println("Enter CardNumber");
        Long b=scan.nextLong();
        System.out.println("Enter ExpiryDate");
        String c=scan.next();
        Long d=1234L;
        Credit s1=new Credit(a,b,c,d);
        Credit s2=s1.active();
        s2.welcome();
    }
}
