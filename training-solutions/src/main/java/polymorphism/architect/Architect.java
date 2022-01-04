package polymorphism.architect;

public class Architect {
    public static void main(String[] args) {
        Plan plan = new SketchPlan(5, "Cím");
        Plan plan2 = new PermitPlan(5, "Cím", "Béla", "XYZ 5");
        Plan plan3 = new ConstructionPlan(5, "Cím", "Béla", "XYZ 5", 76);

        SketchPlan sketchPlan = new SketchPlan(5, "Cím");
        SketchPlan sketchPlan2 = new PermitPlan(5, "Cím", "Béla", "XYZ 5");
        SketchPlan sketchPlan3 = new ConstructionPlan(5, "Cím", "Béla", "XYZ 5", 76);

        Header header = new PermitPlan(5, "Cím", "Béla", "XYZ 5");
        Header header2 = new ConstructionPlan(5, "Cím", "Béla", "XYZ 5", 76);

        PermitPlan permitPlan = new PermitPlan(5, "Cím", "Béla", "XYZ 5");
        PermitPlan permitPlan2 = new ConstructionPlan(5, "Cím", "Béla", "XYZ 5", 76);

        ConstructionPlan constructionPlan = new ConstructionPlan(5, "Cím", "Béla", "XYZ 5", 76);

        System.out.println(plan.getPagesOfDocumentation());
        System.out.println(plan2.getPagesOfDocumentation());
        System.out.println(plan3.getPagesOfDocumentation());

        System.out.println(sketchPlan.getPagesOfDocumentation());
        System.out.println(sketchPlan.getTitle());
        System.out.println(sketchPlan2.getTitle());
        System.out.println(sketchPlan2.getPagesOfDocumentation());
        System.out.println(sketchPlan3.getPagesOfDocumentation());
        System.out.println(sketchPlan3.getPagesOfDocumentation());

        System.out.println(header.getAddressOfBuilding());
        System.out.println(header.getNameOfClient());
        System.out.println(header2.getAddressOfBuilding());
        System.out.println(header2.getNameOfClient());

        System.out.println(permitPlan.getNameOfClient());
        System.out.println(permitPlan.getAddressOfBuilding());
        System.out.println(permitPlan.getPagesOfDocumentation());
        System.out.println(permitPlan.getTitle());
        System.out.println(permitPlan2.getNameOfClient());
        System.out.println(permitPlan2.getAddressOfBuilding());
        System.out.println(permitPlan2.getPagesOfDocumentation());
        System.out.println(permitPlan2.getTitle());

        System.out.println(constructionPlan.getSheetsOfConstructionDrawings());
        System.out.println(constructionPlan.getAddressOfBuilding());
        System.out.println(constructionPlan.getNameOfClient());
        System.out.println(constructionPlan.getTitle());
        System.out.println(constructionPlan.getPagesOfDocumentation());
    }
}