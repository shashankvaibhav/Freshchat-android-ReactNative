Freshchat-android-ReactNative

Freshchat library for React native. Currently it supports android only.

Installation instructions - 1 - npm install --save react-native-android-library-freshchat-sdk

2 - In settings.gradle file include ':react-native-android-library-freshchat-sdk' project(':react-native-android-library-freshchat-sdk').projectDir = new File(settingsDir, '../node_modules/react-native-android-library-freshchat-sdk/android')

3 - In build.gradle(app) compile project(':react-native-android-library-freshchat-sdk') compile 'com.github.freshdesk:freshchat-android:1.0.0'

4 - In build.gradle(project) allprojects { repositories { mavenLocal() jcenter() maven { maven { url "https://jitpack.io" } //<-- This is for freshchat } } }
