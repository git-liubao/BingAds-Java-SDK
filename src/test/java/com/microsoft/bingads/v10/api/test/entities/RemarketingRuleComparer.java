package com.microsoft.bingads.v10.api.test.entities;

import com.microsoft.bingads.v10.campaignmanagement.CustomEventsRule;
import com.microsoft.bingads.v10.campaignmanagement.PageVisitorsRule;
import com.microsoft.bingads.v10.campaignmanagement.PageVisitorsWhoDidNotVisitAnotherPageRule;
import com.microsoft.bingads.v10.campaignmanagement.PageVisitorsWhoVisitedAnotherPageRule;
import com.microsoft.bingads.v10.campaignmanagement.RemarketingRule;

public class RemarketingRuleComparer implements EqualityComparerWithDescription<RemarketingRule> {

    public Boolean equals(RemarketingRule x, RemarketingRule y) {
    	if (x instanceof PageVisitorsRule && y instanceof PageVisitorsRule) {
    		PageVisitorsRuleComparer compare = new PageVisitorsRuleComparer();
    		return compare.equals(((PageVisitorsRule)x), ((PageVisitorsRule)y));
    	}
    	if (x instanceof PageVisitorsWhoVisitedAnotherPageRule && y instanceof PageVisitorsWhoVisitedAnotherPageRule) {
    		PageVisitorsWhoVisitedAnotherPageRuleComparer compare = new PageVisitorsWhoVisitedAnotherPageRuleComparer();
    		return compare.equals(((PageVisitorsWhoVisitedAnotherPageRule)x), ((PageVisitorsWhoVisitedAnotherPageRule)y));
    	}
    	if (x instanceof PageVisitorsWhoDidNotVisitAnotherPageRule && y instanceof PageVisitorsWhoDidNotVisitAnotherPageRule) {
    		PageVisitorsWhoDidNotVisitAnotherPageRuleComparer compare = new PageVisitorsWhoDidNotVisitAnotherPageRuleComparer();
    		return compare.equals(((PageVisitorsWhoDidNotVisitAnotherPageRule)x), ((PageVisitorsWhoDidNotVisitAnotherPageRule)y));
    	}
    	if (x instanceof CustomEventsRule && y instanceof CustomEventsRule) {
    		CustomEventsRuleComparer compare = new CustomEventsRuleComparer();
    		return compare.equals(((CustomEventsRule)x), ((CustomEventsRule)y));
    	}
		return false;
	} 
    
    public  String getDescription(RemarketingRule obj) {
    	if (obj instanceof PageVisitorsRule) {
    		PageVisitorsRuleComparer compare = new PageVisitorsRuleComparer();
    		return compare.getDescription(((PageVisitorsRule)obj));
    	}
    	if (obj instanceof PageVisitorsWhoVisitedAnotherPageRule) {
    		PageVisitorsWhoVisitedAnotherPageRuleComparer compare = new PageVisitorsWhoVisitedAnotherPageRuleComparer();
    		return compare.getDescription(((PageVisitorsWhoVisitedAnotherPageRule)obj));
    	}
    	if (obj instanceof PageVisitorsWhoDidNotVisitAnotherPageRule) {
    		PageVisitorsWhoDidNotVisitAnotherPageRuleComparer compare = new PageVisitorsWhoDidNotVisitAnotherPageRuleComparer();
    		return compare.getDescription(((PageVisitorsWhoDidNotVisitAnotherPageRule)obj));
    	}
    	if (obj instanceof CustomEventsRule) {
    		CustomEventsRuleComparer compare = new CustomEventsRuleComparer();
    		return compare.getDescription(((CustomEventsRule)obj));
    	}
		return null;
	}    
}
