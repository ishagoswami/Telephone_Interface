package InterfaceDemo;

public class DeskPhone implements Telephone
{
    private String myNumber;
    private boolean isRinging;

    public DeskPhone(String myNumber)
    {
        this.myNumber = myNumber;
    }

    @Override
    public void poweron()
    {
        System.out.println("This phone is always powered");
    }
    
    @Override
    public void dial(String phoneNumber)
    {
        System.out.println("Now ringinng" + phoneNumber + "on the deskphone");
    }

    @Override
    public void answer()
    {
        if(isRinging)
        {
            System.out.println("Answering the desk phone");
            isRinging = false; //as the call is picked up
        }
        else{
            System.out.println("Phone is not ringing");
        }
    }

    @Override
    public boolean callPhone(String phoneNumber)
    {
        if(phoneNumber == myNumber)
        {
            isRinging = true;
            System.out.println("Phone is Ringing");
        }
        else
        {
            isRinging = false;
        }
        return isRinging;
    }
    @Override
    public boolean isRinging()
    {
        return isRinging;
    }
}
