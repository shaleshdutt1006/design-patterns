package creationaldesignpattern.factorydesignmethod;

public class GetPlanFactory {
    public Plan getPlan(String plantype) {
        if (plantype == null) {
            return null;
        } else if (plantype.equalsIgnoreCase("DomesticPlan")) {
            return new DomesticPlan();

        } else if(plantype.equalsIgnoreCase("COMMERCIALPLAN")){
            return new CommercialPlan();
        }
        else if(plantype.equalsIgnoreCase("InstitutionalPlan")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}
