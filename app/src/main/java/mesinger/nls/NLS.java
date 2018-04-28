package mesinger.nls;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;

public class NLS extends NotificationListenerService {
    public NLS(){
        notificationBurster = new NotificationBurster();
    }

    private NotificationBurster notificationBurster;

    /**
     * This function gets called, if a app posts a notificaton
     * @param sbn StatusBarNotification object passed by OS
     */
    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {
        super.onNotificationPosted(sbn);

        NotificationInformation notificationInformation = notificationBurster.getNotification(sbn);

        Log.i("TAG", notificationInformation.toString());
    }

    /**
     * This function gets called, if a notification gets removed either by an app or the user
     * @param sbn
     */
    @Override
    public void onNotificationRemoved(StatusBarNotification sbn) {
        super.onNotificationRemoved(sbn);
    }

    @Override
    public void onListenerConnected() {
        super.onListenerConnected();
    }

    @Override
    public void onListenerDisconnected() {
        super.onListenerDisconnected();
    }
}
