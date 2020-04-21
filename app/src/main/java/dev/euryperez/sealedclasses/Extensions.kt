package dev.euryperez.sealedclasses

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import dev.euryperez.sealedclasses.adapter.AdvertisementItem
import dev.euryperez.sealedclasses.adapter.AuctionProductItem
import dev.euryperez.sealedclasses.adapter.BuyNowProductItem
import dev.euryperez.sealedclasses.models.Advertisement
import dev.euryperez.sealedclasses.models.Product


fun ViewGroup.inflate(@LayoutRes res: Int) = LayoutInflater.from(context).inflate(res, this, false)

fun ImageView.loadImage(url: String) {
    Glide.with(this)
        .load(url)
        .into(this)
}

val RecyclerView.ViewHolder.context
    get() = itemView.context

fun MainActivity.getDummyProductListItems() = listOf(
    BuyNowProductItem(Product.randomProduct),
    BuyNowProductItem(Product.randomProduct),
    BuyNowProductItem(Product.randomProduct),
    AuctionProductItem(Product.randomProduct, "07:10", "45.99"),
    BuyNowProductItem(Product.randomProduct),
    AuctionProductItem(Product.randomProduct, "07:10", "45.99"),
    BuyNowProductItem(Product.randomProduct),
    BuyNowProductItem(Product.randomProduct),
    AuctionProductItem(Product.randomProduct, "07:10", "45.99"),
    BuyNowProductItem(Product.randomProduct),
    BuyNowProductItem(Product.randomProduct),
    AdvertisementItem(Advertisement.randomAd),
    BuyNowProductItem(Product.randomProduct),
    AuctionProductItem(Product.randomProduct, "07:10", "45.99"),
    AuctionProductItem(Product.randomProduct, "07:10", "45.99"),
    AuctionProductItem(Product.randomProduct, "07:10", "45.99"),
    AdvertisementItem(Advertisement.randomAd),
    BuyNowProductItem(Product.randomProduct),
    BuyNowProductItem(Product.randomProduct),
    BuyNowProductItem(Product.randomProduct),
    AuctionProductItem(Product.randomProduct, "07:10", "45.99"),
    AuctionProductItem(Product.randomProduct, "07:10", "45.99"),
    AuctionProductItem(Product.randomProduct, "07:10", "45.99"),
    AdvertisementItem(Advertisement.randomAd),
    AuctionProductItem(Product.randomProduct, "07:10", "45.99"),
    AuctionProductItem(Product.randomProduct, "07:10", "45.99"),
    BuyNowProductItem(Product.randomProduct),
    BuyNowProductItem(Product.randomProduct)
)