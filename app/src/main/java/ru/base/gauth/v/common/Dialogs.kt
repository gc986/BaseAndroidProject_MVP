package ru.base.gauth.v.common

import android.app.Activity
import android.content.Context
import android.widget.Toast
import androidx.annotation.StringRes
import androidx.appcompat.app.AlertDialog
import ru.base.gauth.BaseAndroidProjectMVP

class Dialogs (private val context: Activity) {

    private fun getString(@StringRes resId: Int) = context.getString(resId)

    fun showTitle(@StringRes resId: Int, okListener:OkListener? = null){
        val builder = AlertDialog.Builder(context)
        builder.setTitle(getString(resId))
            .setCancelable(false)
            .setNegativeButton(android.R.string.ok
            ) { _, _ -> okListener?.invoke() }
        val alert = builder.create()
        alert.show()
    }

    fun showToast(text: String) = Toast.makeText(BaseAndroidProjectMVP.instance, text, Toast.LENGTH_LONG)

}