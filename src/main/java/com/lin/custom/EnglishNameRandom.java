package com.lin.custom;

import com.lin.random.RandomData;
import com.lin.utils.RandomUtils;

/**
 * 英文名随机生成器
 * @author lkmc2
 * @since 1.0.0
 */
public class EnglishNameRandom implements RandomData<String> {
    // 候选值数组，从该数组中随机抽一个作为返回值
    private static final String[] names = {"Kim Lily", "Andy Wang", "July Six"};

    @Override
    public String next() {
        // 从数组中随机选取一个值
        return RandomUtils.selectOneInArray(names);
    }
}
