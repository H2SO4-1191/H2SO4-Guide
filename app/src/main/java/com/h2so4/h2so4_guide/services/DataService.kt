package com.h2so4.h2so4_guide.services

import com.h2so4.h2so4_guide.model.Category
import com.h2so4.h2so4_guide.model.Product

object DataService {
    val categories = listOf(
        Category("Consoles", "gaming_consoles"),
        Category("Controllers", "gaming_controllers"),
        Category("Headsets", "gaming_headsets"),
        Category("Games", "games"),
        Category("Accessories", "gaming_accessories")
    )
    val consoles = listOf(
        Product("PS5", 500f, "ps5"),
        Product("XBOX Series X", 490f, "xbox_series_x"),
        Product("PS4", 300f, "ps4"),
        Product("XBOX 1", 330f, "xbox_1"),
        Product("Nintendo Switch", 200f, "nintendo_switch"),
        Product("PS5", 500f, "ps5"),
        Product("XBOX Series X", 490f, "xbox_series_x"),
        Product("PS4", 300f, "ps4"),
        Product("XBOX 1", 330f, "xbox_1"),
        Product("Nintendo Switch", 200f, "nintendo_switch"),
        Product("PS5", 500f, "ps5"),
        Product("XBOX Series X", 490f, "xbox_series_x"),
        Product("PS4", 300f, "ps4"),
        Product("XBOX 1", 330f, "xbox_1"),
        Product("Nintendo Switch", 200f, "nintendo_switch")
    )
    val controllers = listOf(
        Product("Dualsense", 90f, "dualsense"),
        Product("XBOX Series X Controller", 70f, "xbox_series_x_controller"),
        Product("Dualshock 4", 50f, "dualshock_4"),
        Product("XBOX 1 Controller", 45f, "xbox_1_controller"),
        Product("Nintendo Switch Controller", 60f, "nintendo_switch_controller"),
        Product("Dualsense", 90f, "dualsense"),
        Product("XBOX Series X Controller", 70f, "xbox_series_x_controller"),
        Product("Dualshock 4", 50f, "dualshock_4"),
        Product("XBOX 1 Controller", 45f, "xbox_1_controller"),
        Product("Nintendo Switch Controller", 60f, "nintendo_switch_controller"),
        Product("Dualsense", 90f, "dualsense"),
        Product("XBOX Series X Controller", 70f, "xbox_series_x_controller"),
        Product("Dualshock 4", 50f, "dualshock_4"),
        Product("XBOX 1 Controller", 45f, "xbox_1_controller"),
        Product("Nintendo Switch Controller", 60f, "nintendo_switch_controller")
    )
    val headsets = listOf(
        Product("HyperX Cloud 3", 200f, "hyperx_cloud_3"),
        Product("SteelSeries Arctis 7", 125f, "steelseries_arctis_7"),
        Product("HyperX Cloud Stinger", 50f, "hyperx_cloud_stinger"),
        Product("Astro A40", 90f, "astro_a40"),
        Product("Sony WH-1000XM4", 340f, "sony_wh_1000xm4"),
        Product("HyperX Cloud 3", 200f, "hyperx_cloud_3"),
        Product("SteelSeries Arctis 7", 125f, "steelseries_arctis_7"),
        Product("HyperX Cloud Stinger", 50f, "hyperx_cloud_stinger"),
        Product("Astro A40", 90f, "astro_a40"),
        Product("Sony WH-1000XM4", 340f, "sony_wh_1000xm4"),
        Product("HyperX Cloud 3", 200f, "hyperx_cloud_3"),
        Product("SteelSeries Arctis 7", 125f, "steelseries_arctis_7"),
        Product("HyperX Cloud Stinger", 50f, "hyperx_cloud_stinger"),
        Product("Astro A40", 90f, "astro_a40"),
        Product("Sony WH-1000XM4", 340f, "sony_wh_1000xm4")
    )
    val games = listOf(
        Product("Assassin's Creed Mirage", 40f, "assassin_s_creed_mirage"),
        Product("Elden Ring", 20f, "elden_ring"),
        Product("Farcry 6", 35f, "farcry_6"),
        Product("God of War Ragnarok", 60f, "god_of_war_ragnarok"),
        Product("GTA 5", 15f, "gta_5"),
        Product("Mortal Kombat 1", 45f, "mortal_kombat_1"),
        Product("Red Dead Redemption 2", 30f, "red_dead_redemption_2"),
        Product("Spider-Man 2", 60f, "spider_man_2"),
        Product("Alan Wake 2", 55f, "alan_wake_2"),
        Product("Call of Duty Black Ops 6", 60f, "call_of_duty_black_ops_6"),
        Product("Assassin's Creed Mirage", 40f, "assassin_s_creed_mirage"),
        Product("Elden Ring", 20f, "elden_ring"),
        Product("Farcry 6", 35f, "farcry_6"),
        Product("God of War Ragnarok", 60f, "god_of_war_ragnarok"),
        Product("GTA 5", 15f, "gta_5"),
        Product("Mortal Kombat 1", 45f, "mortal_kombat_1"),
        Product("Red Dead Redemption 2", 30f, "red_dead_redemption_2"),
        Product("Spider-Man 2", 60f, "spider_man_2"),
        Product("Alan Wake 2", 55f, "alan_wake_2"),
        Product("Call of Duty Black Ops 6", 60f, "call_of_duty_black_ops_6"),
        Product("Assassin's Creed Mirage", 40f, "assassin_s_creed_mirage"),
        Product("Elden Ring", 20f, "elden_ring"),
        Product("Farcry 6", 35f, "farcry_6"),
        Product("God of War Ragnarok", 60f, "god_of_war_ragnarok"),
        Product("GTA 5", 15f, "gta_5"),
        Product("Mortal Kombat 1", 45f, "mortal_kombat_1"),
        Product("Red Dead Redemption 2", 30f, "red_dead_redemption_2"),
        Product("Marvel's Spider-Man 2 PS5", 60f, "spider_man_2"),
        Product("Alan Wake 2", 55f, "alan_wake_2"),
        Product("Call of Duty Black Ops 6", 60f, "call_of_duty_black_ops_6")
    )
    val accessories = listOf(
        Product("Gaming Chair", 100f, "gaming_chair"),
        Product("Headset Stand", 10f, "headset_stand"),
        Product("Microphone", 25f, "microphone"),
        Product("Mouse & Keyboard Bundle", 50f, "mouse___keyboard_bundle"),
        Product("Logitech Steering Wheel", 350f, "steering_wheel"),
        Product("Gaming Chair", 100f, "gaming_chair"),
        Product("Headset Stand", 10f, "headset_stand"),
        Product("Microphone", 25f, "microphone"),
        Product("Mouse & Keyboard Bundle", 50f, "mouse___keyboard_bundle"),
        Product("Logitech Steering Wheel", 350f, "steering_wheel"),
        Product("Gaming Chair", 100f, "gaming_chair"),
        Product("Headset Stand", 10f, "headset_stand"),
        Product("Microphone", 25f, "microphone"),
        Product("Mouse & Keyboard Bundle", 50f, "mouse___keyboard_bundle"),
        Product("Logitech Steering Wheel", 350f, "steering_wheel")
        )
    fun getClickedCategory(name: String?): List<Product> {
        return when(name) {
            "Consoles" -> consoles
            "Controllers" -> controllers
            "Headsets" -> headsets
            "Games" -> games
            else -> accessories
        }
    }
}