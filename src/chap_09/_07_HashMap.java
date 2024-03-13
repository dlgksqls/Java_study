package chap_09;

import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // HashMap(key, value)
        HashMap<String, Integer> map = new HashMap<>();

        // 데이터 추가
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 16);

        System.out.println(map.size());
        System.out.println();

        // 조회
        System.out.println("유재석님의 포인트 : " + map.get("유재석"));
        System.out.println("박명수님의 포인트 : " + map.get("박명수"));

        // 확인
        if (map.containsKey("서장훈")){
            int point = map.get("서장훈");
            map.put("서장후", ++point);
            System.out.println("서장훈님의 누적 포인트 : " + map.get("서장훈"));
        }
        else{
            map.put("서장훈", 1);
            System.out.println("서장훈님 신규 등록 (포인트 1)");
        }

        // 삭제
        map.remove("유재석");
        System.out.println(map.get("유재석")); // null

        // 전체 삭제
        map.clear();
        if (map.isEmpty()){
            System.out.println("남은 고객 수 : " + map.size());
            System.out.println("가게 접자");
        }
        System.out.println();

        // 다시 고객들이 찾아옴
        // 데이터 추가
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 16);

        // key 확인
        for (String i : map.keySet())
            System.out.println(i);
        System.out.println();

        // value 확인
        for (int i : map.values())
            System.out.println(i); // 순서보장 하지 않기때문에 막 나옴
        System.out.println();

        // key & value 확인
        for(String key : map.keySet()){
            System.out.println("고객 이름 : " + key + " " + "포인트 : " + map.get(key));
        }
        System.out.println();

        // map : 순서 보장 x, 중복 허용 x
    }
}
