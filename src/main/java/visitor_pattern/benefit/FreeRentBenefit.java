package visitor_pattern.benefit;

import visitor_pattern.member.GoldMember;
import visitor_pattern.member.VipMember;

public class FreeRentBenefit implements Benefit {
    @Override
    public void getBenefit(GoldMember member) {
        System.out.println("FreeRent for Cold Member");
    }

    @Override
    public void getBenefit(VipMember member) {
        System.out.println("FreeRent for Vip member");
    }
}
