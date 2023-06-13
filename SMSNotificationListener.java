class SMSNotificationListener implements NotificationListener{

    @Override
    public void onStatusChange(Order order) {
        System.out.println("SMS notification sent for Order ıd: " + " " + order.getOrderId() + "new status" + " " + order.getStatus());
    }
}
