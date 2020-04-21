package dev.euryperez.sealedclasses.adapter.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import dev.euryperez.sealedclasses.adapter.StaggeredListItem

abstract class BaseViewHolder<T : StaggeredListItem>(view: View) : RecyclerView.ViewHolder(view) {
    abstract fun bind(item: T)
}