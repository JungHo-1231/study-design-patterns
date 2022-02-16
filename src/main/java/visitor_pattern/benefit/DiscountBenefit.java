package visitor_pattern.benefit;

import visitor_pattern.member.GoldMember;
import visitor_pattern.member.VipMember;

public class DiscountBenefit implements Benefit {

    @Override
    public void getBenefit(GoldMember member) {
        System.out.println("Discount for Gold Member");
    }

    @Override
    public void getBenefit(VipMember member) {
        System.out.println("Discount for Vip Member");
    }
}
