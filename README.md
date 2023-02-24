# Nes Emulator（Nes Emulator/FC/Nintendo Game）

![ScreenShot](https://github.com/Beseting/NesEmulator/blob/master/screen_shot/screen_shot.png)

## :clap: Supporters
[![Stargazers repo roster for @Beseting/NesEmulator](https://reporoster.com/stars/Beseting/NesEmulator)](https://github.com/Beseting/NesEmulator/stargazers)

**[简体中文](https://github.com/Beseting/NesEmulator/README-CN.md) | English**

## 1.Getting Started
`implementation 'io.github.beseting:NesEmulator:1.0.1'`

## 2.initialization
```Kotlin
//It is recommended to initialize the SDK in the Application
EmulatorSDK.init(appContext)
```
## 3.Configuration(Optional)
```Kotlin
EmulatorManager.getInstance()
    //is show view controller(default:true)
    .set(EmulatorManager.Settings.SHOW_CONTROLLER, false)
    //emulator display quality(default:MEDIUM)
    .set(EmulatorManager.Settings.EMULATION_QUALITY,
        EmulatorManager.EmulationQuality.MEDIUM)
    //emulator screen orientation(default:AUTO)
    .set(EmulatorManager.Settings.SCREEN_ORIENTATION,
        EmulatorManager.EmulatorScreenOrientation.AUTO)
    //is force emulator display fullscreen(default:false)
    .set(EmulatorManager.Settings.FORCE_FULL_SCREEN, false)
```


## 4.Use
### 4.1 Use the default rendering
```Kotlin
val romFile = File("/sdcard/contra.nes")
EmulatorManager.getInstance().startGame(mActivity, romFile)
```
### 4.2 Use custom game rendering
#### step1:Extends BaseEmulatorActivity
```Kotlin
//Custom Activity
class MyEmulatorActivity : BaseEmulatorActivity(){

    //Customizable Display Controller(Direction&A/B Button）
    //If You Want Custom Display Controller,You Can Hide The Default Show.
    override fun getLayoutResId(): Int {
        return R.layout.activity_nes_emulator
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Write Your Code...

    }
}
```
#### step2:To Your Custom Activity
```Kotlin
val romFile = File("/sdcard/contra.nes")
EmulatorManager.getInstance()
    .startGame(mAct, MyEmulatorActivity::class.java,romFile)
```
## 5.API
```Kotlin
//Controller Key Press
EmulatorManager.getInstance().pressKey(player, key)
//Controller Key Unpress
EmulatorManager.getInstance().unPressKey(player, key)
```
### 5.1 Role Properties
|Player（Role）|Description|
|:-|:-:|
|PLAYER1|1P|
|PLAYER2|2P|

**Use：EmulatorManager.Player.PLAYER1**
***
### 5.2 Controller Properties
|ControllerKey(Controller Key)|Description|
|:-|:-|
|UP|direction for up|
|DOWN|direction for down|
|LEFT|direction for left|
|RIGHT|direction for right|
|SELECT|button for select|
|START|button for start|
|A|button for A|
|B|button for B|
|A_TURBO|button for A Turbo|
|B_TURBO|button for B Turbo|

**Use：EmulatorManager.ControllerKey.UP**
***
### 5.3 Setting Properties
|Settings|Type|Default|Description|
|:-|:-|:-|:-|
|SHOW_CONTROLLER|Boolean|true|is show default controller|
|EMULATION_QUALITY|EmulationQuality|MEDIUM|display quality|
|SCREEN_ORIENTATION|EmulatorScreenOrientation|AUTO|screen direction|
|FORCE_FULL_SCREEN|Boolean|false|is force fullscreen|

**Use：EmulatorManager.Settings.SHOW_CONTROLLER**
***
## 6.Thanks
**This library is based on [NostalgiaLite](https://github.com/huzongyao/NostalgiaLite) to develop plus,Thanks the author [huzongyao](https://github.com/huzongyao) provided based on Android Studio NDK's compilable for Jni/C++ code.NesEmulator library provide the fully compiled so library(arm64-v8a、armeabi-v7a、x86),As your need,Provide SDK capabilities,Package the API,Fast develop.Enjoy it!**