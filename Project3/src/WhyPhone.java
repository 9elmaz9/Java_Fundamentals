public class WhyPhone extends SmartPhone{

    private String COLOR;

    public WhyPhone(double PRISE, String BRAND,String COLOR) {
        super(PRISE,BRAND);
        this.COLOR=COLOR;

    }

    public String getCOLOR() {
        return COLOR;
    }

}

