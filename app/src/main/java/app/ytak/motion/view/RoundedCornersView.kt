package app.ytak.motion.view

import android.content.Context
import android.graphics.Outline
import android.support.annotation.Keep
import android.util.AttributeSet
import android.view.View
import android.view.ViewOutlineProvider
import android.widget.ImageView

class RoundedCornersView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyle: Int = 0
) : ImageView(context, attrs, defStyle) {

    private val outlineProvider = RadiusOutlineProvider()

    @get:Keep @set:Keep
    var radius: Float = 0f
        set(value) {
            field = value
            invalidateOutline()
        }

    init {
        setOutlineProvider(outlineProvider)
        clipToOutline = true
    }

    inner class RadiusOutlineProvider : ViewOutlineProvider() {
        override fun getOutline(view: View, out: Outline?) {
            out?.setRoundRect(0, 0, view.width, view.height, radius)
        }
    }
}