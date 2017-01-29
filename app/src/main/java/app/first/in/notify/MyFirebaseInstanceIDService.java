package app.first.in.notify;

/**
 * Created by venkateshtata on 22/01/17.
 */

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    @Override
    @android.support.annotation.WorkerThread
    public void onTokenRefresh() {

        /* obtain the current InstanceId token: */
        String token = FirebaseInstanceId.getInstance().getToken();
    }
}