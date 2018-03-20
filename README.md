# Freshchat-android-ReactNative

Freshchat library for React native. Currently it supports android only.

1 - Install 
```ruby
npm install --save react-native-android-library-freshchat-sdk
```

2 - In settings.gradle file 
```ruby
include ':react-native-android-library-freshchat-sdk'
project(':react-native-android-library-freshchat-sdk').projectDir = new File(settingsDir, '../node_modules/react-native-android-library-freshchat-sdk/android')
```

3 - In build.gradle(app) 
```ruby
compile project(':react-native-android-library-freshchat-sdk') 
compile 'com.github.freshdesk:freshchat-android:1.0.0'
```

4 - In build.gradle(project) 
```ruby
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


5 - add this in your MainApplication package list.
```ruby
new FreshChatReactPackage()
```

6 - Finally import library 
```ruby
import FreshChatSdk from 'react-native-android-library-freshchat-sdk'
```

7 - For initializing
### With User details -
```ruby
FreshChatSdk.initWithUser(appId,appkey,user unique id,firstname,lastname,email,mobile,country code);
```
### Without user details -
```ruby
FreshChatSdk.init(appId,appkey)
```

8 - For calling faqs
```ruby
FreshChatSdk.showFAQs()
```

9 - For calling conversations
```ruby
FreshChatSdk.showConversations(null)
```

10 - For calling conversations
```ruby
FreshChatSdk.showConversations("ENTER_YOUR_TAG_HERE")
```

11 - For reseting user
```ruby
FreshChatSdk.resetUser()
```
