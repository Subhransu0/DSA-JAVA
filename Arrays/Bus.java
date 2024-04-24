import java.util.Scanner;

public class Bus {

    Scanner in = new Scanner(System.in);
    int BHUBANESWAR = 25;
    int CUTTACK = 48;
    int PURI = 64;
    int PARADEEP = 130;
    int MAX_RANGE = 200;
    int MAX_SEAT = 20;

    public static void main(String[] args) {
        Bus obj = new Bus();
        int seat = 0;

        do {
            System.out.println("Welcome to Bus Reservation System ");
            System.out.println("Select Any Option : ");
            System.out.println("1 : Check Available Seat");
            System.out.println("2 : Select Location");
            System.out.println("3 : Book your Seat");
            System.out.println("4 : Exit");

            int operation = obj.in.nextInt();
            System.out.println("Thank You .");
            if (operation == 4) {
                System.out.println("Thank you for coming.");
                break;
            }

            switch (operation) {
                case 1:
                    System.out.println("Total available seat : " + obj.MAX_SEAT);
                    break;
                case 3:
                    System.out.println("Enter your name and press 'Ok' to stop booking process. ");
                    while (obj.MAX_SEAT >= seat) {
                        String name = obj.in.next();
                        seat++;
                        if (name.equalsIgnoreCase("Ok")) {
                            System.out.println("Seat Booked Successfully.");
                            break;
                        }
                    }
                    int a = seat -1;

                    obj.MAX_SEAT = obj.MAX_SEAT - a;
                    break;
                case 2:
                    System.out.println("Select PLACE You want to go : ");
                    String place = obj.in.next();
                    int distance = 0;
                    switch (place.toLowerCase()) {
                        case "bhubaneswar":
                            distance = obj.BHUBANESWAR;
                            break;
                        case "cuttack":
                            distance = obj.CUTTACK;
                            break;
                        case "puri":
                            distance = obj.PURI;
                            break;
                        case "paradeep":
                            distance = obj.PARADEEP;
                            break;
                        default:
                            System.out.println("Location not found!");
                    }
                    if (distance > 0 && distance <= obj.MAX_RANGE) {
                        System.out.println("Distance to " + place + ": " + distance + " km");
                    } else {
                        System.out.println("Destination out of range!");
                    }
                    break;
            }
        } while (true);

    }
}
