package concept.enums;

public class EnumPractice {
    public static void main(String[] args){
        
        // Size Enum
        for(Size v : Size.values()){
            System.out.println(v + ": " + v.getPrice());
        }
        System.out.println(Size.valueOf("MEDIUM").ordinal());
        System.out.println(Size.LARGE == Size.valueOf("LARGE"));
        try{
            Size.valueOf("HUGE");
        }catch (IllegalArgumentException e){
            System.out.println("No such size");
        }
        System.out.println();

        // Day Enum
        for(Day d : Day.values()){
            System.out.println(d + ": " + plan(d) + " (weekend: " + d.isWeekend() + ")");
        }
        System.out.println();

        System.out.println("PLACED -> PACKED: " + OrderStatus.PLACED.canMoveTo(OrderStatus.PACKED));
        System.out.println("PLACED -> SHIPPED: " + OrderStatus.PLACED.canMoveTo(OrderStatus.SHIPPED));
        System.out.println("PACKED -> CANCELLED: " + OrderStatus.PACKED.canMoveTo(OrderStatus.CANCELLED));
        System.out.println("SHIPPED -> CANCELLED: " + OrderStatus.SHIPPED.canMoveTo(OrderStatus.CANCELLED));
        System.out.println("DELIVERED -> PLACED: " + OrderStatus.DELIVERED.canMoveTo(OrderStatus.PLACED));
    }

    // Methods
    public static String plan(Day d){
        return switch(d){
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Work";
            case SATURDAY -> "Rest";
            case SUNDAY -> "Family";
        };
    }
}
