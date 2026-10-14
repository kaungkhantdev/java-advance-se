package com.astronity.designpattern.facade;

public class ComputerFacade {
    HardDisk hardDisk = new HardDisk();
    Cpu cpu = new Cpu();
    Memory memory = new Memory();

    void start() {
        hardDisk.readBootSector();
        memory.load();
        cpu.execute();
    }
}
