package InterfaceDemo;

public interface Telephone {
    void poweron();   //power on
    void dial(String phoneNumber);    //dail a number
    void answer();   // answer a phone call
    boolean callPhone(String phoneNumber);  // call another phone
    boolean isRinging();    // is ringing
}
