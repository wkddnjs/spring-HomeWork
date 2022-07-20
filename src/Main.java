import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // 택시 테스트
        //- 기본값
        //    - 최대 승객 수 = 4
        //    - 기본 요금 = 3000
        //    - 거리당 요금 = 1000
        //    - 기본 거리 = 1
        //    - 주유량 = 100
        //    - 상태 = 일반
        //    - 속도 = 0

        // -->택시 객체 생성 및 기본값 테스트 완료 및 택시시나리오에 있는 몇몇 출력값 확인 완료

//        Texi texi = new Texi();
//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//
//        texi.setMaxPassengers(4);
//        System.out.println(texi.getMaxPassengers());
//        System.out.println(texi.getBasic_price());
//        System.out.println(texi.getDistancePer_price());
//        System.out.println(texi.getBasic_distance());
//        System.out.println(texi.getFuelStatus());
//        System.out.println(texi.getVelocity());
//        texi.statusChange("일반");
//        System.out.println(texi.getStatus());
//
//        texi.setNowPassengers(2);
//        int nowTextPassen = texi.getNowPassengers();
//        System.out.println(texi.leftPassenger(nowTextPassen));
//
//        int per_price0 = texi.addpricePerdistance(2);
//        System.out.println(per_price0+"원입니다.");
//        arrayList.add(per_price0);
//
//        int per_price1 = texi.addpricePerdistance(12);
//        System.out.println(per_price1+"원입니다.");
//        arrayList.add(per_price1);
//
//        System.out.println(arrayList);
//        int sum = 0;
//        for(int arr : arrayList){
//
//            sum+=arr;
//
//        }
//
//        System.out.println("누적금액은 "+sum+" 원입니다.");


        System.out.println("===========================================");

        //    - 기본값
        //    - 최대 승객 수 = 30
        //    - 상태 = 운행
        //    - 요금 = 1000

        // -->버스 객체 생성 및  기본값 테스트 완료

