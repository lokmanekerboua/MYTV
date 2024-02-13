package me.lokmvne.exoplayer

import android.net.Uri
import androidx.media3.common.MediaItem

data class Channel(
    val contentUri: Uri,
    val mediaItem: MediaItem,
    val logo: String,
    val name: String,
)

val VideoItems = listOf(
    Channel(
        contentUri = Uri.parse("https://ott.tv5monde.com/Content/HLS/Live/channel(orient)/variant.m3u8"),
        mediaItem = MediaItem.fromUri("https://ott.tv5monde.com/Content/HLS/Live/channel(orient)/variant.m3u8"),
        logo = "https://res.cloudinary.com/dmujoqmoq/image/upload/v1695481569/samples/channelslogo/hb6zgnld9s9isejod8hz.png",
        name = "TV5 Monde"
    ),

    Channel(
        contentUri = Uri.parse("https://shls-mbc3-eur-prod-dub.shahid.net/out/v1/fce09dd6a967431a871efb3b8dec9f82/index.m3u8"),
        mediaItem = MediaItem.fromUri("https://shls-mbc3-eur-prod-dub.shahid.net/out/v1/fce09dd6a967431a871efb3b8dec9f82/index.m3u8"),
        logo = "https://res.cloudinary.com/dmujoqmoq/image/upload/v1695481570/samples/channelslogo/xlq26mcfa8telohsvvba.png",
        name = "MBC3"
    ),

    //----------------------------------------------------------------ssc-------------------------------------------------------
    Channel(
        contentUri = Uri.parse("https://live-hls-web-ajm.getaj.net/AJM/index.m3u8"),
        mediaItem = MediaItem.fromUri("https://live-hls-web-ajm.getaj.net/AJM/index.m3u8"),
        logo = "https://res.cloudinary.com/dmujoqmoq/image/upload/v1695481563/samples/channelslogo/u5wrezwjzpq7q5vhrke6.png",
        name = "Al Jazeera Mubasher"
    )

)
