package polymorphism.architect;

public class PermitPlan extends SketchPlan implements Header {
    private String nameOfClient;
    private String addressOfBuilding;

    public PermitPlan(int pagesOfDocumentation, String title, String nameOfClient, String addressOfBuilding) {
        super(pagesOfDocumentation, title);
        this.nameOfClient = nameOfClient;
        this.addressOfBuilding = addressOfBuilding;
    }

    @Override
    public String getNameOfClient() {
        return null;
    }

    @Override
    public String getAddressOfBuilding() {
        return null;
    }
}
