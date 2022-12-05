package creationaldesignpattern.factorydesignmethod;



class DomesticPlan extends Plan {
    @Override
    void getRate() {
        rate=4.5;
    }
}
class CommercialPlan extends Plan{
    @Override
    void getRate() {
        rate=5.5;
    }


}
class InstitutionalPlan extends Plan{
    @Override
    void getRate() {
        rate=6.5;
    }
}
