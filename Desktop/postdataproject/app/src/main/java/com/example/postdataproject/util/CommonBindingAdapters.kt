package com.example.postdataproject.util

import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import coil.load
import coil.transform.CircleCropTransformation
import com.example.postdataproject.R


//@BindingAdapter("app:loadImage")
//fun bindImage(imgView: ImageView, imgUrl: String?) {
//    imgUrl?.let {
//        val imgUri = imgUrl.toUri().buildUpon().scheme("https").build()
//        imgView.load(imgUri)
//    }
//}


@BindingAdapter("app:loadImage")
fun loadImage(imageView: ImageView, url: String){
    imageView.load(url){
        crossfade(true)
        placeholder(R.drawable.ic_baseline_account_circle_24)
        error(R.drawable.ic_baseline_account_circle_24)
    }
}

//
//@BindingAdapter("app:loadCircleImage")
//fun loadCircleImage(imageView: ImageView, url: String){
//    imageView.load(url){
//        transformations(CircleCropTransformation())
//        crossfade(true)
//        placeholder(R.drawable.ic_baseline_image_24)
//        error(R.drawable.ic_baseline_broken_image_24)
//    }
//}