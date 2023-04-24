package com.mosey.ddd.order.domain.sdk.entity.objectvalue;

import java.io.Serializable;

/**
 * @author TangJie
 * @since 2023/4/19
 */
public class AddressOV implements Serializable {
    private static final long serialVersionUID = 3546709871608433298L;

    private String province;

    private String city;

    private String region;

    private String street;

    /**
     * 计算两个目的地需要耗时的时间
     * @param addressOV
     * @return
     */
    public TimeOV timeConsuming(AddressOV addressOV){
        //todo 通过计算得出耗时时间。
        return new TimeOV();
    }
}
