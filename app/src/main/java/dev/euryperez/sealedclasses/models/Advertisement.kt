package dev.euryperez.sealedclasses.models

data class Advertisement(val id:String, val pictureUrl:String, val linkUrl:String, val companyName:String) {
    companion object {
        private val dummyList = listOf(
            Advertisement(
                System.currentTimeMillis().toString(),
                "https://images.unsplash.com/photo-1584445745938-e2c5a5ac7537?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1287&q=80",
                "https://dummylink.ad",
                "Foo Bar"
            ),
            Advertisement(
                System.currentTimeMillis().toString(),
                "https://images.unsplash.com/photo-1534816864519-9f0d647f8d96?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1234&q=80",
                "https://dummylink.ad",
                "Foo Bar1"
            ),
            Advertisement(
                System.currentTimeMillis().toString(),
                "https://images.unsplash.com/photo-1578357078586-491adf1aa5ba?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1300&q=80",
                "https://dummylink.ad",
                "Foo Bar2"
            ),
            Advertisement(
                System.currentTimeMillis().toString(),
                "https://images.unsplash.com/photo-1529583302858-7143cb9440cb?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1234&q=80",
                "https://dummylink.ad",
                "Foo Bar3"
            ),
            Advertisement(
                System.currentTimeMillis().toString(),
                "https://images.unsplash.com/photo-1559840251-7fcda50e348a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1234&q=80",
                "https://dummylink.ad",
                "Foo Bar4"
            )
        )

        val randomAd
        get() = dummyList.shuffled()[0]
    }
}