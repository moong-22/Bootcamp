package data1;

import java.util.ArrayList;

public class DataEx02 {
    public static void main(String[] args) {
        ArrayList<String> data1 = new ArrayList<>();
        data1.add("1"); data1.add("홍길동"); data1.add("010-111-1111"); data1.add("20"); data1.add("서울시");

        ArrayList<String> data2 = new ArrayList<>();
        data2.add("2"); data2.add("박문수"); data2.add("010-222-2222"); data2.add("22"); data2.add("경기도");

        ArrayList<String> data3 = new ArrayList<>();
        data3.add("3"); data3.add("홍길동"); data3.add("010-333-3333"); data3.add("25"); data3.add("강원도");

        ArrayList<ArrayList<String>> datas = new ArrayList<ArrayList<String>>();

        datas.add(data1); datas.add(data2); datas.add(data3);

        System.out.println(datas);
    }
}
