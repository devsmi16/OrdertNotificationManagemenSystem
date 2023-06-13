public class OrderNotificationManagementSystem {
    public static void main(String[] args){
        Order order = new Order(1);

        EmailNotificationListener emailNotificationListener = new EmailNotificationListener();
        order.addNotificationListener(emailNotificationListener);

        SMSNotificationListener smsNotificationListener = new SMSNotificationListener();
        order.addNotificationListener(smsNotificationListener);

        order.setStatus("Processing");
        order.setStatus("Shipped");
    }
}
