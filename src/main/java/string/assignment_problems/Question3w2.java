package string.assignment_problems;

public class Question3w2 {

    static void parseInventoryRecord(String csvLine) {
        String[] data = csvLine.split(",");

        if (data.length != 3) {
            System.out.println("Invalid Record");
        } else {
            System.out.println("Product: " + data[0] +
                    " | SKU: " + data[1] +
                    " | Qty: " + data[2]);
        }
    }

    public static void main(String[] args) {
        parseInventoryRecord("Wireless Mouse,WM-2201,150");
        parseInventoryRecord("Wireless Mouse,150");
    }
}
