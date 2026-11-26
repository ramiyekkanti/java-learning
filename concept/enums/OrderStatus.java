package concept.enums;

public enum OrderStatus {
    PLACED,
    PACKED,
    SHIPPED,
    DELIVERED,
    CANCELLED;

    public boolean canMoveTo(OrderStatus nextStatus){
        if(nextStatus == null) return false;

        return switch(this){
            case PLACED -> nextStatus == PACKED || nextStatus == CANCELLED;
            case PACKED -> nextStatus == SHIPPED || nextStatus == CANCELLED;
            case SHIPPED -> nextStatus == DELIVERED;
            case DELIVERED,CANCELLED -> false;
        };
    }
}
