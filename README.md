# Nes Emulator（Nes模拟器/FC任天堂/小霸王游戏）

![ScreenShot](https://github.com/Beseting/NesEmulator/blob/master/screen_shot/screen_shot.png)

## 1.引入
`implementation 'io.github.beseting:NesEmulator:1.0.1'`

## 2.初始化
`
EmulatorSDK.init(appContext)//建议在Application中初始化SDK
`
## 3.配置（可选）
```Kotlin
EmulatorManager.getInstance()
    //是否展示界面控制器 默认：
    .set(EmulatorManager.Settings.SHOW_CONTROLLER, false)
    //模拟器画质 默认：中
    .set(EmulatorManager.Settings.EMULATION_QUALITY,
        EmulatorManager.EmulationQuality.MEDIUM)
    //模拟器屏幕方向 默认：自动
    .set(EmulatorManager.Settings.SCREEN_ORIENTATION,
        EmulatorManager.EmulatorScreenOrientation.AUTO)
    //是否强制模拟器画面全屏 默认：否
    .set(EmulatorManager.Settings.FORCE_FULL_SCREEN, false)
```


## 4.使用
### 4.1 方式一：使用默认游戏渲染界面
```Kotlin
val romFile = File("/sdcard/魂斗罗1.nes")
EmulatorManager.getInstance().startGame(mActivity, romFile)
```
### 4.2 方式二：使用自定义游戏渲染界面
#### step1:继承BaseEmulatorActivity
```Kotlin
class MyEmulatorActivity : BaseEmulatorActivity(){

    //自定义界面 可自定义界面控制器（方向+AB键等业务组件）
    //如需自定义控制器，可以在配置项中将默认的控制器关闭
    override fun getLayoutResId(): Int {
        return R.layout.activity_nes_emulator
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // write your code...

    }
}
```
#### step2:跳转到此界面
```Kotlin
val romFile = File("/sdcard/魂斗罗1.nes")
EmulatorManager.getInstance()
    .startGame(mAct, MyEmulatorActivity::class.java,romFile)
```
## 5.API
```Kotlin
//控制器键按下
EmulatorManager.getInstance().pressKey(player, key)
//控制器键松开
EmulatorManager.getInstance().unPressKey(player, key)
```
### 5.1 角色属性
|Player（角色）|描述|
|:-|:-:|
|PLAYER1|1P|
|PLAYER2|2P|

**调用方式：EmulatorManager.Player.PLAYER1**
***
### 5.2 控制器属性
|ControllerKey(控制器键)|描述|
|:-|:-|
|UP|上|
|DOWN|下|
|LEFT|左|
|RIGHT|右|
|SELECT|选择|
|START|开始|
|A|按钮A|
|B|按钮B|
|A_TURBO|按钮A连续|
|B_TURBO|按钮B连续|

**调用方式：EmulatorManager.ControllerKey.UP**
***
### 5.3 设置属性
|Settings（设置）|取值类型|默认值|描述|
|:-|:-|:-|:-|
|SHOW_CONTROLLER|Boolean|true|是否显示默认控制器|
|EMULATION_QUALITY|EmulationQuality(LOW/MEDIUM/HIGH)|EmulationQuality.MEDIUM|模拟器画质|
|SCREEN_ORIENTATION|EmulatorScreenOrientation(AUTO/VERTICAL/HORIZONTAL)|EmulatorScreenOrientation.AUTO|模拟器屏幕方向|
|FORCE_FULL_SCREEN|Boolean|false|是否强制全屏|

**调用方式：EmulatorManager.Settings.SHOW_CONTROLLER**
***
## 6.Thanks
**此框架基于[NostalgiaLite](https://github.com/huzongyao/NostalgiaLite)进行二次封装开发，编译c++、so库（arm64-v8a、armeabi-v7a、x86），提供SDK能力，封装相关操作API，快速引入开发**