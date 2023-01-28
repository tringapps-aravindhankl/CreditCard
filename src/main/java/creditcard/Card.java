package creditcard;
import java.util.*;
class Credit implements Cloneable{
	String cardholder;
	Long cardnumber;
	String expirydate;
	Credit(String cardholder,Long cardnumber,String expirydate)
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
	boolean helo(Long card)
	{
		return cardnumber.equals(card);
	}
}
public class Card
{
    private static Scanner scan;

	public static void main( String[] args )
    {
        scan = new Scanner(System.in);
        System.out.println("Enter CardHolder Name");
        String cardholder=scan.next();
        System.out.println("Enter CardNumber");
        Long cardnumber=scan.nextLong();
        System.out.println("Enter ExpiryDate");
        String expirydate=scan.next();
        Long d=1234L;
        Credit s1=new Credit(cardholder,carnumber,expirydate);
        Credit s2=s1.active();
        System.out.println(s2.helo(d));
	boolean ans=s2.helo(d);
	if(ans==true) {
			System.out.println("CardHolder:" +cardholder+ "     cardnumber:" +cardnumber+ "    expirydate:" +expirydate);
		}
		else {
			System.out.println("Failed");
		}
    }
}
