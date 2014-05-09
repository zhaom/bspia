package com.meidusa.demo.dal;

import com.meidusa.demo.dal.model.Product;
import com.meidusa.demo.dal.model.ProductExample;
import com.meidusa.demo.dal.model.ProductWithBLOBs;
import com.meidusa.toolkit.dal.ibator.AbstractDAO;
import java.util.List;

public interface ProductDAO extends AbstractDAO<Product, ProductExample> {
    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table product
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    int countByExample(ProductExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table product
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    int deleteByExample(ProductExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table product
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table product
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    void insert(ProductWithBLOBs record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table product
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    void insertSelective(ProductWithBLOBs record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table product
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    List<Product> selectByExampleWithBLOBs(ProductExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table product
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    List<Product> selectByExampleWithoutBLOBs(ProductExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table product
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    ProductWithBLOBs selectByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table product
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    int updateByExampleSelective(ProductWithBLOBs record, ProductExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table product
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    int updateByExample(ProductWithBLOBs record, ProductExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table product
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    int updateByExample(Product record, ProductExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table product
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    int updateByPrimaryKeySelective(ProductWithBLOBs record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table product
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    int updateByPrimaryKey(ProductWithBLOBs record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table product
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    int updateByPrimaryKey(Product record);
}