package org.fao.aoscs.parent.client;

/**
 * Interface to represent the messages contained in resource bundle:
 * 	/Users/ton/Developer/FAO/workspace_demo/parent/target/parent-0.0.1-SNAPSHOT/WEB-INF/classes/org/fao/aoscs/parent/client/Messages.properties'.
 */
public interface Messages extends com.google.gwt.i18n.client.Messages {
  
  /**
   * Translated "Enter your name".
   * 
   * @return translated "Enter your name"
   */
  @DefaultMessage("Enter your name")
  @Key("nameField")
  String nameField();

  /**
   * Translated "Send".
   * 
   * @return translated "Send"
   */
  @DefaultMessage("Send")
  @Key("sendButton")
  String sendButton();
}
