package chap_07;

public class BlackBoxRefubish { // 자바 파일명이랑 똑같아야함....
    public String modelName; // 모델 명 // 인스턴스 변수 // public 어디서든지 접근 가능
    String resolution; // 해상도 dafault = 같은 패키지 내에서만 접근 가능
    private int price; // 가격 private는 해당 클래스 안에서만 사용 가능
    protected String color; // 색상


    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution(){
        if (resolution == null || resolution.isEmpty())
            return "판매자에게 문의하세요.";
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 100000)
            this.price = 100000;
        else
            this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


