package app.ytak.motion

import android.support.annotation.StringRes
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.item_example.view.*

class ExampleItem(@StringRes private val titleRes: Int, @StringRes private val descriptionRes: Int,
                  private val onClick: (() -> Unit)? = null) : Item() {

    override fun getLayout(): Int = R.layout.item_example

    override fun bind(viewHolder: ViewHolder, position: Int) = viewHolder.itemView.run {
        numberText.text = (position + 1).toString()
        titleText.setText(titleRes)
        descriptionText.setText(descriptionRes)
        setOnClickListener { onClick?.invoke() }
    }
}