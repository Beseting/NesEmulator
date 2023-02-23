package com.ym.nesemulator

import android.app.Application
import com.ym.library.sdk.EmulatorManager
import com.ym.library.sdk.EmulatorSDK

/**
 * @Desc:
 * @Author:Kevin
 * @Date:2023/2/22 17:52:51
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        EmulatorSDK.init(this)
        
        EmulatorManager.getInstance()
            //是否展示界面控制器 默认：是
            .set(EmulatorManager.Settings.SHOW_CONTROLLER, false)
            //模拟器画质 默认：中
            .set(EmulatorManager.Settings.EMULATION_QUALITY,EmulatorManager.EmulationQuality.MEDIUM)
            //模拟器屏幕方向 默认：自动
            .set(EmulatorManager.Settings.SCREEN_ORIENTATION,EmulatorManager.EmulatorScreenOrientation.AUTO)
            //是否强制模拟器画面全屏 默认：否
            .set(EmulatorManager.Settings.FORCE_FULL_SCREEN, false) 

    }
}