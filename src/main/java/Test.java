
public class Test {
    public static void main(String[] args) {

        System.out.println("---------------------------");

        Bus[] group = new Bus[2];
        group[0] = new Bus(100, "bus");
        group[1] = new Bus(200, "bus");

        Bus busA = group[0];
        Bus busB = group[1];

        System.out.print("[생성결과] : ");
        busA.Print();

        if (busA.number == busB.number) {
            System.out.println("버스 번호 확인 필요");
            System.exit(0);
        }

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

    }

}