//        Bus bus = new Bus();
//        System.out.println(bus.getFuelStatus());
//        bus.statusChange("운행중");
//        System.out.println(bus.getStatus());
//        System.out.println(bus.getFuelStatus()+"입니다.");
//        bus.setMaxPassengers(30);
//        bus.setNowPassengers(2);
//        bus.setFee(1000);
//        int examp = bus.countingBusFee(bus.getNowPassengers());
//        System.out.println(examp+"원");
//        int leftPassenger =  bus.leftPassenger(bus.getNowPassengers());
//        System.out.println(leftPassenger);

        // 스캐너 입력받는 함수.
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<>();


        System.out.println("르탄이가 항해 99에 출근하고 있습니다. 어떤 교통수단을 이용하시겠습니까? \n" +
                "1. 버스 정류장에서 버스를 기다린다. \n" +
                "2. 택시 승강장에서 택시를 기다린다.");


        while (true) {

            int q1 = scanner.nextInt();

            if (q1 == 1) {
                // 버스 1 객체 생성
                Bus bus = new Bus();
                // 버스 1 번호를 99번으로 설정함
                bus.setTrans_Num(99);
                // 버스 1 번호를 99번으로 설정한 것을 가져옴
                int bus_num = bus.getTrans_Num();
                // 버스 2 객체 생성
                Bus bus1 = new Bus();
                // 버스 1 번호를 100번으로 설정함
                bus1.setTrans_Num(100);
                int bus_num1 = bus1.getTrans_Num();

                System.out.println("버스가 다가 오고 있습니다. 앞에는 항해99로 가는 (" + bus_num + ")번 버스이고 \n" +
                        "뒤에는 항훼99로 가는 (" + bus_num1 + ")번 버스입니다 \n" +
                        "어떤 버스를 타시겠습니까?\n" + "\n" +
                        "1. 항해 99로 가는 버스 \n" +
                        "2. 항훼 99로 가는 버스");

                while (true) {
                    int q2 = scanner.nextInt();

                    if (q2 == 1) {

                        // 출력 관련기능 가져오기.
                        bus.addPassenger(2);
                        bus.setMaxPassengers(30);
                        int addpass_q2 = bus.getNowPassengers();
                        int leftpass_q2 = bus.leftPassenger(addpass_q2);
                        int countBusFee_q2 = bus.countingBusFee(addpass_q2);
                        int changedFuel_q2 = bus.fuelChanged(50);

                        bus.busFuelAlert(changedFuel_q2);
                        String busStats_q2 = bus.statusChange("운행중");
                        String busAlert_q2 = bus.getAlert_bus();

                        System.out.println("삑 카드를 찍고 버스가 출발합니다.\n" +
                                "당신은 무엇을 하시겠습니까? \n");
                        System.out.println("버스상태: " + busStats_q2 + " 탑승객수: " + addpass_q2 + " 잔여 승객수: " + leftpass_q2);
                        System.out.println("버스요금: " + countBusFee_q2 + " 연료량: " + changedFuel_q2);

                        System.out.println(" ");
                        System.out.println("1.정차벨을 누른다.");
                        ;
                        System.out.println("2.코딩을 한다.");
                        System.out.println("3.과음을 지른다");
                        System.out.println("4.노래를 부른다. ");


                        while (true) {
                            int q3 = scanner.nextInt();

                            if (q3 == 1) {

                                System.out.println("아직은 내릴때가 아니에요! 조금만 더 해봐요");
                                // 자바 메서드 완전종료하는 메서드
                                System.out.println("다른 번호를 눌러봐요!");

                            } else if (q3 == 2) {
                                // 정상루트

                                String busStats_q3 = bus.statusChange("차고지행");

                                // 5. 버스상태 변경
                                System.out.println("덜컹 덜컹~~~ 펑펑~~~ 슉슉");
                                System.out.println("버스가 항해 1주차에 정차했지만 버스상태가 이상합니다. 연기가 납니다.");
                                System.out.println("기사님께서 차고지를 잠깐 들리신다고 합니다.");
                                System.out.println("당신은 무엇을 하시겠습니까?");
                                System.out.println(" ");
                                System.out.println("버스상태: " + busStats_q3 + " 탑승객수: " + addpass_q2 + " 잔여 승객수: " + leftpass_q2);
                                System.out.println("버스요금: " + countBusFee_q2 + " 연료량: " + changedFuel_q2);

                                System.out.println(" ");
                                System.out.println("1.내린다");
                                System.out.println("2.타고있는다.");

                                while (true) {

                                    int q4 = scanner.nextInt();

                                    if (q4 == 1) {

                                        System.out.println("내리시면 안되여....");


                                    } else if (q4 == 2) {


                                        String busStats_q4 = bus.statusChange("차고지행");
                                        int changedFuel_q4 = bus.AddFuelChange(10);

                                        System.out.println("기사님이 기름이 없어서 차고지에 들러 기름을 넣고 있습니다.");
                                        System.out.println("당신은 무엇을 하시겠습니까?");
                                        System.out.println(" ");
                                        System.out.println("버스상태: " + busStats_q4 + " 탑승객수: " + addpass_q2 + " 잔여 승객수: " + leftpass_q2);
                                        System.out.println("버스요금: " + countBusFee_q2 + " 연료량: " + changedFuel_q4);
                                        System.out.println(" ");
                                        System.out.println("1. 잠깐 기지개를 편다");
                                        System.out.println("2. 항해 99 강의를 듣는다.");

                                        while (true){

                                            int q5 = scanner.nextInt();
                                            
                                            if (q5== 1){

                                                System.out.println("르탄이가 기지개를 폅니다.");
                                                System.out.println("2번을 선택해 주세요");
                                                
                                            }else if (q5==2){

                                                System.out.println(" ");
                                                System.out.println(" ");
                                                System.out.println(" ");
                                                System.out.println(" ");
                                                System.out.println(" ");
                                                System.out.println("르탄이가 강의를 듣는와중에 버스가 차고지에서 출발했습니다.");
                                                System.out.println(" ");
                                                System.out.println(" ");
                                                System.out.println(" ");
                                                System.out.println(" ");
                                                System.out.println(" ");

                                                String busStats_q5 = bus.statusChange("운행중");
                                                int now_pass_q5 = bus.addPassenger(45);
                                                bus.busPassAlert(now_pass_q5);

                                                int leftpass_q5 = bus.leftPassenger(now_pass_q5);
                                                String bus_alert = bus.getAlert_bus();


                                                System.out.println("버스가 항해 2달차 에 정차하였습니다. 번화가라서 많은 사람이 버스에 탑니다.");
                                                System.out.println("당신은 무엇을 하시겠습니까?");

                                                System.out.println("버스상태: " + busStats_q5 + " 탑승객수: " + now_pass_q5 + " 잔여 승객수: " + leftpass_q5);
                                                System.out.println("연료량: " + changedFuel_q4);
                                                System.out.println("얼럿 : " + bus_alert);
                                                System.out.println(" ");
                                                System.out.println("1. 내린다");
                                                System.out.println("2. 내리지 않는다");

//**************************************************************************
//**************************************************************************
//*********************************Q7***************************************
                                                while (true) {
                                                    int q6 = scanner.nextInt();
                                                    if (q6 == 1) {
                                                        System.out.println("아직 내리실 때가 아닙니다!조금만 더 파이팅!");

                                                    } else if (q6 == 2) {
//                                                        System.out.println("다음 정류장으로 이동합니다.");
                                                        bus.setFee(5000);
                                                        //bus.setNowPassengers(5);
                                                        //System.out.println("탑승 승객 수: " + bus.getNowPassengers() + "  잔여 승객 수: " + (bus.leftPassenger(5))+"  요금: " + (bus.getFee()));
//                                                        System.out.println("=========================================================");
                                                        System.out.println(" ");
                                                        System.out.println("Q7. 버스가 항해 3달차 정류장에 정차하였습니다. 번화가라서 많은 사람이 내립니다.");
                                                        System.out.println("내리시겠습니까?" );

                                                        bus.setFuelStatus(60);
                                                        bus.setNowPassengers(5);
                                                        System.out.println("버스 상태: "+ bus.getStatus()+"  탑승 승객수: " + bus.getNowPassengers()+"  잔여 숭객수: " + bus.leftPassenger(5)+"  연료량: " + bus.getFuelStatus());
                                                        System.out.println("요금: " + bus.getFee());



//                                                        System.out.println("얼럿 : "+ bus.getAlert_bus());
                                                        System.out.println(" ");
                                                        System.out.println("1. 내린다");
                                                        System.out.println("2. 내리지 않는다.");


                                                        while (true){
                                                            int q7 = scanner.nextInt();
                                                            if(q7==1){
                                                                System.out.println("조금만 더 가면 목적지에요!");

                                                            }
                                                            else if(q7==2){
//                                                                System.out.println("----------\n");
//                                                                System.out.println("다음 정류장으로 이동합니다.");
//                                                                System.out.println("버스 상태: 차고지 행"+"연료량: " + bus.fuelChanged(115));
//                                                                System.out.println("=========================================================");


//*********************************Q8***************************************
//*********************************Q8***************************************

                                                                System.out.println("Q8. 항해99버스가 드디어 목적지에 도착하였습니다.\n" +
                                                                        "이 버스는 당신의 열정을 연료로 굴러갔습니다!" +
                                                                        "앞으로도 당신의 앞날에 무한한 영광이 함께하길!\n");
                                                                System.out.println("=========================================\n");
                                                                System.out.println("Congratulation!");
                                                                bus.setFuelStatus(5);
                                                                System.out.println("버스 상태: 차고지 행" + "  잔여 승객 수: " + (bus.leftPassenger(0))+"  연료량:  " + bus.getFuelStatus());
                                                                bus.busFuelAlert(5);
                                                                bus.statusChange(bus.getAlert_bus());
                                                                System.out.println("얼럿 : "+ bus.getAlert_bus());
                                                                System.exit(0);


                                                            }else{
                                                                break;
                                                            }
                                                            continue;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                    continue;
                                                }
                                            }
                                        }
//**************************************************************************

                                    }

                                }


                            } else if (q3 == 3) {

                                System.out.println("르탄이가 과음을 지르자 기사님이 놀라셔서 중앙선 침범으로 사고가 났습니다.");
                                System.out.println("결국 르탄이는 병원에 갔습니다.");
                                // 자바 메서드 완전종료하는 메서드
                                System.out.println("다른 번호를 눌러봐요!");


                            } else if (q3 == 4) {
                                System.out.println("르탄이가 노래를 부르다가 머리를 박고 쓰러져서 병원에 갔습니다.");
                                System.out.println("다른 번호를 눌러봐요!");

                            } else {

                                System.out.println("정확한 선택지를 입력해주세요.");

                            }


                        }

                    } else if (q2 == 2) {

                        System.out.println("항훼 99로가는 버스였습니다. 르탄이는 결국 행방불명되었습니다.");
                        // 자바 메서드 완전종료하는 메서드
                        System.exit(0);

                    } else {

                        System.out.println("1,2번 중에 선택해주세요");

                    }

                }


            } else if (q1 == 2) {
                // 택시 부분
                // 택시를 선택했을 때 동작하는 기능
                // 택시 객체 생성
                // 택시 넘버 4자리 랜덤 생성
                // 현재 상태 및 연료량 체크
                System.out.println("===========================================");
                Texi texi = new Texi();
                Texi texi2 = new Texi();

                texi.setTrans_Num(2);
                texi2.setTrans_Num(1);
                texi.setTotal(5000);
                int total_list = texi.getTotal();
                texi.setTotal(15000);
                int totals = texi.getTotal();
                arrayList.add(total_list);
                arrayList.add(totals);
                System.out.println("생성된 택시 번호" + texi.getTrans_Num());
                System.out.println("또 다른 택시 번호" + texi2.getTrans_Num());
                System.out.println(texi.getStatus());
                System.out.println("현재 연료량" + texi.getFuelStatus());



                System.out.println("Q2. 카카오 택시가 잡혔습니다. 항해99 서울역 지점에 팀원을 한명을 데려다 줘야합니다. 어디로 가시겠습니까?\n" +
                        "1. 선택지 서울역 지점\n" +
                        "2. 선택지 용산역 지점");



                while (true) {
                    int q2_taxi = scanner.nextInt();

                    if (q2_taxi == 1) {

                        texi.setDeparture("서울역");
                        texi.setDeparture_distance(2);
                        texi.setNowPassengers(2);
                        texi.setMaxPassengers(5);
                        texi.setDistancePer_price(1000);
                        texi.setTotalPrice(texi.getDeparture_distance());
                        texi.setStatus("운행중");


                        System.out.println("탑승 승객 수 : " + texi.getNowPassengers());
                        System.out.println("잔여 승객 수 : " + (texi.getMaxPassengers() - texi.getNowPassengers()));
                        System.out.println("기본 요금 : " + texi.getBasic_price());
                        System.out.println("목적지 : " + texi.getDeparture());
                        System.out.println("목적지 까지 거리 : " + texi.getDeparture_distance());
                        System.out.println("목적지 까지 요금 : " + texi.getTotalPrice());
                        System.out.println("택시 상태 : " + texi.getStatus());
                        System.out.println("택시 연료 상태 : " + texi.getFuelStatus());
                        System.out.println("===========================================");

                        System.out.println("Q3. 항해99 서울역지점에 도착하여 하였습니다.\n" +
                                "당신은 어떻게 결제 하시겠습니까?\n" +
                                "택시 상태 : " + texi.getStatus() + "\n" +
                                "누적요금 : " + arrayList.get(0));
                        System.out.println("1. 현금으로 요금을 지불해 드린다.\n" +
                                "2. 카드로 요금을 지불해 드린다.\n" +
                                "3.자동 결제인데요?");
                        while (true) {
                            int q3_taxi = scanner.nextInt();
                            if (q3_taxi == 1 | q3_taxi == 2 | q3_taxi == 3) {

                                System.out.println("결제 완료");
                                System.out.println("===========================================");
                                System.out.println("서울역 지점 다른  팀원들을 태우고 구로디지털 단지 지점 에 가기위해\n" +
                                        "탑승하려고 하니 5명이나 되네요?");
                                System.out.println("택시 상태 : " + texi.getStatus());
                                System.out.println("택시 연료 : " + texi.getFuelStatus());

                                System.out.println("ㅡㅡ현재 승객 상태 인원초과");
                                //알림창 구현은 콘솔창에 프린트 하면 되는걸로 취급

                                System.out.println("\n" +
                                        "1. 5명중 팀원 2명만 같이 간다.\n" +
                                        "2. 내리고 같이 버스를 탄다.");

                                while (true) {
                                    int q4_taxi = scanner.nextInt();
                                    if (q4_taxi == 1) {
                                        System.out.println("===========================================");
                                        texi.setNowPassengers(3);
                                        texi.setDeparture("구로디지털 단지역");
                                        texi.setDeparture_distance(12);
                                        texi.setTotalPrice(texi.getDeparture_distance());
                                        texi.setFuelStatus(-20);

                                        System.out.println("어쩔 수 없이 나포함 3명만 택시를 타고 나머지 팀원은 버스 를\n" +
                                                "타기로 하였다. \n" +
                                                "다른 팀원들과 버스를 타고 가시겠습니까?\n" +
                                                "아니면 택시를 타고 가시겠습니까?");
                                        System.out.println("탑승 승객 수 : " + texi.getNowPassengers());
                                        System.out.println("잔여 승객 수 : " + 1);
                                        System.out.println("기본 요금 : " + texi.getBasic_price());
                                        System.out.println("목적지 : " + texi.getDeparture());
                                        System.out.println("목적지 까지 거리 : " + texi.getDeparture_distance());
                                        System.out.println("현재 요금 : " + + arrayList.get(1));
                                        System.out.println("목적지 까지 요금 : " + texi.getTotalPrice());
                                        System.out.println("현재 연료량 : " + texi.getFuelStatus());

                                        System.out.println("\n 1.다른팀원들과 함꼐 버스를 타고 간다.\n" +
                                                "2. 3명만 택시를 타고 간다.");

                                        while (true) {
                                            int q5_taxi = scanner.nextInt();

                                            if (q5_taxi == 1 | q5_taxi ==2) {
                                                System.out.println("먼저가서 팀원들과 과제하고 있죠! ^^ \n" );
                                                texi.setTrans_Num(1);
                                                texi2.setTrans_Num(2);

                                            }
                                            System.out.println("===========================================");
                                            System.out.println("Q. 속도를 선택해주세요\n"+
                                                    "1. 50\n"+ "2. 100\n");

                                            while (true) {
                                                int q6_taxi = scanner.nextInt();
                                                if ( 1 <= q6_taxi && q6_taxi <= 100 ) {

                                                    texi.setSpeed(q6_taxi);
                                                    System.out.println(texi.getSpeed());


                                                    System.out.println("===========================================");
                                                    System.out.println("항해99 구로디지털단지 지점에 도착하여 하였습니다.\n" +
                                                            "당신은 어떻게 결제 하시겠습니까?");
                                                    System.out.println("택시 연료 : " + texi.getFuelStatus());
                                                    System.out.println("누적 요금 : " + texi.getFee());

                                                    System.out.println("\n 1. 현금으로 요금을 지불해 드린다."
                                                            + "\n 2.카드로 요금을 지불해 드린다."+
                                                            "\n 3.자동결제 인데요?");

                                                }
                                                while(true){
                                                    int q7_taxi = scanner.nextInt();
                                                    if ( q7_taxi == 1 | q7_taxi == 2 | q7_taxi == 3){
                                                        System.out.println("===========================================");

                                                        System.out.println("항해99 구로디지털 단지 역에 도착하였습니다. " +
                                                                "드디어 도착지에 왔네요 수고하셨습니다");
                                                        System.out.println("요금결제 완료!");
                                                        texi.setFuelStatus(0);
                                                        System.out.println("주유량 : " + texi.getFuelStatus());
                                                        System.out.println("상태 : 운행불가 ");





                                                        //System.out.println("누적요금 : " + total_list+totals);


//
//                                                        System.out.println(arrayList);

                                                        int sum = 0;
                                                        for(int i =0; i < arrayList.size(); i++){

                                                            sum = sum + arrayList.get(i);
                                                            //  System.out.println(arrayList.get(i));
                                                        }
                                                        System.out.println("누적요금 : "+sum);

                                                        System.out.println("주유필요");

                                                        System.out.println("1. 수고하셨습니다.");



                                                    }
                                                }



//                                                    texi.setTrans_Num(1);
//                                                    System.out.println("기본 요금 : " + texi.getBasic_price());
//                                                    System.out.println("추가 요금 : " + texi.getBasic_maxprice());
//                                                    System.out.println("현재 요금 : " + texi.getBasic_price() +texi.getBasic_maxprice() );
//                                                    System.out.println("목적지 : " + texi.getDeparture());
//
//                                                    System.out.println("기존 목적지 까지 거리 : " + texi.getDeparture_distance() + " km ");
//                                                    System.out.println("감소된 목적지 까지 거리 : "+  texi.getDeparture_mindistance() + "km" );



                                            }

                                        }
                                    }

                                }
                            }
                        }
                    }else if(q2_taxi == 2){

                        System.out.println("옳바른 경로가 아닙니다.");


                    }
                }




            } else {

                System.out.println("1,2번중에 선택해주세요");


            }

        }


    }

}
