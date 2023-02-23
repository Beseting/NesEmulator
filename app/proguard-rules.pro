# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

-keepclasseswithmembers class com.ym.library.ui.gamegallery.GameDescription{*;}
-keepclasseswithmembers class com.ym.library.ui.gamegallery.ZipRomFile{*;}
-keepclassmembers class * extends com.ym.library.base.JniEmulator{public ** getInstance();}

-keep class com.blankj.utilcode.** { *; }
-keepclassmembers class com.blankj.utilcode.** { *; }
-dontwarn com.blankj.utilcode.**

-keep class **_FragmentFinder {*;}
-keep class androidx.fragment.app.*{*;}
-keep class com.qmuiteam.qmui.* {*;}