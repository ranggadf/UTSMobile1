package com.example.utspemrogramanmobile

data class Club(
    val name: String,
    val epl: Int,
    val fa: Int,
    val efl: Int,
    val LigaChampions: Int,
    val Ligaeropa: Int,
) {
    val totalTrophy: Int
        get() = epl + fa + efl + LigaChampions + Ligaeropa
}

// extension function recap
fun Club.recap(): String {
    return "$name berhasil meraih $epl trofi liga primer Inggris,$fa trofi FA, $efl trofi EFL, $LigaChampions trofi Liga Champions, dan $Ligaeropa trofi Liga Eropa"

}