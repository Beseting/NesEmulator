package com.ym.nesemulator

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.View.OnTouchListener
import android.widget.TextView
import com.ym.library.base.BaseEmulatorActivity
import com.ym.library.sdk.EmulatorManager

/**
 * @Desc:自定义Nes游戏界面 在这里可以定义界面控件 诸如按钮等
 * @Author:Kevin
 * @Date:2023/2/17 15:25:37
 */
class MyEmulatorActivity : BaseEmulatorActivity(), OnTouchListener {

    //组件map 组件id为key value储存游戏玩家和对应的控制key
    private val keyCompMap: HashMap<Int, Pair<EmulatorManager.Player, ArrayList<EmulatorManager.ControllerKey>>> =
        HashMap()


    override fun getLayoutResId(): Int {
        return R.layout.activity_nes_emulator
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.initKeyCompMap()
    }

    /**
     * 初始化控件-key的映射
     */
    @SuppressLint("ClickableViewAccessibility")
    private fun initKeyCompMap() {
        //Player 1
        findViewById<TextView>(R.id.keyLeft)?.apply {
            keyCompMap[id] = Pair(
                EmulatorManager.Player.PLAYER1,
                arrayListOf(EmulatorManager.ControllerKey.LEFT)
            )
            this.setOnTouchListener(this@MyEmulatorActivity)
        }
        findViewById<TextView>(R.id.keyUp)?.apply {
            keyCompMap[id] =
                Pair(EmulatorManager.Player.PLAYER1, arrayListOf(EmulatorManager.ControllerKey.UP))
            this.setOnTouchListener(this@MyEmulatorActivity)
        }
        findViewById<TextView>(R.id.keyRight)?.apply {
            keyCompMap[id] = Pair(
                EmulatorManager.Player.PLAYER1,
                arrayListOf(EmulatorManager.ControllerKey.RIGHT)
            )
            this.setOnTouchListener(this@MyEmulatorActivity)
        }
        findViewById<TextView>(R.id.keyDown)?.apply {
            keyCompMap[id] = Pair(
                EmulatorManager.Player.PLAYER1,
                arrayListOf(EmulatorManager.ControllerKey.DOWN)
            )
            this.setOnTouchListener(this@MyEmulatorActivity)
        }
        findViewById<TextView>(R.id.keyLeftUp)?.apply {
            keyCompMap[id] = Pair(
                EmulatorManager.Player.PLAYER1,
                arrayListOf(EmulatorManager.ControllerKey.LEFT, EmulatorManager.ControllerKey.UP)
            )
            this.setOnTouchListener(this@MyEmulatorActivity)
        }
        findViewById<TextView>(R.id.keyRightUp)?.apply {
            keyCompMap[id] = Pair(
                EmulatorManager.Player.PLAYER1,
                arrayListOf(EmulatorManager.ControllerKey.RIGHT, EmulatorManager.ControllerKey.UP)
            )
            this.setOnTouchListener(this@MyEmulatorActivity)
        }
        findViewById<TextView>(R.id.keyRightDown)?.apply {
            keyCompMap[id] = Pair(
                EmulatorManager.Player.PLAYER1,
                arrayListOf(EmulatorManager.ControllerKey.RIGHT, EmulatorManager.ControllerKey.DOWN)
            )
            this.setOnTouchListener(this@MyEmulatorActivity)
        }
        findViewById<TextView>(R.id.keyLeftDown)?.apply {
            keyCompMap[id] = Pair(
                EmulatorManager.Player.PLAYER1,
                arrayListOf(EmulatorManager.ControllerKey.LEFT, EmulatorManager.ControllerKey.DOWN)
            )
            this.setOnTouchListener(this@MyEmulatorActivity)
        }
        findViewById<TextView>(R.id.keySelect)?.apply {
            keyCompMap[id] = Pair(
                EmulatorManager.Player.PLAYER1,
                arrayListOf(EmulatorManager.ControllerKey.SELECT)
            )
            this.setOnTouchListener(this@MyEmulatorActivity)
        }
        findViewById<TextView>(R.id.keyStart)?.apply {
            keyCompMap[id] = Pair(
                EmulatorManager.Player.PLAYER1,
                arrayListOf(EmulatorManager.ControllerKey.START)
            )
            this.setOnTouchListener(this@MyEmulatorActivity)
        }
        findViewById<TextView>(R.id.keyA)?.apply {
            keyCompMap[id] = Pair(
                EmulatorManager.Player.PLAYER1,
                arrayListOf(EmulatorManager.ControllerKey.A)
            )
            this.setOnTouchListener(this@MyEmulatorActivity)
        }
        findViewById<TextView>(R.id.keyB)?.apply {
            keyCompMap[id] = Pair(
                EmulatorManager.Player.PLAYER1,
                arrayListOf(EmulatorManager.ControllerKey.B)
            )
            this.setOnTouchListener(this@MyEmulatorActivity)
        }
        findViewById<TextView>(R.id.keyATurbo)?.apply {
            keyCompMap[id] = Pair(
                EmulatorManager.Player.PLAYER1,
                arrayListOf(EmulatorManager.ControllerKey.A_TURBO)
            )
            this.setOnTouchListener(this@MyEmulatorActivity)
        }
        findViewById<TextView>(R.id.keyBTurbo)?.apply {
            keyCompMap[id] = Pair(
                EmulatorManager.Player.PLAYER1,
                arrayListOf(EmulatorManager.ControllerKey.B_TURBO)
            )
            this.setOnTouchListener(this@MyEmulatorActivity)
        }

        //Player 2
        findViewById<TextView>(R.id.keyLeft2)?.apply {
            keyCompMap[id] = Pair(
                EmulatorManager.Player.PLAYER2,
                arrayListOf(EmulatorManager.ControllerKey.LEFT)
            )
            this.setOnTouchListener(this@MyEmulatorActivity)
        }
        findViewById<TextView>(R.id.keyUp2)?.apply {
            keyCompMap[id] =
                Pair(EmulatorManager.Player.PLAYER2, arrayListOf(EmulatorManager.ControllerKey.UP))
            this.setOnTouchListener(this@MyEmulatorActivity)
        }
        findViewById<TextView>(R.id.keyRight2)?.apply {
            keyCompMap[id] = Pair(
                EmulatorManager.Player.PLAYER2,
                arrayListOf(EmulatorManager.ControllerKey.RIGHT)
            )
            this.setOnTouchListener(this@MyEmulatorActivity)
        }
        findViewById<TextView>(R.id.keyDown2)?.apply {
            keyCompMap[id] = Pair(
                EmulatorManager.Player.PLAYER2,
                arrayListOf(EmulatorManager.ControllerKey.DOWN)
            )
            this.setOnTouchListener(this@MyEmulatorActivity)
        }
        findViewById<TextView>(R.id.keyLeftUp2)?.apply {
            keyCompMap[id] = Pair(
                EmulatorManager.Player.PLAYER2,
                arrayListOf(EmulatorManager.ControllerKey.LEFT, EmulatorManager.ControllerKey.UP)
            )
            this.setOnTouchListener(this@MyEmulatorActivity)
        }
        findViewById<TextView>(R.id.keyRightUp2)?.apply {
            keyCompMap[id] = Pair(
                EmulatorManager.Player.PLAYER2,
                arrayListOf(EmulatorManager.ControllerKey.RIGHT, EmulatorManager.ControllerKey.UP)
            )
            this.setOnTouchListener(this@MyEmulatorActivity)
        }
        findViewById<TextView>(R.id.keyRightDown2)?.apply {
            keyCompMap[id] = Pair(
                EmulatorManager.Player.PLAYER2,
                arrayListOf(EmulatorManager.ControllerKey.RIGHT, EmulatorManager.ControllerKey.DOWN)
            )
            this.setOnTouchListener(this@MyEmulatorActivity)
        }
        findViewById<TextView>(R.id.keyLeftDown2)?.apply {
            keyCompMap[id] = Pair(
                EmulatorManager.Player.PLAYER2,
                arrayListOf(EmulatorManager.ControllerKey.LEFT, EmulatorManager.ControllerKey.DOWN)
            )
            this.setOnTouchListener(this@MyEmulatorActivity)
        }
        findViewById<TextView>(R.id.keySelect2)?.apply {
            keyCompMap[id] = Pair(
                EmulatorManager.Player.PLAYER2,
                arrayListOf(EmulatorManager.ControllerKey.SELECT)
            )
            this.setOnTouchListener(this@MyEmulatorActivity)
        }
        findViewById<TextView>(R.id.keyStart2)?.apply {
            keyCompMap[id] = Pair(
                EmulatorManager.Player.PLAYER2,
                arrayListOf(EmulatorManager.ControllerKey.START)
            )
            this.setOnTouchListener(this@MyEmulatorActivity)
        }
        findViewById<TextView>(R.id.keyA2)?.apply {
            keyCompMap[id] = Pair(
                EmulatorManager.Player.PLAYER2,
                arrayListOf(EmulatorManager.ControllerKey.A)
            )
            this.setOnTouchListener(this@MyEmulatorActivity)
        }
        findViewById<TextView>(R.id.keyB2)?.apply {
            keyCompMap[id] = Pair(
                EmulatorManager.Player.PLAYER2,
                arrayListOf(EmulatorManager.ControllerKey.B)
            )
            this.setOnTouchListener(this@MyEmulatorActivity)
        }
        findViewById<TextView>(R.id.keyATurbo2)?.apply {
            keyCompMap[id] = Pair(
                EmulatorManager.Player.PLAYER2,
                arrayListOf(EmulatorManager.ControllerKey.A_TURBO)
            )
            this.setOnTouchListener(this@MyEmulatorActivity)
        }
        findViewById<TextView>(R.id.keyBTurbo2)?.apply {
            keyCompMap[id] = Pair(
                EmulatorManager.Player.PLAYER2,
                arrayListOf(EmulatorManager.ControllerKey.B_TURBO)
            )
            this.setOnTouchListener(this@MyEmulatorActivity)
        }
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouch(v: View?, event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN -> {//按下
                val player = this.keyCompMap[v?.id]?.first
                this.keyCompMap[v?.id]?.second?.forEach {
                    EmulatorManager.getInstance()
                        .pressKey(player, it)
                }
            }
            MotionEvent.ACTION_UP,
            MotionEvent.ACTION_CANCEL -> {//松开
                val player = this.keyCompMap[v?.id]?.first
                this.keyCompMap[v?.id]?.second?.forEach {
                    EmulatorManager.getInstance()
                        .unPressKey(player, it)
                }
            }
        }
        return true
    }
}