
public class Test {
    public static void main(String[] args) {

        System.out.println("---------------------------");

        Bus[] buses = new Bus[2];
        buses[0] = new Bus(100, "bus");
        buses[1] = new Bus(200, "bus");

        Bus busA = buses[0];
        Bus busB = buses[1];

        if (busA.number == busB.number) {
            System.out.println("차량의 번호가 중복되었습니다!");
            System.exit(0);
        }

        busA.Print(); busB.Print();

        System.out.println("---------------------------");
        busA.take(2);
        busA.showInfo();
        System.out.println("---------------------------");

        busA.fuelUp(-50);
        System.out.println("---------------------------");

        busA.status(false);
        busA.fuelUp(10);
        System.out.println("---------------------------");

        busA.status(true);
        busA.take(45);
        busA.off(30);
        busA.showInfo();
        System.out.println("---------------------------");

        busA.take(5);
        busA.showInfo();
        System.out.println("---------------------------");
        busA.fuelUp(-55);
        busA.status(false);

        System.out.println("---------------------------");

        Taxi[] taxis = new Taxi[2];
        taxis[0] = new Taxi(1234, "taxi");
        taxis[1] = new Taxi(5678, "taxi");

        Taxi taxiA = taxis[0];
        taxiA.Print();
        Taxi taxiB = taxis[1];
        taxiB.Print();

        taxiA.status(true);

        System.out.println("---------------------------");

        taxiA.take(2,"서울역",2);
        taxiA.showInfo();
        taxiA.status(true);
        System.out.println("---------------------------");
        taxiA.fuelUp(-80);
        taxiA.off(2);

        System.out.println("---------------------------");

        taxiA.take(5,"",0);

        System.out.println("---------------------------");

        taxiA.take(3,"구로디지털단지역",12);
        taxiA.showInfo();
        System.out.println("---------------------------");
        taxiA.fuelUp(-20);
        taxiA.status(false);
        taxiA.off(3);




    }

}




