public class TestRoom
{
    public void showInfo(Room room){
        System.out.println("Pokój o powierzchni: " + room.surface + " aktualnej temperaturze: " + room.temperature + " Czy posiada klimatyzator?: " + room.isConditioner);
    }

    public static void main(String[] args)
    {
        Room room = new Room(53.5, 24, true);
        TestRoom test1 = new TestRoom();



        test1.showInfo(room);
        System.out.println(room.lowerTemperature());
        test1.showInfo(room);
        System.out.println(room.lowerTemperature());
        test1.showInfo(room);
        System.out.println(room.lowerTemperature());
        test1.showInfo(room);
        System.out.println(room.lowerTemperature());
        System.out.println(room.lowerTemperature());
        test1.showInfo(room);
        System.out.println(room.lowerTemperature());
        System.out.println(room.lowerTemperature());
        System.out.println(room.lowerTemperature());
        test1.showInfo(room);
        System.out.println(room.lowerTemperature());
        System.out.println(room.lowerTemperature());
        test1.showInfo(room);
    }
}
