package aprivate.zyb.com.windowstatusdemo;

import android.content.Context;
import android.content.SharedPreferences;


/**
 * Created by zyb on 2016/9/12.
 * function:
 * SharedPreferences类
 */
public class SRPreferences {
    private Context context = BaseApp.gContext;
    private static SRPreferences ourInstance;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    public static final String READ_LIGHT_MODE = "readlightmode";
    public static final String READ_LIGHT_VOLUE = "readlightvolue";
    public static final String READ_LIGHT_TIME = "readlighttime";
    public static final String READ_LIGHT_TIME_SYSTER = "readlighttimesyster";
    public static final String READ_FULL_ALL = "read_full_all";



    public static SRPreferences getInstance() {
        if (ourInstance == null) {
            ourInstance = new SRPreferences(BaseApp.gContext);
        }
        return ourInstance;
    }

    private SRPreferences(Context context) {
        this.context = context;
        preferences = context.getSharedPreferences("tag", Context.MODE_PRIVATE);
        editor = preferences.edit();
    }

    /**
     * 获取指定Key对应的String值
     *
     * @param key 关键字
     * @return key对应的value，默认为空字符串""
     */

    public void setString(final String key, final String value) {
        editor.putString(key, value).commit();
    }

    public String getString(final String key, final String value) {
        return preferences.getString(key, value);
    }

    public void setLong(final String key, final Long value) {
        editor.putLong(key, value).commit();
    }

    public Long getLong(final String key, final Long value) {
        return preferences.getLong(key, value);
    }

    public void setInt(final String key, final int value) {
        editor.putInt(key, value).commit();
    }

    public int getInt(final String key, final int defValue) {
        return preferences.getInt(key, defValue);
    }

    public void setBoolean(final String key, final boolean value) {
        editor.putBoolean(key, value).commit();
    }

    public Boolean getBoolean(final String key, final boolean value) {
        return preferences.getBoolean(key, value);
    }

}
