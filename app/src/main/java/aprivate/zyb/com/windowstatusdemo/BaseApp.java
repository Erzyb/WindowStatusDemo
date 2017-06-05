package aprivate.zyb.com.windowstatusdemo;

import android.app.Application;
import android.content.Context;

/**
 * Created by zhouyibo on 2017/6/5.
 */

public class BaseApp extends Application {
    public static Context gContext;

    @Override
    public void onCreate() {
        super.onCreate();
        gContext = this;
    }
}
