package mesinger.nls;

import android.content.pm.ApplicationInfo;

public class NotificationInformation {

    public NotificationInformation(String title, String subText, ApplicationInfo appInfo, String infoText, String text) {
        this.title = title;
        this.subText = subText;
        this.appInfo = appInfo;
        this.infoText = infoText;
        this.text = text;
    }

    public final String title;
    public final String subText;
    public final ApplicationInfo appInfo;
    public final String infoText;
    public final String text;

    @Override
    public String toString() {
        return "Notification: {title=" + title + "}{text=" + text + "}{{applicaton=" + appInfo.processName + "}";
    }
}
