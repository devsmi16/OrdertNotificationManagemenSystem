class EmailNotificationListener implements NotificationListener{

    @Override
    public void onStatusChange(Order order) {
        System.out.println("Email notification sent for Order Id: " + " " + order.getOrderId() +
        "New Status: " + " " + order.getStatus());

    }
}
