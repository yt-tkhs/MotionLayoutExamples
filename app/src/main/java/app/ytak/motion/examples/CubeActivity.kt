package app.ytak.motion.examples

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import app.ytak.motion.R

class CubeActivity : AppCompatActivity() {

    companion object {

        fun newInstance(context: Context, showPaths: Boolean) =
                Intent(context, CubeActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cube)
    }
}