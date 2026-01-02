package com.example.act9_firebase.view.route

import com.example.act9_firebase.R

object DestinasiEdit : DestinasiNavigasi{
    override val route = "item_edit"
    override val titleRes = R.string.edit_siswa
    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}