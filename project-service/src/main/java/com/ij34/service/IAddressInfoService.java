package com.ij34.service;


import com.ij34.model.AddressInfo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lyx
 * @since 2021-05-30
 */
public interface IAddressInfoService {

    List<AddressInfo> select(AddressInfo record);

    AddressInfo insert(AddressInfo record);
}
