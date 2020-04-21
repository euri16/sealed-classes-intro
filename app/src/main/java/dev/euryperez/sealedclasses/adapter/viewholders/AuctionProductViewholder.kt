package dev.euryperez.sealedclasses.adapter.viewholders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import dev.euryperez.sealedclasses.R
import dev.euryperez.sealedclasses.adapter.AuctionProductItem
import dev.euryperez.sealedclasses.context
import dev.euryperez.sealedclasses.loadImage

class AuctionProductViewholder(view: View) : BaseViewHolder<AuctionProductItem>(view) {

    val ivProduct = view.findViewById<ImageView>(R.id.iv_product)
    val tvProductName = view.findViewById<TextView>(R.id.tv_product_name)
    val tvProductLastBid = view.findViewById<TextView>(R.id.tv_product_last_bid)
    val tvProductEndingTime = view.findViewById<TextView>(R.id.tv_product_time)

    override fun bind(item: AuctionProductItem) {
        val product = item.product

        ivProduct.loadImage(product.pictureUrl)
        tvProductName.text = product.name
        tvProductLastBid.text = context.getString(R.string.product_last_bid, item.lastBid)
        tvProductEndingTime.text = context.getString(R.string.product_ending_time, item.endingTime)
    }
}