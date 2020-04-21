package dev.euryperez.sealedclasses.adapter.viewholders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.euryperez.sealedclasses.R
import dev.euryperez.sealedclasses.adapter.AdvertisementItem
import dev.euryperez.sealedclasses.adapter.BuyNowProductItem
import dev.euryperez.sealedclasses.context
import dev.euryperez.sealedclasses.loadImage

class AdViewholder(view: View) : BaseViewHolder<AdvertisementItem>(view) {

    private val ivAdvertisement = view.findViewById<ImageView>(R.id.iv_ad)

    override fun bind(item: AdvertisementItem) {
        ivAdvertisement.loadImage(item.advertisement.pictureUrl)
    }
}