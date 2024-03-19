package com.example.demo.entities.enums;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    private OrderStatus(int code){
        this.code = code;
    }
    public int getCode(){
        return this.code;
    }
    public static OrderStatus valueOf(int code){
        for(OrderStatus cadaOrder: OrderStatus.values()){
            if(cadaOrder.getCode()==code){
                return cadaOrder;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }
}
