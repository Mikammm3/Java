package com.mika.aop.proxy;

public class HouseProxy implements HouseSubject {
    private HouseSubject houseSubject;

    public HouseProxy(HouseSubject houseSubject) {
        this.houseSubject = houseSubject;
    }

    @Override
    public void rentHouse() {
        System.out.println("我是中介，我开始代理");
        houseSubject.rentHouse();
        System.out.println("我是中介，我结束代理");
    }

    @Override
    public void saleHouse() {
        System.out.println("我是中介，我开始代理");
        houseSubject.saleHouse();
        System.out.println("我是中介，我结束代理");
    }
}
