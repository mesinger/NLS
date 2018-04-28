package mesinger.nls;

import android.app.Notification;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;

/**
 * extract information of StatusBarNotification objects
 */
public class NotificationBurster {

    public NotificationBurster() {
    }

    /**
     * Parse the data of the sbn in a NotificationInformation object
     *
     * @param sbn StatusBarNotification passed by the NLS
     * @return NotificationInformation object
     */
    public final NotificationInformation getNotification(final StatusBarNotification sbn){

        Notification nf = sbn.getNotification();

        //nfextras stores all data about the notification, print nfextras.toString() to see all data
        Bundle nfextras = nf.extras;

        //access data in Bundle
        String title = nfextras.getString("android.title");
        String subText = nfextras.getString("android.title");
        ApplicationInfo appInfo = (ApplicationInfo) nfextras.get("android.appInfo");
        String infoText = nfextras.getString("android.infoText");
        String text = nfextras.getString("android.text");

        return new NotificationInformation(title, subText, appInfo, infoText, text);
    }
}
