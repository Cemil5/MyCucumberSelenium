package day44_OPP_review.callcenter;

public class WhatsApp extends MessagingApp implements VoiceCallable, VideoCallable {


	@Override
	public void videoCall() {
		System.out.println("Whatsapp doing a video call for Mr. Mike");
		
	}

	@Override
	public void call(String contact) {
		System.out.println("Whatsapp doing a  call for " + contact);
		
	}

	@Override
	public void sendMessage(String msg) {
		System.out.println("Whatsapp - sending a message " + msg + " ...");
	}
	
	

}
