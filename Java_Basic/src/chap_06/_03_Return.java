package chap_06;

public class _03_Return {
    public static String getPhoneNumber(){
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }

    public static String getAddress(){
        return "서울 어딘가";
    }

    public static String getActivities(){
        return "볼링장, 탁구장, 노래방";
    }
    public static void main(String[] args) {

        String phoneNumber = getPhoneNumber();
        System.out.println(phoneNumber);

        String address = getAddress();
        System.out.println(address);

        System.out.println(getActivities());
    }
}
