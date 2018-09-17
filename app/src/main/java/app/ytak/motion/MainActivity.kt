package app.ytak.motion

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import app.ytak.motion.examples.CoordinatorActivity
import app.ytak.motion.examples.CustomAttributeActivity
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val adapter = GroupAdapter<ViewHolder>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.adapter = adapter
        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

        adapter.update(listOf(
                ExampleItem(R.string.constraint_title, R.string.constraint_description) {
                    startActivity(CoordinatorActivity.newInstance(this, true))
                },
                ExampleItem(R.string.customattr_title) {
                    startActivity(CustomAttributeActivity.newInstance(this, true))
                }
        ))
    }
}
