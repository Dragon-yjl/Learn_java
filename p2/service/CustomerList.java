package p2.service;

import p2.bean.Customer;
import sun.util.resources.cldr.aa.CurrencyNames_aa;

/**
 * CustomerList为Customer对象的管理模块，内部用数组管理一组Customer对象
 * 并提供相应的添加，修改，删除和遍历方法，供CustomerView调用
 */
public class CustomerList {

    private Customer[] customers;//用来保存客户对象的数组
    private int total = 0;//记录以保存客户对象的数量

/*
用来初始化customer数组的构造器
totalCustomer指定数组的长度
 */
    public CustomerList(int totalCustomer){

        customers = new Customer[totalCustomer];
    }

    /*
    将指定的客户添加到数组中
    return true 添加成功  return false 添加失败
     */
    public boolean addCustomer(Customer  customer){

        if(total >= customers.length){
            return false;
        }
//        customers[total] = customer;
//        total++;
//         或者
        customers[total++] = customer;
        return true;
    }

    /*
    修改指定索引位置上的客户信息
    return true 修改成功 false 修改失败
     */
    public boolean replaceCustomer(int index, Customer cust){

        if(index < 0 || index >= total ){
            return false;
        }

        customers[index] = cust;
        return true;

    }

    /*
    删除索引位置上客户的信息
    return true 删除成功 false 删除失败
     */
    public boolean deleteCustomer(int index){

        if(index < 0 || index >= total ){
            return false;
        }
        for(int i = index;i<total -1;i++){
            customers[i] = customers[i+1];
        }

        //最后一个有数据的元素要置空null
//        customers[total -1] = null;
//        total--;
        //或者
        customers[--total] = null;//先-1再--
        return true;

    }

    /*
    获取所有客户的信息
     */
    public Customer[] getAllCustomer(){

        Customer[] custs = new Customer[total];
        for (int i = 0; i <total ; i++) {
            custs[i] = customers[i];

        }
        return custs;
    }

    /**
     * 获取指定索引位置上的客户
     * @param index
     * @return 如果找到了元素则返回，如果没有找到，则返回null
     */
    public Customer getCustomer(int index){

        if(index < 0 || index >= total){
            return null;
        }
        return customers[index];
    }

    /**
     * 获取存储客户的数量
     * @return
     */
    public int getTotal(){
        return total;
        //return customers.length;//错误的

    }
}
