package com.example.act9_firebase.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.act9_firebase.modeldata.DetailSiswa
import com.example.act9_firebase.modeldata.UIStateSiswa
import com.example.act9_firebase.modeldata.toDataSiswa
import com.example.act9_firebase.repositori.RepositorySiswa


class EntryViewModel(private val repositorySiswa: RepositorySiswa): ViewModel(){
    var uiStateSiswa by mutableStateOf(UIStateSiswa())

    private fun validasiInput(uiState: DetailSiswa = uiStateSiswa.detailSiswa): Boolean
    {
        return with(uiState){
            nama.isNotBlank() && alamat.isNotBlank() && telpon.isNotBlank()
        }
    }
    fun updateUIState(detailSiswa: DetailSiswa){
        uiStateSiswa =
            UIStateSiswa(detailSiswa = detailSiswa, isEntryValid = validasiInput(detailSiswa))
    }
    suspend fun addSiswa(){
        if (validasiInput()){
            repositorySiswa.postDataSiswa(uiStateSiswa.detailSiswa.toDataSiswa())
        }
    }
}