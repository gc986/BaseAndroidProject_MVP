package ru.base.gauth.v.common.activity

import android.os.Bundle
import androidx.annotation.LayoutRes
import moxy.MvpAppCompatActivity
import ru.base.gauth.v.common.Dialogs
import ru.gc986.logs.Logs

abstract class CommonActivity(@LayoutRes layoutId: Int) : MvpAppCompatActivity(layoutId),
    CommonActivityView {

    private val logs: Logs = Logs()
    private val dialogs: Dialogs = Dialogs(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init()
        initView()
    }

    protected abstract fun initView()
    protected abstract fun init()

}