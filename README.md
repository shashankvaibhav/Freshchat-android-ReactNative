# Freshchat-android-ReactNative

Freshchat library for React native. Currently it supports android only.

1 - Install 
### npm install --save react-native-android-library-freshchat-sdk

2 - In settings.gradle file 
### include ':react-native-android-library-freshchat-sdk'
### project(':react-native-android-library-freshchat-sdk').projectDir = new File(settingsDir, '../node_modules/react-native-android-library-freshchat-sdk/android')

3 - In build.gradle(app) 
### compile project(':react-native-android-library-freshchat-sdk') compile 'com.github.freshdesk:freshchat-android:1.0.0'

4 - In build.gradle(project) 
### allprojects {
### &nbsp; &nbsp;   repositories {
### &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;       mavenLocal()
### &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;       jcenter()
### &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;       maven {
###  &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;maven { url "https://jitpack.io" }
### &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;       }
### &nbsp; &nbsp;   }
### }

