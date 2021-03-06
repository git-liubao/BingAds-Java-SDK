package com.microsoft.bingads.v10.api.test.entities.ad_group_dsa_target;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v10.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v10.bulk.entities.BulkAdGroupDynamicSearchAdTarget;
import com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterion;
import com.microsoft.bingads.v10.campaignmanagement.ArrayOfWebpageCondition;
import com.microsoft.bingads.v10.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v10.campaignmanagement.Webpage;
import com.microsoft.bingads.v10.campaignmanagement.WebpageCondition;
import com.microsoft.bingads.v10.campaignmanagement.WebpageConditionOperand;
import com.microsoft.bingads.v10.campaignmanagement.WebpageParameter;

import java.util.List;
import java.util.Map;

public abstract class BulkAdGroupDynamicSearchAdTargetTest extends BulkEntityTest<BulkAdGroupDynamicSearchAdTarget> {

    private static final String[] CONDITION = {"Category", "PageContent", "PageTitle", "Url"};
    private static final String VALUE_PREFIX = "Test Value ";

    @Override
    protected void onEntityCreation(BulkAdGroupDynamicSearchAdTarget entity) {
        Webpage webpage = new Webpage();
        webpage.setParameter(new WebpageParameter());
        webpage.setType("Webpage");

        AdGroupCriterion biddableAdGroupCriterion = new BiddableAdGroupCriterion();
        biddableAdGroupCriterion.setCriterion(webpage);

        entity.setAdGroupCriterion(biddableAdGroupCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkAdGroupDynamicSearchAdTarget, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkAdGroupDynamicSearchAdTarget>() {
                    @Override
                    public BulkAdGroupDynamicSearchAdTarget get() {
                        return new BulkAdGroupDynamicSearchAdTarget();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdGroupDynamicSearchAdTarget, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupDynamicSearchAdTarget>() {
                    @Override
                    public BulkAdGroupDynamicSearchAdTarget get() {
                        return new BulkAdGroupDynamicSearchAdTarget();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdGroupDynamicSearchAdTarget, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupDynamicSearchAdTarget>() {
                    @Override
                    public BulkAdGroupDynamicSearchAdTarget get() {
                        return new BulkAdGroupDynamicSearchAdTarget();
                    }
                }
        );
    }

    private static ArrayOfWebpageCondition generateWebpageConditionArray(int length) {
    	ArrayOfWebpageCondition arrayWebpageConditions = new ArrayOfWebpageCondition();
        List<WebpageCondition> webPageConditions = arrayWebpageConditions.getWebpageConditions();

        for (int i = 1; i <= length; i++) {
        	WebpageCondition webPageCondition = new WebpageCondition();
        	webPageCondition.setArgument(VALUE_PREFIX + i);
        	webPageCondition.setOperand(WebpageConditionOperand.fromValue(CONDITION[i%4]));
        	webPageConditions.add(webPageCondition);
        }

        return arrayWebpageConditions;
    }

    private static String[] generateInputArray(int length, String prefix) {
        String[] inputs = new String[length];

        for (int i = 1; i <= inputs.length; i++) {
            inputs[i - 1] = prefix + i;
        }

        return inputs;
    }
    
    private static String[] generateInputArray(int length, String[] prefix) {
        String[] inputs = new String[length];

        for (int i = 1; i <= inputs.length; i++) {
            inputs[i - 1] = prefix[i%4];
        }

        return inputs;
    }

    protected static Object[] generateTestData(int lengthWebpageCondition, int lengthConditions, int lengthValues) {
        ArrayOfWebpageCondition webpageConditions = generateWebpageConditionArray(lengthWebpageCondition);
        String[] conditions = generateInputArray(lengthConditions, CONDITION);
        String[] values = generateInputArray(lengthValues, VALUE_PREFIX);

        return new Object[]{null, webpageConditions, conditions, values};
    }
}
