package com.gmail.bodziowaty6978.cleanarchitecturenoteapp.feature_note.domain.util

sealed class OrderType{
    object Ascending:OrderType()
    object Descending:OrderType()
}
