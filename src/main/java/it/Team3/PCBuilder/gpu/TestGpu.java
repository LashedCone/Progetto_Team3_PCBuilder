package it.Team3.PCBuilder.gpu;

import java.util.ArrayList;

public class TestGpu {
    public static void main(String[] args) {
        GpuList gpuList = new GpuList();
        ArrayList<Gpu> gpuArrayList = gpuList.getGpuList();
        for(Gpu gpu : gpuArrayList) {
            if(gpu.getChipset().equals("GeForce RTX 4080")) {
                System.out.println(gpu.toString());
            }
        }
    }
}
