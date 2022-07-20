
public class Test {
    public static void main(String[] args) {

        Bus busA = new Bus(100);
        Bus busB = new Bus(200);

        if (busA.busNumber == busB.busNumber) {
            System.out.println("버스 번호 확인 필요");
            System.exit(0);
        }
        System.out.println(busA.busNumber+"번 버스와 "+ busB.busNumber +"번 버스가 생성되었습니다.");
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




