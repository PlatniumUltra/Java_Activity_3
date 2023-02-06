public class SimpleInterestCalculator {
    double principalAmount;
    int numberOfYears;

    SimpleInterestCalculator(double principalAmount,int numberOfYears ){
        this.principalAmount = principalAmount;
        this.numberOfYears = numberOfYears;
    }
    public void calculateSimpleInterest(){
        double simpleInterest ;

        if (principalAmount > 1){
            if (numberOfYears > 10){
                simpleInterest  =  (principalAmount * numberOfYears * 10)/100;
            } else {
                simpleInterest  =  (principalAmount * numberOfYears * 9.5)/100;
            }
        } else {
            if (numberOfYears > 10){
                simpleInterest  =  (principalAmount * numberOfYears * 5)/100;
            } else {
                simpleInterest  =  (principalAmount * numberOfYears * 4.5)/100;
            }
        }

        System.out.println("The interest amount for a principal of "+principalAmount+" and years "+numberOfYears+"+ is  "+simpleInterest );
    }


    public static void main(String arg[]){
        SimpleInterestCalculator test1 = new SimpleInterestCalculator(200000 , 12);
        test1.calculateSimpleInterest();

        SimpleInterestCalculator test2 = new SimpleInterestCalculator(12   , 12);
        test2.calculateSimpleInterest();

        SimpleInterestCalculator test3 = new SimpleInterestCalculator(50000  , 5);
        test3.calculateSimpleInterest();
    }
}
