package com.example.lab_week_10.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TotalViewModel : ViewModel() {

    // 1. Buat _total (private) sebagai MutableLiveData
    //    Mutable = nilainya bisa diubah dari dalam ViewModel ini.
    //    Kita beri nilai awal 0.
    private val _total = MutableLiveData<Int>(0)

    // 2. Buat total (public) sebagai LiveData (tanpa "Mutable")
    //    Ini adalah versi "read-only" yang akan dibaca oleh MainActivity.
    val total: LiveData<Int> = _total

    // 3. Ubah fungsi increment untuk memperbarui .value dari LiveData
    fun incrementTotal() {
        // Ambil nilai saat ini, tambahkan 1, lalu set kembali
        // Gunakan .value!! untuk memastikan tidak null (karena kita beri nilai awal 0)
        _total.value = (_total.value ?: 0) + 1
    }
}