package client;

import servicesource.*;

public class SampleClient {

    public static void main(String[] args) {
        CalculatorImplService calculateServiceRef = new CalculatorImplService();
        CalculatorImpl calculateService = calculateServiceRef.getCalculatorImplPort();
        System.out.println("Server Said: " + calculateService.add(12.5, 12.5));
        System.out.println("Server Said: " + calculateService.sub(12.5, 10.5));
        System.out.println("Server Said: " + calculateService.mul(12.5, 12.5));
        System.out.println("Server Said: " + calculateService.div(144, 14.5));
    }

}