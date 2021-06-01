package TypeOfRoom;


import java.util.Date;

public class DoubleBed implements TypeOfRoom{
    private int IDRoom;
    private String wifiUser;
    private String wifiPass;
    private int numOfGuest;
    private Date dateCheckIn;
    private Date dateCheckOut;
    private double price = 3000;

    public DoubleBed(int IDRoom, String wifiUser, String wifiPass) {
        this.IDRoom = IDRoom;
        this.wifiUser = wifiUser;
        this.wifiPass = wifiPass;
    }

    @Override
    public void setInfoGuest(int numOfGuest, Date checkIn, Date checkOut) {
        this.numOfGuest = numOfGuest;
        this.dateCheckIn = checkIn;
        this.dateCheckOut = checkOut;
    }

    @Override
    public int getID() {
        return IDRoom;
    }

    @Override
    public String getWifiUser() {
        return wifiUser;
    }

    @Override
    public String getWifiPass() {
        return wifiPass;
    }

    @Override
    public int getNumOfGuest() {
        return numOfGuest;
    }

    @Override
    public Date getCheckIn() {
        return dateCheckIn;
    }

    @Override
    public Date getCheckOut() {
        return dateCheckOut;
    }
    
    @Override
    public double getTotalPrice() {
        return price;
    }
    
    
    
}
