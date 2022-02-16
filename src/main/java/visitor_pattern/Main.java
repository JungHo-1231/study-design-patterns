package visitor_pattern;

import visitor_pattern.benefit.Benefit;
import visitor_pattern.benefit.DiscountBenefit;
import visitor_pattern.benefit.FreeRentBenefit;
import visitor_pattern.benefit.PointBenefit;
import visitor_pattern.member.GoldMember;
import visitor_pattern.member.Member;
import visitor_pattern.member.VipMember;

public class Main {
    public static void main(String[] args) {
        Member goldMember = new GoldMember();
        Member vipMember = new VipMember();

        Benefit pointBenefit = new PointBenefit();
        Benefit discountBenefit = new DiscountBenefit();
        Benefit freeRentBenefit = new FreeRentBenefit();

        goldMember.getBenefit(pointBenefit);
        vipMember.getBenefit(pointBenefit);

        goldMember.getBenefit(discountBenefit);
        vipMember.getBenefit(discountBenefit);

        goldMember.getBenefit(freeRentBenefit);
        vipMember.getBenefit(freeRentBenefit);
    }
}
