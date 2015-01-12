/**
 * @(#)proto, 2015-01-13. Copyright (c) 2013, Wandou Labs and/or its
 *                     affiliates. All rights reserved. WANDOU LABS
 *                     PROPRIETARY/CONFIDENTIAL. Use is subject to license
 *                     terms.
 */
package me.zhuliangliang.proto;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Liangliang ZHU <zhuliangliang@wandoujia.com>
 */
public class TestPersonModel {

    @Test
    public void testProto() {
        PersonModel.Person person = PersonModel.Person.newBuilder()
                .setId(100).setName("zhuliangliang").setEmail("zhuliangliang.me@gmail.com").build();
        System.out.println(person);
        Assert.assertEquals(100, person.getId());
    }
}
