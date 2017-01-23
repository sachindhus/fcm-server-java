package com.google.android.fcm.server;

/**
 * Constants used on FCM service.
 */
public final class Constants {

  /**
   * Endpoint for sending messages.
   */
  public static final String FCM_SEND_ENDPOINT = "https://fcm.googleapis.com/fcm/send";
  
  private Constants() {
    throw new UnsupportedOperationException();
  }

}
