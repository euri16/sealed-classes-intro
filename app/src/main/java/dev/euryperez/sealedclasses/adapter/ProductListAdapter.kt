package dev.euryperez.sealedclasses.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.euryperez.sealedclasses.R
import dev.euryperez.sealedclasses.adapter.viewholders.AdViewholder
import dev.euryperez.sealedclasses.adapter.viewholders.AuctionProductViewholder
import dev.euryperez.sealedclasses.adapter.viewholders.BaseViewHolder
import dev.euryperez.sealedclasses.adapter.viewholders.BuyNowProductViewholder
import dev.euryperez.sealedclasses.inflate

class ProductListAdapter(val callback: (StaggeredListItem) -> Unit) : RecyclerView.Adapter<BaseViewHolder<StaggeredListItem>>() {

    var items:List<StaggeredListItem> = emptyList()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    @Suppress("UNCHECKED_CAST")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = when(ItemType.values()[viewType]) {
        ItemType.BUY_NOW -> BuyNowProductViewholder(parent.inflate(R.layout.item_product_buy_now))
        ItemType.AUCTION -> AuctionProductViewholder(parent.inflate(R.layout.item_product_auction))
        ItemType.ADS -> AdViewholder(parent.inflate(R.layout.item_advertisement))
    } as BaseViewHolder<StaggeredListItem>

    override fun onBindViewHolder(holder: BaseViewHolder<StaggeredListItem>, position: Int) {
        val item = items[position]
        holder.bind(item)

        holder.itemView.setOnClickListener {
            callback(item)
        }
    }


    override fun getItemViewType(position: Int) = items[position].itemType.ordinal

    override fun getItemCount() = items.count()
}