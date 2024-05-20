package com.huzuobin239050412

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val currentFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_container)
        if (currentFragment == null) {
//            val fragment = CrimeFragment()
            val fragment = CrimeListFragment.newInstance()
            supportFragmentManager
                .beginTransaction() //创建一个新的fragment 事务
                .add(R.id.fragment_container, fragment) //执行一个fragment 添加操作
                .commit() //提交该事务
        }
    }
}