public class AppleStockCount {
  public static void main(String[] args) {

    if (args.length == 0) {
        System.out.println("Please give me a qty!");
        return;
    }

    int qty = Integer.parseInt(args[0]);
    double cost = 4.50;
    double total;

    if (qty < 1) {
        System.out.println("Out of stock.");
    }
    else {
      total = qty * cost;

      StringBuilder message = new StringBuilder();
      message.append("You have bought ");
      if (qty % 12 == 0){
          message.append(qty / 12);
          message.append(" dozens of apples for a total cost of ");
          message.append(total);
          message.append(".");
          return;
         }
     else if (qty % 6 == 0){
          message.append(qty / 6);
          message.append(" half a dozen of apples for a total cost of ");
          message.append(total);
          message.append(".");
          return;
         }
      message.append(qty);
      message.append(" apple");
      if (qty > 1) {
        message.append("s");
      }
      message.append(" for a total cost of ");
      message.append(total);
      message.append(".");

      System.out.println(message.toString());

    }


  }
}
