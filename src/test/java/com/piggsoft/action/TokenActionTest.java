package com.piggsoft.action;

import com.alibaba.fastjson.JSON;
import com.piggsoft.action.exception.ValidateResultException;
import com.piggsoft.utils.factory.ActionFactoryUtils;
import org.junit.Test;

/**
 * Created by user on 2015/11/24.
 */
public class TokenActionTest {

    @Test
    public void test01() throws ValidateResultException {
        Object o = ActionFactoryUtils.getActionFactory().getTokenAction().action();
        System.out.println(JSON.toJSONString(o));
    }

}