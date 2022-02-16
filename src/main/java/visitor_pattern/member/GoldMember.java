package visitor_pattern.member;

import visitor_pattern.benefit.Benefit;

public class GoldMember implements Member {
    @Override
    public void getBenefit(Benefit benefit) {
        benefit.getBenefit(this);
    }
}
