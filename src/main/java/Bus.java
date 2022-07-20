import static javax.swing.JOptionPane.showMessageDialog;

public class Bus extends transport {

    int busNumber;          // 버스 번호
    int passengerCount;     // 승객 수
    int money;              // 버스 수입

    int passMax; // 최대 탑승인원
    int fuel;

    int fare;

    Boolean status = true;

    // 매개변수로 버스 번호를 받는 생성자
    public Bus(int busNumber) {

        this.busNumber = busNumber;// 버스 번호
        passMax = 30; // 최대 탑승인원
        fuel = 100;
        fare = 1000;
    }


    // 승객이 버스에 탈 때
    public void take(int passenger) {
        System.out.println(passenger + "명이 탑승합니다.");
        if (passenger >= (passMax - passengerCount)) {
            int a = (passMax - passengerCount);
            passengerCount += a;
            money += fare * a;

            showMessageDialog(null, "만차로 인하여 " + a + "명의 승객만 탑승시켰습니다");
            System.out.println("만차로 인하여 " + a + "명의 승객만 탑승시켰습니다");
            return;
        }
        passengerCount += passenger;
        money += fare * passenger;      // 버스 요금 (매개변수 money)만큼 버스 수입이 증가
        // 승객 수 증가
    }

    public void off(int passenger) {
        passengerCount -= passenger;
        System.out.println(passenger + "명이 하차하였습니다.");
    }

    public void fuelUp(int gas) {
        this.fuel += gas;      // 주유량 (매개변수 fuel)만큼 주유량 증가


        if ((fuel <= 10)) {
            showMessageDialog(null, "잔유량이 10% 이하입니다. 주유가 필요합니다!");
            System.out.println("잔유량이 10% 이하이므로 차고지로 이동합니다. 현재 잔유량 " + fuel + "%입니다.");

        } else {
            System.out.println("잔여연료 " + fuel + "%");
        }

    }


    // 버스의 현재 정보 출력
    public void showInfo() {
        System.out.println("현재 버스 " + busNumber + "번의 승객은 " + passengerCount + "명, 잔여좌석 수는 " + (passMax - passengerCount) + "석, 수입은" + money + "입니다.");
    }

    public void status(boolean a) {
        status = a;
        System.out.println(status ? "주행상태: 운행중" : "주행상태: 차고지행");
    }


}




