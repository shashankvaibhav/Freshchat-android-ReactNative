package com.android.freshchatSdk;

import android.util.Log;
import android.widget.Toast;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.freshchat.consumer.sdk.Freshchat;
import com.freshchat.consumer.sdk.ConversationOptions;
import com.freshchat.consumer.sdk.FreshchatConfig;
import com.freshchat.consumer.sdk.FreshchatUser;

import java.util.ArrayList;
import java.util.List;

public class FreshChatSdkModule extends ReactContextBaseJavaModule {
    private static final String TAG = FreshChatSdkModule.class.getSimpleName();

    public FreshChatSdkModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "FreshChatSdk";
    }

    @ReactMethod
    public void init(final String appId, final String appKey) {

        FreshchatConfig freshchatConfig=new FreshchatConfig(appId,appKey);
        Freshchat.getInstance(getReactApplicationContext()).init(freshchatConfig);

    }

    @ReactMethod
    public void initWithUser(final String appId,final String appKey, final String userId,final String firstName, final String lastName,final String email,final String phone, final String countryCode) {

        FreshchatConfig freshchatConfig=new FreshchatConfig(appId,appKey);
        Freshchat.getInstance(getReactApplicationContext()).init(freshchatConfig);

        FreshchatUser user = Freshchat.getInstance(getReactApplicationContext()).getUser();
        user.setFirstName(firstName).setLastName(lastName).setEmail(email).setPhone(countryCode,phone).setExternalId(userId);
        Freshchat.getInstance(getReactApplicationContext()).setUser(user);
    }

    @ReactMethod
    public void showFAQs() {
        Freshchat.showFAQs(getReactApplicationContext());
    }

    @ReactMethod
    public void showConversations(final String filterTag) {
        if(filterTag == null){   
            Freshchat.showConversations(getReactApplicationContext());
        }else{
            List<String> tags = new ArrayList<>();
            tags.add(filterTag);

            ConversationOptions convOptions = new ConversationOptions().filterByTags(tags,filterTag);
            Freshchat.showConversations(getReactApplicationContext(), convOptions);
        }
    }

    @ReactMethod
    public void resetUser() {
        Freshchat.resetUser(getReactApplicationContext());
    }
}
