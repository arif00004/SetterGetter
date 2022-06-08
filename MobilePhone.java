public class MobilePhone {
    private String brandName;
    private String color;
    private int modelNo;

    public void setName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setColor(String Color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }

    public void getModelNo() {
        if (modelNo < 25 || modelNo > 50) {
            System.out.println(this.modelNo = 0);
        } else {
            System.out.println(modelNo);
        }
    }

    public static void main(String[] args) {
        MobilePhone modelNo = new MobilePhone();

        modelNo.setModelNo(26);

        modelNo.getModelNo();
    }
}

