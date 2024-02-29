/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        Car firstCar = new Car();
        Car muscleCar = new Car("Pontiac", "GTO");

        System.out.println("Hello Remote World!");
        System.out.println("First Car is: " + firstCar.make + "," + firstCar.model);
        System.out.println("MuscleCar Car is: " + muscleCar.make + "," + muscleCar.model);
    }
}
