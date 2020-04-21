package dev.euryperez.sealedclasses.adapter.viewholders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.euryperez.sealedclasses.R
import dev.euryperez.sealedclasses.adapter.BuyNowProductItem
import dev.euryperez.sealedclasses.context
import dev.euryperez.sealedclasses.loadImage

class BuyNowProductViewholder(view: View) : BaseViewHolder<BuyNowProductItem>(view) {

    private val ivProduct = view.findViewById<ImageView>(R.id.iv_product)
    private val tvProductName = view.findViewById<TextView>(R.id.tv_product_name)
    private val tvProductPrice = view.findViewById<TextView>(R.id.tv_product_price)

    override fun bind(item: BuyNowProductItem) {
        val product = item.product
        ivProduct.loadImage(product.pictureUrl)
        tvProductName.text = product.name
        tvProductPrice.text = context.getString(R.string.product_price, product.price)
    }
}