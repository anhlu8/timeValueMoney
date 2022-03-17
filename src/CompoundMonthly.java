public class CompoundMonthly implements Compounder{
    private final int MONTH = 12;
    private final int DAYSINAMONTH = 30;
    int costOfItem;
    int annualRate;
    int year;

    public CompoundMonthly(int costOfItem, int annualRate, int year) {
        this.costOfItem = costOfItem;
        this.annualRate = annualRate;
        this.year = year;
    }

    @Override
    public double totalInvestmentValue() {
        double costOfItemPerMonth = costOfItem * DAYSINAMONTH;
        int numberOfMonths = year * MONTH;
        double monthlyInterestRate = ((annualRate/100.0F) / MONTH);
        return costOfItemPerMonth * (Math.pow((1 + monthlyInterestRate), numberOfMonths) - 1) / monthlyInterestRate;
    }

    @Override
    public double totalInvestmentValueForCouple() {
        return totalInvestmentValue() * 2;
    }

    @Override
    public double contributedAmmount() {
        double costOfItemPerMonth = costOfItem * DAYSINAMONTH;
        int numberOfMonths = year * MONTH;
        return costOfItemPerMonth * numberOfMonths;
    }

    @Override
    public double contributedAmmountForCouple() {
        return contributedAmmount() * 2;
    }

    @Override
    public double profit() {
        return totalInvestmentValue() - contributedAmmount();
    }

    @Override
    public double profitForCouple() {
        return profit() * 2;
    }
}
