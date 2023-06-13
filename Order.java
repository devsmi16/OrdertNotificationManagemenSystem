import java.util.ArrayList;
import java.util.List;

class Order {
    private int orderId;
    private String status;
    private List<NotificationListener> notificationListeners;

    public Order(int orderId){
        this.orderId = orderId;
        this.status = "Created";
        this.notificationListeners = new ArrayList<>();
    }
    public int getOrderId(){
        return orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyListeners();
    }
    public void addNotificationListener(NotificationListener listener){
        notificationListeners.add(listener);
    }
    public void removeNotificationListener(NotificationListener listener){
        notificationListeners.remove(listener);
    }
    private void notifyListeners(){
        for (NotificationListener listener:notificationListeners){
            listener.onStatusChange(this);
        }
    }
}
