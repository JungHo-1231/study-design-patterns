package visitor_pattern.benefit;

import visitor_pattern.member.GoldMember;
import visitor_pattern.member.VipMember;

public interface Benefit {
    void getBenefit(GoldMember member);
    void getBenefit(VipMember member);
}
