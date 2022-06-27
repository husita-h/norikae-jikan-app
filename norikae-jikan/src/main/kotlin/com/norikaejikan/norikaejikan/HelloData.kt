package com.norikaejikan.norikaejikan

import com.fasterxml.jackson.annotation.JsonCreator

data class HelloData @JsonCreator constructor(
    val id: Int,
    val title: String
)
