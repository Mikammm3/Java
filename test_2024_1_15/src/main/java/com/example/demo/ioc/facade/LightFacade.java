package com.example.demo.ioc.facade;

public class LightFacade {
    LivingRoomLight livingRoomLight = new LivingRoomLight();
    BedRoomLight bedRoomLight = new BedRoomLight();
    HallLight hallLight = new HallLight();

    // 打开所有灯
    void on() {
        livingRoomLight.on();
        bedRoomLight.on();
        hallLight.on();
    }

    // 关闭所有灯
    void off() {
        livingRoomLight.off();
        bedRoomLight.off();
        hallLight.off();
    }
}
