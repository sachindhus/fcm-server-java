# fcm-server-java
Push nitification to FCM server using java code

Example:

		try{
			Sender sender = new Sender("<FCM server key>");
			Builder messageBuilder = new Message.Builder().timeToLive(30);
			messageBuilder = messageBuilder.addNotification("title", "Message title");
			messageBuilder = messageBuilder.addNotification("body", "Message body");
			messageBuilder = messageBuilder.addData("title", "Message title");
			messageBuilder = messageBuilder.addData("body", "Message body");
			messageBuilder = messageBuilder.addNotification("body", "Message body");
			Response response = sender.send(messageBuilder.build(), "<device id>", 1);
			System.out.println("getCanonicalRegistrationId::"+response.getCanonicalRegistrationId());
			System.out.println("getErrorCodeName::"+response.getErrorCodeName());
			System.out.println("getMessageId::"+response.getMessageId());
		}catch(Exception ex){
			ex.printStackTrace();
		}
