public class BonusMilesService {
    public int calculate(int price) {
        int costBonus = 20;
        int bonusMiles = price / costBonus;
        return bonusMiles;
    }
}
