public class FinancialForecast {

    //recursion method
    public static double predictFutureValue(double currentValue, double growthRate, int years){
        if(years==0){
            return currentValue;
        }
        //formula for calculation
        //future value = current value * (1+ growth rate)^n
        return predictFutureValue(currentValue*(1+growthRate), growthRate, years-1);//till years=0
    }
    public static void main(String[] args) {
        double startValue = 2000.0;
        double growthRate = 0.20;
        int years = 10;

        //recursion call
        double futureValue = predictFutureValue(startValue, growthRate, years);
        System.out.println("Future value after "+ years+ " years: "+ futureValue);
    }
}
