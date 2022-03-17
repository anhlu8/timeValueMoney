public class Main {
    public static void main(String[] args) {
        CompoundMonthly compound = new CompoundMonthly(3, 10, 15 );
        double totalInvestmentValue = compound.totalInvestmentValue();
        double totalInvestmentValueForCouple = compound.totalInvestmentValueForCouple();
        double contributedAmmount = compound.contributedAmmount();
        double contributedAmmountForCouple = compound.contributedAmmountForCouple();
        double profit = compound.profit();
        double profitForCouple = compound.profitForCouple();
        System.out.println(totalInvestmentValue);
        System.out.println(totalInvestmentValueForCouple);
        System.out.println(contributedAmmount);
        System.out.println(contributedAmmountForCouple);
        System.out.println(profit);
        System.out.println(profitForCouple);
    }
}

//TODO: Solve how Much Money Do I Need to Save Daily in Order to Have $1,000,000 in 35 years?"
//TODO: Spring, React, MongoDB, Sentry logs, CICD