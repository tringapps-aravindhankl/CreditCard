package creditcard;
import java.util.Scanner;
import java.util.logger.*;
class Credit implements Cloneable{
	String cardholder;
	Long cardnumber;
	String expirydate;
	Logger log=Logger.getLogger("hi");
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
			log.info("error");
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
	Logger log=Logger.getLogger("hi");
        scan = new Scanner(System.in);
        log.info("Enter CardHolder Name");
        String cardholder=scan.next();
        log.info("Enter CardNumber");
        Long cardnumber=scan.nextLong();
        log.info("Enter ExpiryDate");
        String expirydate=scan.next();
        Long d=1234L;
        Credit s1=new Credit(cardholder,carnumber,expirydate);
        Credit s2=s1.active();
        log.info(s2.helo(d));
	if(cardnumber==card) {
			log.info("CardHolder:" +cardholder+ "     cardnumber:" +cardnumber+ "    expirydate:" +expirydate);
		}
		else {
			log.info("Failed");
		}
    }
}
