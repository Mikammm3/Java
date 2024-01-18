package com.example.demo.ioc.facade;

public class FacadeDemo {
    public static void main(String[] args) {
        // 打开所有屋的灯
        LightFacade lightFacade = new LightFacade();
        lightFacade.on();
    }
}
