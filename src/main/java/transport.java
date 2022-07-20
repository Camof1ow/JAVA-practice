public class transport {


    int busNumber;          // 버스 번호
    int passengerCount;     // 승객 수
    int money;              // 버스 수입
    int passMax = 30; // 최대 탑승인원
    int fuel = 100;

    int fare = 1000;

    public void setStatus(Boolean status) {
        this.status = status;
    }

    Boolean status = true;

}
