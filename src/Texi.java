public class Texi extends Transport {

    private String departure;
    private int departure_distance;
    private int departure_mindistance;
    private int basic_distance = 1;
    private int basic_price = 3000;

    private int speed = 0;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private int basic_maxprice = 10000;

    private int distancePer_price = 1000;

    private int amountPrice;
    // 12.출력 택시 c 누적요금계산용;
    // 아니면 메인문에 인트배열을 만들어서 저장하자.
    private int totalPrice;



    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


    // 가이드에 버스 클래스에 현재 승객이 있어서 여기서도 상속받지 않고 사용함.
    private int nowPassengers;


    // text getter setter 시작

    public String getDeparture() {

        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public int getDeparture_distance() {
        return departure_distance;
    }


    public int getDeparture_mindistance() {
        return departure_mindistance;
    }



    public void setDeparture_distance(int departure_distance) {
        this.departure_distance = departure_distance;
    }


    public int getBasic_distance() {
        return basic_distance;
    }

    public void setBasic_distance(int basic_distance) {
        this.basic_distance = basic_distance;
    }

    public int getBasic_price() {
        return basic_price;
    }

    public int  getBasic_maxprice() {
        return basic_maxprice;
    }



    public void setBasic_price(int basic_price) {
        this.basic_price = basic_price;
    }

    public int getDistancePer_price() {
        return distancePer_price;
    }

    public void setDistancePer_price(int distancePer_price) {
        this.distancePer_price = distancePer_price;
    }

    public int getAmountPrice() {
        return amountPrice;
    }

    public void setAmountPrice(int amountPrice) {
        this.amountPrice = amountPrice;
    }

    public int getTotalPrice() {
        return totalPrice;
    }


    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;

    }

    public int getNowPassengers() {
        return nowPassengers;
    }

    public void setNowPassengers(int nowPassengers) {
        this.nowPassengers = nowPassengers;
    }


    // text getter setter 종료

    // 요금 추가 == 총금액?????
    public int addpricePerdistance(int distance) {

        return this.amountPrice = basic_price +(distancePer_price*basic_distance * distance);

    }

    public void payPrice() {

        System.out.println(amountPrice + "원을 지불했습니다.");

    }

    // 여기 메서드도 마찬가지이다.

    @Override
    public int addPassenger(int addPassenger){

        return this.nowPassengers += addPassenger;

    }
    @Override
    public int leftPassenger(int nowPassengers){

        return super.callMaxPassenger() -nowPassengers;

    }


}