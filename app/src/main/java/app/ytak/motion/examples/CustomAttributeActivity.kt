package app.ytak.motion.examples

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.constraint.motion.MotionLayout
import android.support.v7.app.AppCompatActivity
import app.ytak.motion.R
import kotlinx.android.synthetic.main.activity_customattr.*


class CustomAttributeActivity : AppCompatActivity() {

    companion object {

        fun newInstance(context: Context, showPaths: Boolean) =
                Intent(context, CustomAttributeActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customattr)

        motionLayout.setTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionChange(
                    motionLayout: MotionLayout?, begin: Int, end: Int, progress: Float) {
                // progressが変化したときに呼ばれる
            }

            override fun onTransitionCompleted(motionLayout: MotionLayout?, end: Int) {
                // アニメーションが終了したときに呼ばれる
            }
        })
    }
}