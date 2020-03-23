package service;

import javax.jws.*;
import javax.jws.soap.*;

@WebService
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT,parameterStyle=SOAPBinding.ParameterStyle.BARE)
public class CalculatorImpl {
     @WebMethod
    public double add(nums numRef) {
        return numRef.getNum1()+numRef.getNum2();
    }
    
    @WebMethod
    public double sub(nums numRef) {
        return numRef.getNum1()-numRef.getNum2();
    }
    @WebMethod
    public double mul(nums numRef) {
        return numRef.getNum1()*numRef.getNum2();
    }
    @WebMethod
    public double div (nums numRef) {
        return numRef.getNum1()/numRef.getNum2();
    }


}