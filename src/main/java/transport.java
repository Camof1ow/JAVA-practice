import static javax.swing.JOptionPane.showMessageDialog;

public abstract class transport {
    int number;          // 차량번호
    int passengerCount;     // 탑승객
    int money;              // 수입

    int getPaid; // 지불할요금(택시)

    int passMax; // 최대 탑승인원
    int fuel; // 연료.

    String type; // 차량 타입

    Boolean status = true;

    public transport (int number, String type){
        this.number = number;
        this.type = type;

    }

    public void Print(){
        System.out.println(number +"번 "+ type +"생성완료");
    }

    public void off(int passenger) {
        passengerCount -= passenger;
        System.out.println(passenger + "명이 하차하였습니다.");


    }

    public void status(boolean a) {
        status = a;
        System.out.println(status ? "주행상태: 운행중" : "주행상태: 차고지행");
    }

    public abstract void take(int passenger);

    public abstract void take(int passenger, String destination, int distance);

    public abstract void fuelUp(int gas);
    public abstract void showInfo();
}
