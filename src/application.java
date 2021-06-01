
import Login.Login;
import Login.NormalLogin;
import Login.google;
import TypeOfRoom.DoubleBed;
import TypeOfRoom.SingleBed;
import TypeOfRoom.TypeOfRoom;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class application {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        SingleBed SinBed1 = new SingleBed(101, "101user", "101pass");
        SingleBed SinBed2 = new SingleBed(102, "102user", "102pass");
        DoubleBed DouBed1 = new DoubleBed(201, "201user", "201pass");
        DoubleBed DouBed2 = new DoubleBed(202, "202user", "202pass");
        SingleBed[] IDroomSingle = {SinBed1, SinBed2};
        Boolean[] SingleValid = {true,true,true};
        DoubleBed[] IDroomDouble = {DouBed1, DouBed2};
        Boolean[] DoubleValid = {true,true,true};
        TypeOfRoom room = null;
        Date dateCheckIn;
        Date dateCheckOut;
        int numGuest;
        Login user;
        int way;

        System.out.println("Welcome to Hotel");
        System.out.println("please choose the way to login by type number");
        System.out.println("type 1 : username&password ");
        System.out.println("type 2 : google");
        System.out.print("ans : ");
        way = sn.nextInt();
        System.out.println("------------------------------");

        if (way == 1) {
            System.out.print("username : ");
            String username = sn.next();
            System.out.print("password : ");
            String password = sn.next();
            user = new NormalLogin();
            user.login(username, password);
            System.out.println("------------------------------");
        } else {
            if (way == 2) {
                System.out.print("email : ");
                String email = sn.next();
                System.out.print("password : ");
                String password = sn.next();
                user = new google();
                user.login(email, password);
                System.out.println("------------------------------");
            }
        }
        boolean valid = false;
        int type;
        int id;
        while (!valid) {
            System.out.println("choose type of bedroom");
            System.out.println("type 1 : single bed");
            System.out.println("type 2 : double bed");
            System.out.print("ans : ");
            type = sn.nextInt();
            if (type == 1) {
                for (id = 0; id < SingleValid.length; id++) {
                    if (SingleValid[id] == true) {
                        valid = true;
                        room = IDroomSingle[id];
                        SingleValid[id] = false;
                        break;
                    }
                }
            } else {
                if (type == 2) {
                    for (id = 0; id < DoubleValid.length; id++) {
                        if (DoubleValid[id] == true) {
                            valid = true;
                            room = IDroomDouble[id];
                            DoubleValid[id] = false;
                            break;
                        }
                    }
                }
            }
            if (valid == false) {
                System.out.println("No available rooms");
            }
        }

        System.out.println("Numbers of guest");
        System.out.print("ans: ");
        numGuest = sn.nextInt();
        System.out.println("Date checkout");
        System.out.print("date : ");
        int date = sn.nextInt();
        System.out.println("month : ");
        int month = sn.nextInt();
        System.out.println("year : ");
        int year = sn.nextInt();
        dateCheckOut = new Date(year, month, date);
        ZoneId defaultZoneId = ZoneId.systemDefault();
        LocalDate checkIn = LocalDate.now();
        dateCheckIn = Date.from(checkIn.atStartOfDay(defaultZoneId).toInstant());
        room.setInfoGuest(numGuest,dateCheckIn,dateCheckOut);
        System.out.println("------------------------------");
        System.out.println("detail");
        System.out.println("ID room : " + room.getID());
        System.out.println("Numbers Of Guest : " + room.getNumOfGuest());
        System.out.println("Wifi Username : " + room.getWifiUser());
        System.out.println("Wifi Password : " + room.getWifiPass());
        System.out.println("Date Check-In : " + room.getCheckIn());
        System.out.println("Date Check-Out : " + room.getCheckOut());
    }

}
