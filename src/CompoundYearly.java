public class CompoundYearly implements Compounder{
    int costOfItem;
    int annualRate;
    int year;

    public CompoundYearly(int costOfItem, int annualRate, int year) {
        this.costOfItem = costOfItem;
        this.annualRate = annualRate;
        this.year = year;
    }

    @Override
    public double totalInvestmentValue() {
        return costOfItem * Math.pow(1 + (annualRate / 100.0F), year);
    }

    @Override
    public double totalInvestmentValueForCouple() {
        return totalInvestmentValue() * 2;
    }

    @Override
    public double contributedAmmount() {
        return costOfItem;
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
