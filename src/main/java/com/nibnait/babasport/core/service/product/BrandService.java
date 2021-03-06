package com.nibnait.babasport.core.service.product;

import com.nibnait.babasport.core.bean.product.Brand;
import com.nibnait.babasport.core.query.product.BrandQuery;
import com.nibnait.common.page.Pagination;

import java.util.List;

/**
 * Created by nibnait on 2016/5/4.
 */
public interface BrandService {

    public List<Brand> getBrandList(BrandQuery brandQuery);

    Pagination getBrandListWithPage(Brand brand);
    public void addBrand(Brand brand);

    //删除
    public void deleteBrandByKeys(Integer[] ids);
    public void deleteBrandByKey(Integer id);

    //修改
    public void updateBrandByKey(Brand brand);

    public Brand getBrandByKey(Integer id);
}
