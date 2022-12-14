package com.greatlearning.skyscraper;

import com.greatlearning.skyscraper.entity.Floor;
import com.greatlearning.skyscraper.service.FloorAssemblingOrderService;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the total no of floors in the building");

        int n = sc.nextInt();

        Floor[] floorArray = new Floor[n];
        Stack<Floor> floorStack = new Stack<Floor>();
        PriorityQueue<Floor> floorPriorityQueue = new PriorityQueue<>((a, b) -> b.getSize()-a.getSize());

        for(int i = 0; i<n; ++i) {
            System.out.println(String.format("enter the floor size given on day : [%d]", i+1));
            int floorSize = sc.nextInt();
            floorArray[i] = new Floor(floorSize);
            floorPriorityQueue.add(floorArray[i]);
        }

        FloorAssemblingOrderService floorAssemblingOrderService = new FloorAssemblingOrderService(floorArray, floorStack, floorPriorityQueue);

        floorAssemblingOrderService.printFloorAssemblingOrder();

    }
}
