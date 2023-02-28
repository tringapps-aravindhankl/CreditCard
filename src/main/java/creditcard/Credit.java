package creditcard;

import java.util.logging.Logger;

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
