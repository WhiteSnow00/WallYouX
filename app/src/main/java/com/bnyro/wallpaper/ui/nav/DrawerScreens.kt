package com.bnyro.wallpaper.ui.nav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector
import com.bnyro.wallpaper.R

sealed class DrawerScreens(
    val titleResource: Int,
    val route: String,
    val icon: ImageVector,
    val divideBefore: Boolean = false
) {
    object MiCarousel : DrawerScreens(R.string.miwalls, "mi", Icons.Default.PhotoAlbum)
    object Wallhaven : DrawerScreens(R.string.wallhaven, "wh", Icons.Default.Landscape)
    object Picsum : DrawerScreens(R.string.picsum, "ps", Icons.Default.Pix)

    object Unsplash : DrawerScreens(R.string.unsplash, "us", Icons.Default.WaterDrop)

    object OWalls : DrawerScreens(R.string.owalls, "ow", Icons.Default.Air)
    object Favorites : DrawerScreens(R.string.favorites, "favorites", Icons.Default.Favorite, true)
    object Settings : DrawerScreens(R.string.settings, "settings", Icons.Default.Settings, true)
    object About : DrawerScreens(R.string.about, "about", Icons.Default.Info)

    companion object {
        val apiScreens = listOf(MiCarousel, Wallhaven, Unsplash, OWalls, Picsum)
        val screens = listOf(*apiScreens.toTypedArray(), Favorites, Settings, About)
    }
}
