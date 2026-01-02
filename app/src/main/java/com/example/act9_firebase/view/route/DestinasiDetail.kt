package com.example.act9_firebase.view.route

import com.example.act9_firebase.R

object DestinasiDetail : DestinasiNavigasi{
    override val route = "detail_siswa"
    override val titleRes= R.string.detail_siswa
    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}