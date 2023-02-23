package com.ym.nesemulator

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.Environment
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.ym.library.sdk.EmulatorManager
import java.io.File

class MainActivity : AppCompatActivity() {

    private val btnStart: Button by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        findViewById(R.id.btnStart)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart.setOnClickListener {
            reqPermission()
        }
    }

    /**
     * 请求权限
     */
    private fun reqPermission() {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.READ_EXTERNAL_STORAGE
            ) == PackageManager.PERMISSION_GRANTED &&
            ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
            ) == PackageManager.PERMISSION_GRANTED
        ) {
            startGame()
        } else {
            requestPermissions(
                arrayOf(
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE
                ), 1000
            )
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode != 1000)
            return
        if (grantResults.isEmpty() || grantResults.size < 2) {
            Toast.makeText(this, "权限获取失败", Toast.LENGTH_SHORT).show()
        } else {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED) {
                startGame()
            } else {
                Toast.makeText(this, "权限获取失败", Toast.LENGTH_SHORT).show()
            }
        }
    }

    /**
     * 启动游戏
     */
    private fun startGame() {
        val romFile = File(Environment.getExternalStorageDirectory().path + "/魂斗罗1.nes")
        if (!romFile.exists()) {
            Toast.makeText(this, "文件不存在", Toast.LENGTH_SHORT).show()
            return
        }
        // 默认游戏界面
//        EmulatorManager.getInstance().startGame(this, romFile)
        //自定义游戏界面
        EmulatorManager.getInstance().startGame(this, MyEmulatorActivity::class.java, romFile)
        finish()
    }
}