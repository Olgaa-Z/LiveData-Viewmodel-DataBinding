package com.zfuncode.livedatasimple

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelProduct : ViewModel() {

    val list = arrayListOf(
        DataProduct("Andika", R.drawable.oke,"$34","description"),
        DataProduct("Avida Keyboard", R.drawable.oke,"$100","description"),
        DataProduct("SSD Samsung", R.drawable.oke,"$35","description"),
        DataProduct("Earbuds", R.drawable.oke,"$20","description"),
        DataProduct("Acer", R.drawable.oke,"$46","description"),
        DataProduct("Asus", R.drawable.oke,"$245","description")
    )

    val product :MutableLiveData<List<DataProduct>> = MutableLiveData()

    fun getProduct(){
        product.value = list
    }
}