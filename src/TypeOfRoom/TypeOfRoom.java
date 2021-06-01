package TypeOfRoom;

import java.util.Date;

public interface TypeOfRoom {
    public void setInfoGuest(int numOfGuest,Date checkIn,Date checkOut);
    public double getTotalPrice();
    public int getID();
    public String getWifiUser();
    public String getWifiPass();
    public int getNumOfGuest();
    public Date getCheckIn();
    public Date getCheckOut();
    
}
