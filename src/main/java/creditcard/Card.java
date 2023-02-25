package creditcard;
import java.util.Scanner;
import java.util.logging.*;
class Credit implements cloneable{
	String cardholder;
	Long cardnumber;
	String expirydate;
	Logger log=Logger.getLogger("hi");
	Credit(String cardholder,Long cardnumber,String expirydate)
	{
		this.cardholder=cardholder;
		this.cardnumber=cardnumber;
		this.expirydate=expirydate;
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
        Long card=(long) 1234;
        Credit s1=new Credit(cardholder,cardnumber,expirydate);
        Credit s2=s1.active();
        boolean ans=s2.helo(card);
        log.log(Level.INFO,()->""+ans);
   
	if(cardnumber.equals(card)) {
         log.log(Level.INFO,()->"CardHolder:"+cardholder);
         log.log(Level.INFO,()->"CardNumber:"+cardnumber);
         log.log(Level.INFO,()->"ExpiryDate:"+ expirydate);
        }
        else {
			log.info("Failed");
		}
     }
}
