package br.com.michele.calculaflex

import android.support.v7.app.AppCompatActivity
import br.com.michele.calculaflex.utils.CalculaFlexTracker
import br.com.michele.calculaflex.utils.ScreenMap

open class BaseActivity : AppCompatActivity() {

    open fun getScreenName(): String {
        return ScreenMap.getScreenNameBy(this)
    }

    override fun onStart() {
        super.onStart()
        CalculaFlexTracker.trackScreen(this, getScreenName())
    }
}