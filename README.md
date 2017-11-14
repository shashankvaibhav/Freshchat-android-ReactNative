# Freshchat-android-ReactNative

Freshchat library for React native. Currently it supports android only.

1 - Install 
```
npm install --save react-native-android-library-freshchat-sdk
```

2 - In settings.gradle file 
```
include ':react-native-android-library-freshchat-sdk'
project(':react-native-android-library-freshchat-sdk').projectDir = new File(settingsDir, '../node_modules/react-native-android-library-freshchat-sdk/android')
```

3 - In build.gradle(app) 
```
compile project(':react-native-android-library-freshchat-sdk') compile 'com.github.freshdesk:freshchat-android:1.0.0'
```

4 - In build.gradle(project) 
```
allprojects {
  repositories {
    mavenLocal()
    jcenter()
    maven {
     maven { url "https://jitpack.io" }
    }
  }
}
```


5 - Add this in your ApplicationMain package list.
```
new FreshChatReactPackage()
```

6 - Finally import library 
```
import FreshChatSdk from 'react-native-android-library-freshchat-sdk'
```

7 - For initializing
#### With User details -
```
FreshChatSdk.initWithUser(appId,appkey,user unique id,firstname,lastname,email,mobile,country code);
```
#### Without User details -
```
FreshChatSdk.initWithUser(appId,appkey)
```

8 - For calling FAQs
```
FreshChatSdk.showFAQs()
```

9 - For calling Conversations
```
FreshChatSdk.showConversations()
```

