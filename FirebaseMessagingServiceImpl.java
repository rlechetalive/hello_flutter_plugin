import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.urbanairship.push.fcm.AirshipFirebaseInstanceIdService;
import com.urbanairship.push.fcm.AirshipFirebaseMessagingService;

public class FirebaseMessagingServiceImpl extends FirebaseMessagingService {

    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);
        AirshipFirebaseInstanceIdService.processTokenRefresh(this);
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        AirshipFirebaseMessagingService.processMessageSync(this, remoteMessage);
    }
}
