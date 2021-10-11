package fr.jll.composetest.model

data class Param(
    var name: String,
    var value: String
)

data class ParamList(
    var params:List<Param>
)

data class Topic(
    var name: String,
    var params:List<Param>
)