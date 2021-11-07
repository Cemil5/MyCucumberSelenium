package day44_OPP_review.callcenter;

public class CallCenter {

	public static void main(String[] args) {
		
		WhatsApp wa = new WhatsApp();
		wa.launch();
		wa.allOSCompatible = true;
		wa.isFree = true;
		wa.name = "WhatsApp";
		wa.call("Ozzy");
		wa.sendMessage("Thank you...");
		wa.videoCall();
		wa.accept();
		
		VoiceCallable.decline();
		System.out.println(VoiceCallable.CAN_CALL);
		
		wa.getCount();
		wa.setCount(4);
		
		System.out.println("--------------");
		
		VoiceCallable obj = new WhatsApp();
		((MessagingApp) obj).launch();
		((WhatsApp) obj).launch();
		
		((MessagingApp) obj).allOSCompatible=false;
		((WhatsApp) obj).allOSCompatible=false;
		
		obj.call("Mr. Tom");
		
		((VideoCallable) obj).videoCall();
		((WhatsApp) obj).videoCall();
		
		
	}

}
