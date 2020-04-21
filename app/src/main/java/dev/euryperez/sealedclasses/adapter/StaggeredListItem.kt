package dev.euryperez.sealedclasses.adapter

import dev.euryperez.sealedclasses.models.Advertisement
import dev.euryperez.sealedclasses.models.Product

sealed class StaggeredListItem(val itemType:ItemType)
data class BuyNowProductItem(val product:Product) : StaggeredListItem(ItemType.BUY_NOW)
data class AuctionProductItem(val product:Product, val endingTime:String, val lastBid:String) : StaggeredListItem(ItemType.AUCTION)
data class AdvertisementItem(val advertisement: Advertisement) : StaggeredListItem(ItemType.ADS)

enum class ItemType {
    BUY_NOW,
    AUCTION,
    ADS
}