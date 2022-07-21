import static javax.swing.JOptionPane.showMessageDialog;

public class Taxi extends transport {

    int fare; // 일반요금
    int charge; //추가요금



    int distance;

    String destination;



    // 매개변수로 택시 변수를 받는 생성자
    Taxi(int number, String type) {
        super(number, type);

        this.number = number;// 택시번호 번호
        passMax = 4; // 최대 탑승인원
        fuel = 100; // 연료
        fare = 3000; //기본료
        charge = 1000; // 초과된 거리 1당 추가금액
    }

    @Override
    public void take(int passenger,String destination,int distance) {
        System.out.println(number + "번 택시에 " + passenger + "명이 탑승합니다.");
        this.destination = destination;
        this.distance = distance;


        if (passenger >= (passMax - passengerCount)) {

            showMessageDialog(null, "최대 승객 수 초과");
            System.out.println("최대 승객수 초과로 인해 탑승시키지 않았습니다.");
            return;
        }
        passengerCount += passenger;
        this.getPaid += fare + (distance-1)*charge;    // 기본요금 + (최종거리 - 기본거리)* 추가금

    }


    // 승객이 버스에 탈 때
    @Override
    public void fuelUp(int gas) {
        this.fuel += gas;      // 주유량 (매개변수 fuel)만큼 주유량 증가


        if ((fuel <= 10)) {
            showMessageDialog(null, "잔유량이 10% 이하입니다. 주유가 필요합니다!");
            System.out.println("잔유량이 10% 이하이므로 차고지로 이동합니다. 현재 잔유량 " + fuel + "%입니다.");

        } else {
            System.out.println("잔여연료 " + fuel + "%");
        }

    }


    // 택시의 현재 정보 출력
    @Override
    public void showInfo() {
        System.out.println("현재 택시 " + number + "번의 승객은 " + passengerCount + "명, 잔여좌석 수는 " + (passMax - passengerCount) + "석, 기본요금은 "+ fare+"원입니다.");
        System.out.println("목적지는 "+destination+", 목적지와의 거리는 "+distance+"km이며, 지불할 요금은 "+ getPaid+"입니다." );
    }

    @Override
    public void status(boolean a) {
        status = a;
        if ((passengerCount == 0)) {
            System.out.println("주행상태 : 일반 (승객대기중)");
        } else {
            if (status) {
                System.out.println("운행중");
            } else {
                System.out.println("운행불가");
            }
        }

    }

    @Override
    public void take(int passenger) {
        //버스만 씀
    }
    @Override

    public void off(int passenger) {
        passengerCount -= passenger;
        System.out.println(passenger + "명이 하차하였습니다.");
        System.out.println("지불요금 "+getPaid +"원");
        this.money += getPaid; // 택시 수입으로 추가 후 다음고객의 낼 돈을 0으로
        this.getPaid = 0;

        System.out.println("택시수입 "+money +"원");



    }


}